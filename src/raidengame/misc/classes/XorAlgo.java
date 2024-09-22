package raidengame.misc.classes;

// Imports
import lombok.Setter;

public final class XorAlgo {
    /**
     * Xorshift64 algorithm
     */
    @Setter
    public static class XorShift64 {
        private long seed;

        public long nextLong() {
            seed ^= (seed << 13);
            seed ^= (seed >>> 7);
            seed ^= (seed << 17);
            return seed;
        }
    }

    /**
     * Xor encryption on given packet and key.
     */
    public static void xor(byte[] packet, byte[] key) {
        for (int i = 0; i < packet.length; i++) {
            packet[i] ^= key[i % key.length];
        }
    }
}
