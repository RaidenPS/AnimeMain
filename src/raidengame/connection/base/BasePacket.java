package raidengame.connection.base;

// Imports
import raidengame.connection.utils.ByteArray;
import lombok.Getter;
import lombok.Setter;
import com.google.protobuf.GeneratedMessageV3;

// Protobuf
import raidengame.cache.protobuf.PacketHeadOuterClass.PacketHead;

public class BasePacket {
    @Setter @Getter private int opcode;
    @Setter @Getter private byte[] header;
    @Getter private byte[] data;
    @Setter private boolean useDispatchKey;
    private boolean shouldBuildHeader = false;
    public boolean shouldEncrypt = true;

    public BasePacket(int opcode) {
        this.opcode = opcode;
    }

    public BasePacket(int opcode, boolean buildHeader) {
        this.opcode = opcode;
        this.shouldBuildHeader = buildHeader;
    }

    public BasePacket(int opcode, int clientSequence) {
        this.opcode = opcode;
        this.buildHeader(clientSequence);
    }

    public boolean useDispatchKey() {
        return useDispatchKey;
    }

    public boolean shouldBuildHeader() {
        return shouldBuildHeader;
    }

    public void setData(GeneratedMessageV3 proto) {
        this.data = proto.toByteArray();
    }

    public void buildHeader(int clientSequence) {
        if (this.getHeader() != null && clientSequence == 0) {
            return;
        }
        setHeader(
                PacketHead.newBuilder()
                        .setClientSequenceId(clientSequence)
                        .setSentMs(System.currentTimeMillis())
                        .setPacketId(this.getOpcode())
                        .setEnetChannelId(1)
                        .build()
                        .toByteArray());
    }

    private int getPacketLength() {
        /*
        Begin magic constant (2 bytes)
        opcode length (2 bytes)
        header length (2 bytes)
        data length (4 bytes)
        End magic constant (2 bytes)
         */
        return 2 + 2 + 2 + 4 + this.getHeader().length + this.getData().length + 2;
    }

    public byte[] build() {
        if (this.getHeader() == null) {
            this.header = new byte[0];
        }

        if (this.getData() == null) {
            this.data = new byte[0];
        }

        ByteArray bytes = new ByteArray(this.getPacketLength());
        bytes.writeUnsignedShort(0x4567);
        bytes.writeUnsignedShort(opcode);
        bytes.writeUnsignedShort(header.length);
        bytes.writeUnsignedInt(data.length);
        bytes.writeBytes(header);
        bytes.writeBytes(data);
        bytes.writeUnsignedShort(0x89ab);
        return bytes.toByteArray();
    }
}
