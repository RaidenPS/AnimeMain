package raidengame.database.entities;

// Imports
import raidengame.database.DatabaseHelper;
import raidengame.enums.player.*;
import raidengame.game.player.Player;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.*;

// Protocol buffers
import raidengame.cache.protobuf.PlayerLoginReqOuterClass.PlayerLoginReq;

@Entity(value = "loginlogs", useDiscriminator = false)
public class GameLog {
    @Getter @Setter @Id private int id;
    @Getter @Setter private String username;
    @Getter @Setter private String account_id;
    @Getter @Setter private String email;
    @Getter @Setter private String token;
    @Getter @Setter private String client_version;
    @Getter @Setter private String device_fingerprint;
    @Getter @Setter private String device_name;
    @Getter @Setter private String device_id;
    @Getter @Setter private String device_uuid;
    @Getter @Setter private String device_info;
    @Getter @Setter private AccountType account_type;
    @Getter @Setter private ChannelType channel_id;
    @Getter @Setter private int sub_channel_id;
    @Getter @Setter private String country_code;
    @Getter @Setter private String ip_address;
    @Getter @Setter private String ip_hostname;
    @Getter @Setter private String cps;
    @Getter @Setter private LanguageType language_type;
    @Getter @Setter private boolean is_guest;
    @Getter @Setter private boolean is_editor;
    @Getter @Setter private String birthday;
    @Getter @Setter private String online_id;
    @Getter @Setter private String psn_id;
    @Getter @Setter private String psn_region;
    @Getter @Setter private String system_version;
    @Getter @Setter private PlatformType platform_type;
    @Getter @Setter private PlatformType reg_platform_type;

    public GameLog(Player player, PlayerLoginReq req, boolean saveLog) {
        this.id = player.getId();
        this.username = player.getNickname();
        this.account_id = player.getAccount().getId();
        this.client_version = req.getClientVersion();
        this.email = player.getAccount().getEmail();
        this.token = player.getAccount().getToken();
        this.device_fingerprint = req.getDeviceFingerprint();
        this.device_name = req.getDeviceName();
        this.device_id = req.getDeviceId();
        this.device_uuid = req.getDeviceUuid();
        this.device_info = req.getDeviceInfo();
        this.account_type = AccountType.fromValue(player.getAccount().getAccountType());
        this.channel_id = ChannelType.fromValue(req.getChannelId());
        this.sub_channel_id = req.getSubChannelId();
        this.country_code = req.getCountryCode();
        this.ip_address = player.getSession().getAddress().getAddress().getHostAddress();
        this.ip_hostname = player.getSession().getAddress().getHostName();
        this.cps = req.getCps();
        this.language_type = LanguageType.fromValue(req.getLanguageType());
        this.is_guest = req.getIsGuest();
        this.is_editor = req.getIsEditor();
        this.birthday = req.getBirthday();
        this.online_id = req.getOnlineId();
        this.psn_id = req.getPsnId();
        this.psn_region = req.getPsnRegion();
        this.system_version = req.getSystemVersion();
        this.platform_type = PlatformType.fromValue(req.getPlatformType());
        this.reg_platform_type = PlatformType.fromValue(req.getRegPlatform());
    }

    public void save() {
        DatabaseHelper.saveGameAsync(this);
    }
}
