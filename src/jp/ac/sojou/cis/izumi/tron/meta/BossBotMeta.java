package jp.ac.sojou.cis.izumi.tron.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-01-06 18:47:14")
/** */
public final class BossBotMeta extends org.slim3.datastore.ModelMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot> {

    /** */
    public final org.slim3.datastore.CoreUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, byte[]> classBytes = new org.slim3.datastore.CoreUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, byte[]>(this, "classBytes", "classBytes", byte[].class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot> className = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot>(this, "className", "className");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, java.lang.Integer> level = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, java.lang.Integer>(this, "level", "level", int.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot> name = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot>(this, "name", "name");

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot> sourceCode = new org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot>(this, "sourceCode", "sourceCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.BossBot, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final BossBotMeta slim3_singleton = new BossBotMeta();

    /**
     * @return the singleton
     */
    public static BossBotMeta get() {
       return slim3_singleton;
    }

    /** */
    public BossBotMeta() {
        super("BossBot", jp.ac.sojou.cis.izumi.tron.model.BossBot.class);
    }

    @Override
    public jp.ac.sojou.cis.izumi.tron.model.BossBot entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot model = new jp.ac.sojou.cis.izumi.tron.model.BossBot();
        model.setClassBytes(blobToBytes((com.google.appengine.api.datastore.Blob) entity.getProperty("classBytes")));
        model.setClassName((java.lang.String) entity.getProperty("className"));
        model.setKey(entity.getKey());
        model.setLevel(longToPrimitiveInt((java.lang.Long) entity.getProperty("level")));
        model.setName((java.lang.String) entity.getProperty("name"));
        model.setSourceCode(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("sourceCode")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("classBytes", bytesToBlob(m.getClassBytes()));
        entity.setProperty("className", m.getClassName());
        entity.setProperty("level", m.getLevel());
        entity.setProperty("name", m.getName());
        entity.setUnindexedProperty("sourceCode", stringToText(m.getSourceCode()));
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
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
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = (jp.ac.sojou.cis.izumi.tron.model.BossBot) model;
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
        writer.setNextPropertyName("level");
        encoder0.encode(writer, m.getLevel());
        if(m.getName() != null){
            writer.setNextPropertyName("name");
            encoder0.encode(writer, m.getName());
        }
        if(m.getSourceCode() != null){
            writer.setNextPropertyName("sourceCode");
            encoder0.encode(writer, m.getSourceCode());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.ac.sojou.cis.izumi.tron.model.BossBot jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.BossBot m = new jp.ac.sojou.cis.izumi.tron.model.BossBot();
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
        reader = rootReader.newObjectReader("level");
        m.setLevel(decoder0.decode(reader, m.getLevel()));
        reader = rootReader.newObjectReader("name");
        m.setName(decoder0.decode(reader, m.getName()));
        reader = rootReader.newObjectReader("sourceCode");
        m.setSourceCode(decoder0.decode(reader, m.getSourceCode()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}