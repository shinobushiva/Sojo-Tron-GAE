package jp.ac.sojou.cis.izumi.tron.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-01-06 18:47:14")
/** */
public final class ChallengeResultMeta extends org.slim3.datastore.ModelMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult> {

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.BossBot> bossBot = new org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.BossBot>(this, "bossBot", "bossBot", jp.ac.sojou.cis.izumi.tron.model.BossBot.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Boolean> bossChallenge = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Boolean>(this, "bossChallenge", "bossChallenge", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Boolean> finished = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Boolean>(this, "finished", "finished", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult> result = new org.slim3.datastore.StringUnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult>(this, "result", "result");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.util.Date> time = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.util.Date>(this, "time", "time", java.util.Date.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserAccount> user1 = new org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "user1", "user1", jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserBot> user1Bot = new org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserBot>(this, "user1Bot", "user1Bot", jp.ac.sojou.cis.izumi.tron.model.UserBot.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount> user1Ref = new org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "user1Ref", "user1Ref", org.slim3.datastore.ModelRef.class, jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserAccount> user2 = new org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "user2", "user2", jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserBot> user2Bot = new org.slim3.datastore.UnindexedAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, jp.ac.sojou.cis.izumi.tron.model.UserBot>(this, "user2Bot", "user2Bot", jp.ac.sojou.cis.izumi.tron.model.UserBot.class);

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount> user2Ref = new org.slim3.datastore.ModelRefAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, org.slim3.datastore.ModelRef<jp.ac.sojou.cis.izumi.tron.model.UserAccount>, jp.ac.sojou.cis.izumi.tron.model.UserAccount>(this, "user2Ref", "user2Ref", org.slim3.datastore.ModelRef.class, jp.ac.sojou.cis.izumi.tron.model.UserAccount.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult> winner = new org.slim3.datastore.StringAttributeMeta<jp.ac.sojou.cis.izumi.tron.model.ChallengeResult>(this, "winner", "winner");

    private static final ChallengeResultMeta slim3_singleton = new ChallengeResultMeta();

    /**
     * @return the singleton
     */
    public static ChallengeResultMeta get() {
       return slim3_singleton;
    }

    /** */
    public ChallengeResultMeta() {
        super("ChallengeResult", jp.ac.sojou.cis.izumi.tron.model.ChallengeResult.class);
    }

    @Override
    public jp.ac.sojou.cis.izumi.tron.model.ChallengeResult entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult model = new jp.ac.sojou.cis.izumi.tron.model.ChallengeResult();
        jp.ac.sojou.cis.izumi.tron.model.BossBot _bossBot = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("bossBot"));
        model.setBossBot(_bossBot);
        model.setBossChallenge(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("bossChallenge")));
        model.setFinished(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("finished")));
        model.setKey(entity.getKey());
        model.setResult(textToString((com.google.appengine.api.datastore.Text) entity.getProperty("result")));
        model.setTime((java.util.Date) entity.getProperty("time"));
        jp.ac.sojou.cis.izumi.tron.model.UserAccount _user1 = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("user1"));
        model.setUser1(_user1);
        jp.ac.sojou.cis.izumi.tron.model.UserBot _user1Bot = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("user1Bot"));
        model.setUser1Bot(_user1Bot);
        if (model.getUser1Ref() == null) {
            throw new NullPointerException("The property(user1Ref) is null.");
        }
        model.getUser1Ref().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("user1Ref"));
        jp.ac.sojou.cis.izumi.tron.model.UserAccount _user2 = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("user2"));
        model.setUser2(_user2);
        jp.ac.sojou.cis.izumi.tron.model.UserBot _user2Bot = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("user2Bot"));
        model.setUser2Bot(_user2Bot);
        if (model.getUser2Ref() == null) {
            throw new NullPointerException("The property(user2Ref) is null.");
        }
        model.getUser2Ref().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("user2Ref"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        model.setWinner((java.lang.String) entity.getProperty("winner"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setUnindexedProperty("bossBot", serializableToBlob(m.getBossBot()));
        entity.setProperty("bossChallenge", m.isBossChallenge());
        entity.setProperty("finished", m.isFinished());
        entity.setUnindexedProperty("result", stringToText(m.getResult()));
        entity.setProperty("time", m.getTime());
        entity.setUnindexedProperty("user1", serializableToBlob(m.getUser1()));
        entity.setUnindexedProperty("user1Bot", serializableToBlob(m.getUser1Bot()));
        if (m.getUser1Ref() == null) {
            throw new NullPointerException("The property(user1Ref) must not be null.");
        }
        entity.setProperty("user1Ref", m.getUser1Ref().getKey());
        entity.setUnindexedProperty("user2", serializableToBlob(m.getUser2()));
        entity.setUnindexedProperty("user2Bot", serializableToBlob(m.getUser2Bot()));
        if (m.getUser2Ref() == null) {
            throw new NullPointerException("The property(user2Ref) must not be null.");
        }
        entity.setProperty("user2Ref", m.getUser2Ref().getKey());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("winner", m.getWinner());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        if (m.getUser1Ref() == null) {
            throw new NullPointerException("The property(user1Ref) must not be null.");
        }
        m.getUser1Ref().assignKeyIfNecessary(ds);
        if (m.getUser2Ref() == null) {
            throw new NullPointerException("The property(user2Ref) must not be null.");
        }
        m.getUser2Ref().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
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
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = (jp.ac.sojou.cis.izumi.tron.model.ChallengeResult) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getBossBot() != null){
            writer.setNextPropertyName("bossBot");
            encoder0.encode(writer, m.getBossBot());
        }
        writer.setNextPropertyName("bossChallenge");
        encoder0.encode(writer, m.isBossChallenge());
        writer.setNextPropertyName("finished");
        encoder0.encode(writer, m.isFinished());
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getResult() != null){
            writer.setNextPropertyName("result");
            encoder0.encode(writer, m.getResult());
        }
        if(m.getTime() != null){
            writer.setNextPropertyName("time");
            encoder0.encode(writer, m.getTime());
        }
        if(m.getUser1() != null){
            writer.setNextPropertyName("user1");
            encoder0.encode(writer, m.getUser1());
        }
        if(m.getUser1Bot() != null){
            writer.setNextPropertyName("user1Bot");
            encoder0.encode(writer, m.getUser1Bot());
        }
        if(m.getUser1Ref() != null && m.getUser1Ref().getKey() != null){
            writer.setNextPropertyName("user1Ref");
            encoder0.encode(writer, m.getUser1Ref(), maxDepth, currentDepth);
        }
        if(m.getUser2() != null){
            writer.setNextPropertyName("user2");
            encoder0.encode(writer, m.getUser2());
        }
        if(m.getUser2Bot() != null){
            writer.setNextPropertyName("user2Bot");
            encoder0.encode(writer, m.getUser2Bot());
        }
        if(m.getUser2Ref() != null && m.getUser2Ref().getKey() != null){
            writer.setNextPropertyName("user2Ref");
            encoder0.encode(writer, m.getUser2Ref(), maxDepth, currentDepth);
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        if(m.getWinner() != null){
            writer.setNextPropertyName("winner");
            encoder0.encode(writer, m.getWinner());
        }
        writer.endObject();
    }

    @Override
    protected jp.ac.sojou.cis.izumi.tron.model.ChallengeResult jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.ac.sojou.cis.izumi.tron.model.ChallengeResult m = new jp.ac.sojou.cis.izumi.tron.model.ChallengeResult();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("bossBot");
        m.setBossBot(decoder0.decode(reader, m.getBossBot(), jp.ac.sojou.cis.izumi.tron.model.BossBot.class));
        reader = rootReader.newObjectReader("bossChallenge");
        m.setBossChallenge(decoder0.decode(reader, m.isBossChallenge()));
        reader = rootReader.newObjectReader("finished");
        m.setFinished(decoder0.decode(reader, m.isFinished()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("result");
        m.setResult(decoder0.decode(reader, m.getResult()));
        reader = rootReader.newObjectReader("time");
        m.setTime(decoder0.decode(reader, m.getTime()));
        reader = rootReader.newObjectReader("user1");
        m.setUser1(decoder0.decode(reader, m.getUser1(), jp.ac.sojou.cis.izumi.tron.model.UserAccount.class));
        reader = rootReader.newObjectReader("user1Bot");
        m.setUser1Bot(decoder0.decode(reader, m.getUser1Bot(), jp.ac.sojou.cis.izumi.tron.model.UserBot.class));
        reader = rootReader.newObjectReader("user1Ref");
        decoder0.decode(reader, m.getUser1Ref(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("user2");
        m.setUser2(decoder0.decode(reader, m.getUser2(), jp.ac.sojou.cis.izumi.tron.model.UserAccount.class));
        reader = rootReader.newObjectReader("user2Bot");
        m.setUser2Bot(decoder0.decode(reader, m.getUser2Bot(), jp.ac.sojou.cis.izumi.tron.model.UserBot.class));
        reader = rootReader.newObjectReader("user2Ref");
        decoder0.decode(reader, m.getUser2Ref(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        reader = rootReader.newObjectReader("winner");
        m.setWinner(decoder0.decode(reader, m.getWinner()));
        return m;
    }
}