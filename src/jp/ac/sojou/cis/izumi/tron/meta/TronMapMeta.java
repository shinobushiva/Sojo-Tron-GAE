package jp.ac.sojou.cis.izumi.tron.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-01-04 17:37:05")
/** */
public final class TronMapMeta extends org.slim3.datastore.ModelMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap> map = new org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap>(this, "map", "map");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap> name = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap>(this, "name", "name");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.TronMap, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final TronMapMeta slim3_singleton = new TronMapMeta();

    /**
     * @return the singleton
     */
    public static TronMapMeta get() {
       return slim3_singleton;
    }

    /** */
    public TronMapMeta() {
        super("TronMap", jp.ac.sojou.cis.izumi.tron.model.TronMap.class);
    }

    @Override
    public jp.ac.sojou.cis.izumi.tron.model.TronMap entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap model = new jp.ac.sojou.cis.izumi.tron.model.TronMap();
        model.setKey(entity.getKey());
        model.setMap(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("map")));
        model.setName((java.lang.String) entity.getProperty("name"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("map", stringToText(m.getMap()));
        entity.setProperty("name", m.getName());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
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
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = (jp.ac.sojou.cis.izumi.tron.model.TronMap) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getMap() != null){
            writer.setNextPropertyName("map");
            encoder0.encode(writer, m.getMap());
        }
        if(m.getName() != null){
            writer.setNextPropertyName("name");
            encoder0.encode(writer, m.getName());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.ac.sojou.cis.izumi.tron.model.TronMap jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.TronMap m = new jp.ac.sojou.cis.izumi.tron.model.TronMap();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("map");
        m.setMap(decoder0.decode(reader, m.getMap()));
        reader = rootReader.newObjectReader("name");
        m.setName(decoder0.decode(reader, m.getName()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}