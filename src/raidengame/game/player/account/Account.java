package raidengame.game.player.account;

// Imports
import raidengame.database.DatabaseHelper;
import raidengame.misc.classes.Randomizer;
import dev.morphia.annotations.*;
import lombok.*;
import java.util.*;

@Entity(value = "accounts", useDiscriminator = false)
public class Account {
    @Setter @Getter @Id private String id;
    @Setter @Getter @Indexed(options = @IndexOptions(unique = true)) @Collation(locale = "simple", caseLevel = true) private String username;
    @Setter private String password;
    @Getter @Setter private String email;
    @Getter @Setter private String token;
    @Getter private String sessionKey;
    private String deviceId;
    @Getter private int accountType;
    private boolean isBanned;
    @Getter private String banReason;
    @Getter private int banStartTime;
    @Getter private int banEndTime;
    private boolean deviceVerify;
    private String deviceTicket;
    private String deviceVerifyCode;
    private boolean personVerify;
    private String realnameOperation;
    private boolean phoneVerify;
    private boolean needReactivation;
    private String reactivateTicket;
    private boolean isGuest;
    @Getter private int regPlatformType;
    @Getter private String country;
    private String ipAddress;
    private String phoneNumber;
    private String realName;
    private String identityCard;
    private String facebookName;
    private String googleName;
    private String twitterName;
    private String appleName;
    private String sonyName;
    private String tapName;
    private String steamName;
    private String cxName;
    @Getter @Setter private boolean isSuspended;
    private String riskActionType;
    private String actionTicket;
    @Getter private String gameBiz;
    private String safeMobile;
    private String emailCaptcha;
    private String mobileCaptcha;
    private String gameCenterName;
    private String unmaskedEmail;
    private int unmaskedEmailType;
    private String maskedEmail;
    @Getter private List<String> permissions;

    @Deprecated
    public Account() {
        this.permissions = new ArrayList<>();
    }

    /**
     * Checks if a player is currently banned.
     * @return value (boolean)
     */
    public boolean isBanned() {
        if (banEndTime > 0 && banEndTime < System.currentTimeMillis() / 1000) {
            this.isBanned = false;
            this.banEndTime = 0;
            this.banStartTime = 0;
            this.banReason = null;
            this.saveAccount();
        }
        return isBanned;
    }

    /**
     * Adds a permission.
     * @param permission The given permission.
     */
    public void addPermission(String permission) {
        if (this.permissions.contains(permission)) return;
        this.permissions.add(permission);
    }

    /**
     * Clears all permissions.
     */
    public void clearPermission() {
        this.permissions.clear();
    }

    /**
     * Checks if this account have the permission.
     * @param permission The given permission
     * @return yes or no.
     */
    public boolean hasPermission(String permission) {
        if (this.permissions == null) return false;
        if (this.permissions.contains("*") && this.permissions.size() == 1) return true;

        return permissions.contains(permission);
    }

    /**
     * Removes any permission.
     * @param permission The given permission
     */
    public void removePermission(String permission) {
        if(!this.hasPermission(permission)) return;
        this.permissions.remove(permission);
    }

    /**
     * Sets the reactivation process.
     * @param reactivate_account value (boolean)
     */
    public void setReactivateAccount(boolean reactivate_account) {
        this.needReactivation = reactivate_account;
        this.reactivateTicket = (reactivate_account ?  Randomizer.generateActionToken(15) : "");
    }

    /**
     * Saves the account database.
     */
    public void saveAccount() {
        DatabaseHelper.saveAccount(this);
    }
}