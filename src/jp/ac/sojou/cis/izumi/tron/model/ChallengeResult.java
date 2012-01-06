package jp.ac.sojou.cis.izumi.tron.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModelRef;

import com.google.appengine.api.datastore.Key;

@Model(schemaVersion = 1)
public class ChallengeResult implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    /**
     * 対戦が終了した場合にtrue
     */
    private boolean finished;

    /**
     * ボスとの対戦であればtrue
     */
    private boolean bossChallenge;

    /**
     * プレイヤー
     */
    @Attribute(lob = true)
    private UserAccount user1;

    private ModelRef<UserAccount> user1Ref = new ModelRef<UserAccount>(
        UserAccount.class);

    /**
     * 対戦した時間
     */
    private Date time;

    /**
     * 対戦相手
     */
    @Attribute(lob = true)
    private UserAccount user2;

    private ModelRef<UserAccount> user2Ref = new ModelRef<UserAccount>(
        UserAccount.class);

    /**
     * プレイヤーのボット
     */
    @Attribute(lob = true)
    private UserBot user1Bot;

    /**
     * 対戦相手のボット
     */
    @Attribute(lob = true)
    private UserBot user2Bot;

    /**
     * ボスのボット
     */
    @Attribute(lob = true)
    private BossBot bossBot;

    /**
     * 勝者
     */
    private String winner;

    /**
     * 結果の文字列
     */
    @Attribute(lob = true)
    private String result;

    /**
     * Returns the key.
     * 
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     * 
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     * 
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     * 
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ChallengeResult other = (ChallengeResult) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }

    public void setBossChallenge(boolean bossChallenge) {
        this.bossChallenge = bossChallenge;
    }

    public boolean isBossChallenge() {
        return bossChallenge;
    }

    public void setUser1Bot(UserBot user1Bot) {
        this.user1Bot = user1Bot;
    }

    public UserBot getUser1Bot() {
        return user1Bot;
    }

    public void setUser2Bot(UserBot user2Bot) {
        this.user2Bot = user2Bot;
    }

    public UserBot getUser2Bot() {
        return user2Bot;
    }

    public void setBossBot(BossBot bossBot) {
        this.bossBot = bossBot;
    }

    public BossBot getBossBot() {
        return bossBot;
    }

    public void setUser1(UserAccount user1) {
        this.user1 = user1;
    }

    public UserAccount getUser1() {
        return user1;
    }

    public void setUser2(UserAccount user2) {
        this.user2 = user2;
    }

    public UserAccount getUser2() {
        return user2;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public ModelRef<UserAccount> getUser1Ref() {
        return user1Ref;
    }

    public ModelRef<UserAccount> getUser2Ref() {
        return user2Ref;
    }

}
