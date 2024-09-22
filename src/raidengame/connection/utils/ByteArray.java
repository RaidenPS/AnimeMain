package raidengame.connection.utils;

// Imports
import java.io.ByteArrayOutputStream;

public class ByteArray {
    private final ByteArrayOutputStream bytes;

    public ByteArray(int length) {
        this.bytes = new ByteArrayOutputStream(length);
    }

    public ByteArray() {this.bytes = new ByteArrayOutputStream(128);}

    public byte[] toByteArray() {
        return this.bytes.toByteArray();
    }

    public void writeByte(byte b) {
        this.bytes.write(b);
    }

    public void writeUnsignedByte(byte b) {
        this.bytes.write(b & 0xFF);
    }

    public void writeBoolean(boolean b) {
        this.bytes.write(b ? 1 : 0);
    }

    public void writeShort(int i) {
        this.bytes.write((byte)i);
        this.bytes.write((byte) (i >>> 8));
    }

    public void writeUnsignedShort(int i) {
        // Unsigned short
        this.bytes.write((byte) ((i >>> 8) & 0xFF));
        this.bytes.write((byte) (i & 0xFF));
    }

    public void writeInt(int i) {
        this.bytes.write((byte) i);
        this.bytes.write((byte) (i >>> 8));
        this.bytes.write((byte) (i >>> 16));
        this.bytes.write((byte) (i >>> 24));
    }

    public void writeUnsignedInt(int i) {
        this.bytes.write((byte) ((i >>> 24) & 0xFF));
        this.bytes.write((byte) ((i >>> 16) & 0xFF));
        this.bytes.write((byte) ((i >>> 8) & 0xFF));
        this.bytes.write((byte) (i & 0xFF));
    }

    public void writeUnsignedLongLong(long i) {
        this.bytes.write((byte) (i & 0xFF));
        this.bytes.write((byte) ((i >>> 8) & 0xFF));
        this.bytes.write((byte) ((i >>> 16) & 0xFF));
        this.bytes.write((byte) ((i >>> 24) & 0xFF));
        this.bytes.write((byte) ((i >>> 32) & 0xFF));
        this.bytes.write((byte) ((i >>> 40) & 0xFF));
        this.bytes.write((byte) ((i >>> 48) & 0xFF));
        this.bytes.write((byte) ((i >>> 56) & 0xFF));
    }

    public void writeBytes(byte[] bytes) {
        try {
            this.bytes.write(bytes);
        } catch (Exception ignored) {
        }
    }

    public void writeFloat(float f) {
        this.writeUnsignedInt(Float.floatToRawIntBits(f));
    }

    public void writeDouble(double d) {
        long l = Double.doubleToLongBits(d);
        this.writeUnsignedLongLong(l);
    }

    public void writeUTF(String str) {
        if (str == null) {
            this.writeUnsignedShort(0);
            return;
        }

        this.writeUnsignedShort(str.length());
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            this.writeUnsignedByte((byte) c);
        }
    }
}
