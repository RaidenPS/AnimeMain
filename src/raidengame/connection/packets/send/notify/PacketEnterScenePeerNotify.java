package raidengame.connection.packets.send.notify;

// Imports
import raidengame.connection.base.BasePacket;
import raidengame.connection.base.PacketIds;
import raidengame.game.player.Player;

// Protocol buffers
import raidengame.cache.protobuf.EnterScenePeerNotifyOuterClass.EnterScenePeerNotify;

public class PacketEnterScenePeerNotify extends BasePacket {
    // TODO: Finish EnterScenePeerNotify
    public PacketEnterScenePeerNotify(Player player) {
        super(PacketIds.EnterScenePeerNotify);

        EnterScenePeerNotify proto =
                EnterScenePeerNotify.newBuilder()
                        .setDestSceneId(player.getSceneId())
                        //.setPeerId(player.getPeerId())
                        //.setHostPeerId(player.getWorld().getHost().getPeerId())
                        .setEnterSceneToken(player.getEnterSceneToken())
                        .build();

        this.setData(proto);
    }
}
