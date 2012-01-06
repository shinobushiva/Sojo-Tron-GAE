package jp.ac.sojou.cis.izumi.tron.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-01-05 00:51:24")
/** */
public final class UserBotMeta extends org.slim3.datastore.ModelMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot> {

    /** */
    public final org.slim3.datastore.CoreUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, byte[]> classBytes = new org.slim3.datastore.CoreUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, byte[]>(this, "classBytes", "classBytes", byte[].class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot> className = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot>(this, "className", "className");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot> name = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot>(this, "name", "name");

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot> sourceCode = new org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot>(this, "sourceCode", "sourceCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, java.util.Date> time = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, java.util.Date>(this, "time", "time", java.util.Date.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount> userRef = new org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "userRef", "userRef", org.slim3.datastore.ModelRef.class, jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserBot, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UserBotMeta slim3_singleton = new UserBotMeta();

    /**
     * @return the singleton
     */
    public static UserBotMeta get() {
       return slim3_singleton;
    }

    /** */
    public UserBotMeta() {
        super("UserBot", jp.ac.sojou.cis.izumi.tron.model.UserBot.class);
    }

    @Override
    public jp.ac.sojou.cis.izumi.tron.model.UserBot entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot model = new jp.ac.sojou.cis.izumi.tron.model.UserBot();
        model.setClassBytes(blobToBytes((com.google.appengine.api.datastore.Blob) entity.getProperty("classBytes")));
        model.setClassName((java.lang.String) entity.getProperty("className"));
        model.setKey(entity.getKey());
        model.setName((java.lang.String) entity.getProperty("name"));
        model.setSourceCode(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("sourceCode")));
        model.setTime((java.util.Date) entity.getProperty("time"));
        if (model.getUserRef() == null) {
            throw new NullPointerException("The property(userRef) is null.");
        }
        model.getUserRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("userRef"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("classBytes", bytesToBlob(m.getClassBytes()));
        entity.setProperty("className", m.getClassName());
        entity.setProperty("name", m.getName());
        entity.setUnindexedProperty("sourceCode", stringToText(m.getSourceCode()));
        entity.setProperty("time", m.getTime());
        if (m.getUserRef() == null) {
            throw new NullPointerException("The property(userRef) must not be null.");
        }
        entity.setProperty("userRef", m.getUserRef().getKey());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        if (m.getUserRef() == null) {
            throw new NullPointerException("The property(userRef) must not be null.");
        }
        m.getUserRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = (jp.ac.sojou.cis.izumi.tron.model.UserBot) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getClassBytes() != null){
            writer.setNextPropertyName("classBytes");
            encoder0.encode(writer, new com.google.appengine.api.datastore.ShortBlob(m.getClassBytes()));
        }
        if(m.getClassName() != null){
            writer.setNextPropertyName("className");
            encoder0.encode(writer, m.getClassName());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getName() != null){
            writer.setNextPropertyName("name");
            encoder0.encode(writer, m.getName());
        }
        if(m.getSourceCode() != null){
            writer.setNextPropertyName("sourceCode");
            encoder0.encode(writer, m.getSourceCode());
        }
        if(m.getTime() != null){
            writer.setNextPropertyName("time");
            encoder0.encode(writer, m.getTime());
        }
        if(m.getUserRef() != null && m.getUserRef().getKey() != null){
            writer.setNextPropertyName("userRef");
            encoder0.encode(writer, m.getUserRef(), maxDepth, currentDepth);
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.ac.sojou.cis.izumi.tron.model.UserBot jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.UserBot m = new jp.ac.sojou.cis.izumi.tron.model.UserBot();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("classBytes");
        if(m.getClassBytes() != null){
            m.setClassBytes(decoder0.decode(reader, new com.google.appengine.api.datastore.ShortBlob(m.getClassBytes())).getBytes());
        } else{
            com.google.appengine.api.datastore.ShortBlob v = decoder0.decode(reader, (com.google.appengine.api.datastore.ShortBlob)null);
            if(v != null){
                m.setClassBytes(v.getBytes());
            } else{
                m.setClassBytes(null);
            }
        }
        reader = rootReader.newObjectReader("className");
        m.setClassName(decoder0.decode(reader, m.getClassName()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("name");
        m.setName(decoder0.decode(reader, m.getName()));
        reader = rootReader.newObjectReader("sourceCode");
        m.setSourceCode(decoder0.decode(reader, m.getSourceCode()));
        reader = rootReader.newObjectReader("time");
        m.setTime(decoder0.decode(reader, m.getTime()));
        reader = rootReader.newObjectReader("userRef");
        decoder0.decode(reader, m.getUserRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}