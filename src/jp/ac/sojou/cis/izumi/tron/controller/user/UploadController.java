package jp.ac.sojou.cis.izumi.tron.controller.user;

import java.text.SimpleDateFormat;
import java.util.Date;

import jp.ac.sojou.cis.izumi.tron.dao.UserBotDao;
import jp.ac.sojou.cis.izumi.tron.model.UserBot;
import jp.ac.sojou.cis.izumi.tron.service.CompileService;

import org.slim3.controller.Navigation;
import org.slim3.controller.upload.FileItem;

public class UploadController extends UserBaseController {

    private UserBotDao ubDao = new UserBotDao();
    private CompileService cs = new CompileService();

    @Override
    public Navigation run2() throws Exception {

        String name = requestScope("name");

        FileItem formFile = requestScope("botFile");
        if (formFile == null) {
            return forward("uploadForm.jsp");
        }
        String src = new String(formFile.getData(), "UTF-8");
        // System.out.println(src);

        Date d = new Date();
        if (name.isEmpty()) {
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd-HHmmss");
            name = formFile.getFileName() + "_" + df.format(d);
        }

        String fqcn = CompileService.getFQCN(src);
        byte[] ba = cs.compile(fqcn, src);

        UserBot ub = new UserBot();
        ub.setName(name);
        ub.setTime(d);
        ub.setSourceCode(src);
        ub.getUserRef().setModel(user);
        ub.setClassBytes(ba);
        ub.setClassName(fqcn);

        ubDao.put(ub);

        return forward("main");
    }
}
