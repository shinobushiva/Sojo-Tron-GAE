package jp.ac.sojou.cis.izumi.tron.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import jp.ac.sojou.cis.izumi.tron.model.BossBot;

import org.slim3.datastore.Datastore;

public class CompileService {

    private static final String HOST_URL = "http://202.16.132.23/apps";

    public List<BossBot> getList() {
        return Datastore.query(BossBot.class).asList();
    }

    public byte[] compile(String source) {
        return compile(getFQCN(source), source);
    }

    public byte[] compile(String fqcn, String source) {

        System.out.println("Compiling " + fqcn);
        try {
            URL url = new URL(HOST_URL + "/SojoTronCompiler/CompilerServlet");
            URLConnection uc = url.openConnection();
            uc.setDoOutput(true);// POST可能にする

            OutputStream os = uc.getOutputStream();// POST用のOutputStreamを取得
            // POSTするデータ
            String postStr =
                ""
                    + "source="
                    + URLEncoder.encode(source, "UTF-8")
                    + "&"
                    + "className="
                    + URLEncoder.encode(fqcn, "UTF-8");
            PrintStream ps = new PrintStream(os);
            ps.print(postStr);// データをPOSTする
            ps.close();

            System.out.println("post!");

            InputStream is = uc.getInputStream();// POSTした結果を取得
            ObjectInputStream dec =
                new ObjectInputStream(new BufferedInputStream(is));
            byte[] clsBa1 = (byte[]) dec.readObject();
            dec.close();

            System.out.println("Compiled! " + fqcn);

            return clsBa1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getFQCN(String src) {
        try {
            // read package name from source code
            int mode = 1;
            String packageName = "";
            String cName = "";
            BufferedReader br = new BufferedReader(new StringReader(src));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.indexOf("*/") != -1) {
                    mode = 1;
                } else if (line.indexOf("/*") != -1) {
                    mode = 2;
                } else if (mode == 2) {
                } else if (line.indexOf("//") != -1) {
                    line = line.replaceAll("//.*", "");
                }
                if (mode == 1) {
                    if (line.contains("package")) {
                        packageName =
                            line.replace("package", "").replace(";", "").trim();
                    }
                    if (line.contains("class")) {
                        String[] split = line.split(" ");
                        for (int i = 0; i < split.length; i++) {
                            if (split[i].trim().equals("class")) {
                                cName = split[i + 1];
                                break;
                            }
                        }
                    }
                }
            }
            String name = null;
            if (packageName.isEmpty()) {
                name = cName;
            } else {
                name = packageName + "." + cName;
            }

            return name;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static class TronClassLoader extends ClassLoader {

        private Map<String, byte[]> map;

        public TronClassLoader(Map<String, byte[]> map, ClassLoader p) {
            super(p);
            this.map = map;
        }

        public Class<?> findClass(String name) {
            byte[] b = loadClassData(name);
            return defineClass(name, b, 0, b.length);
        }

        private byte[] loadClassData(String name) {
            return map.get(name);
        }
    }

}
