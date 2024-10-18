package raidengame.connection.packets.send.login;

// Imports
import raidengame.configuration.ConfigManager;
import raidengame.connection.Encryption;
import raidengame.connection.GameSession;
import raidengame.connection.SessionState;
import raidengame.connection.base.*;
import com.google.protobuf.ByteString;

// Protocol buffers
import raidengame.cache.protobuf.PlayerLoginReqOuterClass.PlayerLoginReq;
import raidengame.cache.protobuf.PlayerLoginRspOuterClass.PlayerLoginRsp;
import raidengame.cache.protobuf.QueryCurrRegionHttpRspOuterClass.QueryCurrRegionHttpRsp;
import raidengame.cache.protobuf.RegionInfoOuterClass.RegionInfo;
import raidengame.cache.protobuf.ResVersionConfigOuterClass.ResVersionConfig;
import raidengame.cache.protobuf.StopServerInfoOuterClass.StopServerInfo;

public class PacketPlayerLoginRsp extends BasePacket {
    private static QueryCurrRegionHttpRsp regionCache;

    /**
     * Additional function to retrieve the region information.
     * @return The region information from QueryCurrRegionHttpRsp
     */
    public RegionInfo retrieveRegionInformation(String game_biz) {
        if(regionCache == null) {
            regionCache =
                    QueryCurrRegionHttpRsp.newBuilder()
                        .setRetcode(PacketRetcodes.RETCODE_SUCC)
                        .setRegionInfo(
                                RegionInfo.newBuilder()
                                        .setGateserverIp(ConfigManager.serverConfig.kcpInfo.gateserverIP)
                                        .setGateserverPort(ConfigManager.serverConfig.kcpInfo.gateserverPort)
                                        .setGameBiz(game_biz)
                                        .setDataUrl("https://autopatchcn.yuanshen.com/client_design_data/5.0_live")
                                        .setResourceUrl("https://autopatchcn.yuanshen.com/client_game_res/5.0_live")
                                        .setResourceUrlBak("5.0_live")
                                        .setNextResourceUrl("https://autopatchcn.yuanshen.com/client_game_res/5.0_live")
                                        .setClientDataVersion(26487341)
                                        .setClientSilenceDataVersion(26368837)
                                        .setClientVersionSuffix("57a90bbd52")
                                        .setClientSilenceVersionSuffix("0af120923b")
                                        .setAreaType("JP")
                                        .setPayCallbackUrl("http://10.101.11.129:22601/recharge")
                                        .setCdkeyUrl("https://hk4e-api.mihoyo.com/common/apicdkey/api/exchangeCdkey?sign_type=2&auth_appid=apicdkey&authkey_ver=1")
                                        .setClientDataMd5("{\"remoteName\": \"data_versions\", \"md5\": \"88a0d1f6825ec3b6aaf9ea39a02f78da\", \"hash\": \"a72baf3b5c76f0ac\", \"fileSize\": 68545}\r\n{\"remoteName\": \"data_versions_medium\", \"md5\": \"9429b4e9dd8cbdaf19c41ff05f18b384\", \"hash\": \"a79950c775cf1630\", \"fileSize\": 6662}")
                                        .setClientSilenceDataMd5("{\"remoteName\": \"data_versions\", \"md5\": \"8ae3d12ddeffa27349ab306ce05ec0b7\", \"hash\": \"ef8cb53633584c7a\", \"fileSize\": 522}")
                                        .setResVersionConfig(
                                                ResVersionConfig.newBuilder()
                                                        .setRelogin(true)
                                                        .setMd5("{\"remoteName\": \"base_revision\", \"md5\": \"149cad27b543e345df504a496949ec7d\", \"fileSize\": 19}")
                                                        .setVersion(26458901)
                                                        .setReleaseTotalSize("0")
                                                        .setVersionSuffix("befdda25ff")
                                                        .setBranch("5.0_live")
                                                        .buildPartial())
                                        .build())
                        .setClientSecretKey(ByteString.copyFrom(Encryption.DISPATCH_SEED))
                        .build();
        }
        return regionCache.getRegionInfo();
    }

