package jp.ac.sojou.cis.izumi.tron.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-01-06 18:47:14")
/** */
public final class UserAccountMeta extends org.slim3.datastore.ModelMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount> email = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "email", "email");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount> password = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "password", "password");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount> userId = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "userId", "userId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.UserAccount, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final UserAccountMeta slim3_singleton = new UserAccountMeta();

    /**
     * @return the singleton
     */
    public static UserAccountMeta get() {
       return slim3_singleton;
    }

    /** */
    public UserAccountMeta() {
        super("UserAccount", jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);
    }

    @Override
    public jp.ac.sojou.cis.izumi.tron.model.UserAccount entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount model = new jp.ac.sojou.cis.izumi.tron.model.UserAccount();
        model.setEmail((java.lang.String) entity.getProperty("email"));
        model.setKey(entity.getKey());
        model.setPassword((java.lang.String) entity.getProperty("password"));
        model.setUserId((java.lang.String) entity.getProperty("userId"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("email", m.getEmail());
        entity.setProperty("password", m.getPassword());
        entity.setProperty("userId", m.getUserId());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
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
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = (jp.ac.sojou.cis.izumi.tron.model.UserAccount) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getEmail() != null){
            writer.setNextPropertyName("email");
            encoder0.encode(writer, m.getEmail());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getPassword() != null){
            writer.setNextPropertyName("password");
            encoder0.encode(writer, m.getPassword());
        }
        if(m.getUserId() != null){
            writer.setNextPropertyName("userId");
            encoder0.encode(writer, m.getUserId());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.ac.sojou.cis.izumi.tron.model.UserAccount jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.UserAccount m = new jp.ac.sojou.cis.izumi.tron.model.UserAccount();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("email");
        m.setEmail(decoder0.decode(reader, m.getEmail()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("password");
        m.setPassword(decoder0.decode(reader, m.getPassword()));
        reader = rootReader.newObjectReader("userId");
        m.setUserId(decoder0.decode(reader, m.getUserId()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}