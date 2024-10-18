package raidengame.connection.packets.send.notify;

// Imports
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;
import raidengame.enums.game.scene.EnterReason;
import raidengame.enums.game.scene.EnterType;
import raidengame.game.player.Player;
import raidengame.misc.classes.Randomizer;

// Protocol buffers
import raidengame.cache.protobuf.PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify;
import raidengame.cache.protobuf.VectorOuterClass.Vector;

public class PacketPlayerEnterSceneNotify extends BasePacket {
    // TODO: Finish PlayerEnterSceneNotify
    public PacketPlayerEnterSceneNotify(Player player, int worldType) {
        super(PacketIds.PlayerEnterSceneNotify);

        player.setEnterSceneToken(Randomizer.randomRange(1000, 99999));
        PlayerEnterSceneNotify proto = PlayerEnterSceneNotify.newBuilder()
                .setIsFirstLoginEnterScene(player.isFirstLoginEnterScene())
                .setSceneBeginTime(System.currentTimeMillis())
                .setSceneId(player.getSceneId())
                .setPrevSceneId(player.getPrevSceneId())
                .setEnterSceneToken(player.getEnterSceneToken())
                .setType(EnterType.SELF.getValue())
                .setTargetUid(player.getUid())
                .setPos(Vector.newBuilder().setX(0).setY(0).setZ(0).build())
                .setWorldLevel(player.getWorldLevel())
                .setWorldType(worldType)
                .setEnterReason(EnterReason.LOGIN.getValue())
                .setSceneTransaction(
                        "3-"
                                + player.getUid()
                                + "-"
                                + (int) (System.currentTimeMillis() / 1000)
                                + "-"
                                + 18402)
                .build();

        this.setData(proto);
    }
}