    /**
     * Send PlayerLoginRsp packet. <b>RETCODE_SUCC</b>
     */
    public PacketPlayerLoginRsp(GameSession session, PlayerLoginReq req) {
        super(PacketIds.PlayerLoginRsp);

        RegionInfo regionInfo = this.retrieveRegionInformation(session.getAccount().getGameBiz());

        // Send the login packet.
        PlayerLoginRsp proto =
            PlayerLoginRsp.newBuilder()
                    .setRetcode(PacketRetcodes.RETCODE_SUCC)
                    .setGameBiz(session.getAccount().getGameBiz())
                    .setBirthday(req.getBirthday())
                    .setIsTransfer(req.getIsTransfer())
                    .setRegisterCps(req.getCps())
                    .setCountryCode(req.getCountryCode())
                    .setLoginRand(req.getLoginRand())
                    .setIsScOpen(true)
                    .setScInfo(ByteString.copyFrom(new byte[] {}))
                    .setAbilityHashCode(1844674)
                    .setIsEnableClientHashDebug(true)
                    .setClientDataVersion(regionInfo.getClientDataVersion())
                    .setClientMd5(regionInfo.getClientDataMd5())
                    .setClientSilenceDataVersion(regionInfo.getClientSilenceDataVersion())
                    .setClientSilenceMd5(regionInfo.getClientSilenceDataMd5())
                    .setClientSilenceVersionSuffix(regionInfo.getClientSilenceVersionSuffix())
                    .setClientVersionSuffix(regionInfo.getClientVersionSuffix())
                    .setNextResourceUrl(regionInfo.getNextResourceUrl())
                    .setResVersionConfig(regionInfo.getResVersionConfig())
                    .setNextResVersionConfig(regionInfo.getNextResVersionConfig())
                    .setPlayerDataVersion(req.getClientDataVersion())
                    .build();

        this.setData(proto);
    }

    /**
     * Send PlayerLoginRsp packet. <b>RET_GAME_UNDER_MAINTENANCE</b>
     */
    public PacketPlayerLoginRsp(GameSession session) {
        super(PacketIds.PlayerLoginRsp);

        session.setState(SessionState.INACTIVE);
        PlayerLoginRsp proto =
            PlayerLoginRsp.newBuilder()
                    .setRetcode(PacketRetcodes.RET_GAME_UNDER_MAINTENANCE)
                    .setMsg("Under Maintenance")
                    .setStopServer(StopServerInfo.newBuilder()
                            .setStopBeginTime(ConfigManager.serverConfig.maintenance.start_time)
                            .setStopEndTime(ConfigManager.serverConfig.maintenance.end_time)
                            .setContentMsg(ConfigManager.serverConfig.maintenance.message)
                            .setUrl(ConfigManager.serverConfig.maintenance.url)
                            .buildPartial())
                    .build();

        this.setData(proto);
    }

    /**
     * Send PlayerLoginRsp packet by given retcode.
     * @param retcode The return code.
     */
    public PacketPlayerLoginRsp(GameSession session, PlayerLoginReq req, int retcode, String retMessage) {
        super(PacketIds.PlayerLoginRsp);

        session.setState(SessionState.INACTIVE);
        PlayerLoginRsp proto =
                PlayerLoginRsp.newBuilder()
                        .setRetcode(retcode)
                        .setMsg(retMessage)
                        .setGameBiz(session.getAccount().getGameBiz())
                        .setRegisterCps(req.getCps())
                        .setCountryCode(req.getCountryCode())
                        .build();

        this.setData(proto);
        session.logPacketRetcode(retcode, "Login", "PlayerLoginRsp (" + retMessage + ")");
    }
}
