package raidengame.connection.packets.send.login;

// Imports
import raidengame.configuration.GameConstants;
import raidengame.connection.Encryption;
import raidengame.connection.GameSession;
import raidengame.connection.SessionState;
import raidengame.connection.base.*;
import com.google.protobuf.ByteString;

// Protocol buffers
import raidengame.cache.protobuf.GetPlayerTokenReqOuterClass.GetPlayerTokenReq;
import raidengame.cache.protobuf.GetPlayerTokenRspOuterClass.GetPlayerTokenRsp;

public class PacketGetPlayerTokenRsp extends BasePacket {
    /**
     * Send GetPlayerTokenRsp packet without encryption seed. <b>RETCODE_SUCC</b>
     */
    public PacketGetPlayerTokenRsp(GameSession session, GetPlayerTokenReq request) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(PacketRetcodes.RETCODE_SUCC)
                        .setAccountUid(request.getAccountUid())
                        .setUid(session.getPlayer().getUid())
                        .setAccountType(request.getAccountType())
                        .setPsnId(request.getPsnId())
                        .setIsGuest(request.getIsGuest())
                        .setToken(session.getAccount().getToken())
                        .setIsProficientPlayer(session.getPlayer().getAvatars().getAvatarCount() > 0)
                        .setRegPlatform(session.getAccount().getRegPlatformType())
                        .setGameBiz(session.getAccount().getGameBiz())
                        .setPlatformType(request.getPlatformType())
                        .setChannelId(request.getChannelId())
                        .setSubChannelId(request.getSubChannelId())
                        .setClientIpStr(session.getAddress().getAddress().getHostAddress())
                        .setBirthday(request.getBirthday())
                        .setCountryCode(session.getAccount().getCountry())
                        .setAuthkey(session.getAccount().getSessionKey())
                        .setAuthkeyVer(request.getAuthkeyVer())
                        .setSecurityCmdBuffer(ByteString.copyFrom(Encryption.ENCRYPT_SEED_BUFFER))
                        .setSecretKeySeed(session.getEncryptSeed())
                        .setClientVersionRandomKey("c25-314dd05b0b5f")
                        .setKeyId(request.getKeyId())
                        .setSignType(request.getSignType())
                        .setAuthAppid("csc")
                        .build();

        this.setData(proto);
    }

    /**
     * Send GetPlayerTokenRsp packet by encrypted seed and sign. <b>RETCODE_SUCC</b>
     * @param encryptedSeed The encrypted seed.
     * @param encryptedSeedSign The encrypted sign.
     */
    public PacketGetPlayerTokenRsp(GameSession session, String encryptedSeed, String encryptedSeedSign, GetPlayerTokenReq request) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(PacketRetcodes.RETCODE_SUCC)
                        .setAccountUid(request.getAccountUid())
                        .setUid(session.getPlayer().getUid())
                        .setAccountType(request.getAccountType())
                        .setPsnId(request.getPsnId())
                        .setIsGuest(request.getIsGuest())
                        .setToken(session.getAccount().getToken())
                        .setIsProficientPlayer(session.getPlayer().getAvatars().getAvatarCount() > 0)
                        .setRegPlatform(session.getAccount().getRegPlatformType())
                        .setGameBiz(session.getAccount().getGameBiz())
                        .setPlatformType(request.getPlatformType())
                        .setChannelId(request.getChannelId())
                        .setSubChannelId(request.getSubChannelId())
                        .setClientIpStr(session.getAddress().getAddress().getHostAddress())
                        .setBirthday(request.getBirthday())
                        .setCountryCode(session.getAccount().getCountry())
                        .setAuthkey(session.getAccount().getSessionKey())
                        .setAuthkeyVer(request.getAuthkeyVer())
                        //.setIsLoginWhiteList(true)
                        .setSecurityCmdBuffer(ByteString.copyFrom(Encryption.ENCRYPT_SEED_BUFFER))
                        .setSecretKeySeed(session.getEncryptSeed())
                        .setClientVersionRandomKey("c25-314dd05b0b5f")
                        .setServerRandKey(encryptedSeed)
                        .setKeyId(request.getKeyId())
                        .setSign(encryptedSeedSign)
                        .setSignType(request.getSignType())
                        .setAuthAppid("csc")
                        .build();

        this.setData(proto);
    }

    /**
     * Send GetPlayerTokenRsp packet by ban time and reason. <b>RET_BLACK_UID</b>
     * @param banEndTime The end of sanction.
     * @param banReason  The sanction reason.
     */
    public PacketGetPlayerTokenRsp(GameSession session, GetPlayerTokenReq request, int banEndTime, String banReason) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        session.setState(SessionState.ACCOUNT_BANNED);
        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(PacketRetcodes.RET_BLACK_UID)
                        .setAccountUid(request.getAccountUid())
                        .setUid(session.getPlayer().getUid())
                        .setAuthkey(session.getAccount().getSessionKey())
                        .setAuthkeyVer(request.getAuthkeyVer())
                        .setSignType(request.getSignType())
                        .setClientIpStr(session.getAddress().getAddress().getHostAddress())
                        .setCountryCode(session.getAccount().getCountry())
                        .setGameBiz(session.getAccount().getGameBiz())
                        .setBlackUidEndTime(banEndTime)
                        .setMsg(banReason == null ? "FORBID_CHEATING_PLUGINS" : banReason)
                        .setPlatformType(request.getPlatformType())
                        .setRegPlatform(session.getAccount().getRegPlatformType())
                        .build();

        this.setData(proto);
    }

    /**
     * Send GetPlayerTokenRsp packet by given retcode.
     * @param retcode The return code.
     */
    public PacketGetPlayerTokenRsp(GameSession session, int retcode, String retMessage, GetPlayerTokenReq request) {
        super(PacketIds.GetPlayerTokenRsp, true);
        this.setUseDispatchKey(true);

        session.setState(SessionState.INACTIVE);
        GetPlayerTokenRsp proto =
                GetPlayerTokenRsp.newBuilder()
                        .setRetcode(retcode)
                        .setMsg(retMessage)
                        .setAccountUid(request.getAccountUid())
                        .setPsnId(request.getPsnId())
                        .setClientIpStr(session.getAddress().getAddress().getHostAddress())
                        .setChannelId(request.getChannelId())
                        .setSubChannelId(request.getSubChannelId())
                        .setPlatformType(request.getPlatformType())
                        .setRegMinorAge(GameConstants.MINIMUM_MINOR_AGE)
                        .build();

        session.logPacketRetcode(retcode, "Login", "OnPlayerLoginRsp (" + retMessage + ")");
        this.setData(proto);
    }
}