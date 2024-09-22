package raidengame.misc.classes;

// Imports
import java.security.SecureRandom;

public final class Randomizer {
    private static final SecureRandom secureRandom = new SecureRandom();

    /**
     * Generates a unique encryption key for every player.
     */
    public static long generateEncryptKeyAndSeed(byte[] encryptKey) {
        var encryptSeed = secureRandom.nextLong();
        var mt = new XorAlgo.XorShift64();
        mt.setSeed(encryptSeed);
        mt.setSeed(mt.nextLong());
        mt.nextLong();
        for (int i = 0; i < (4096 >> 3); i++) {
            var rand = mt.nextLong();
            encryptKey[i << 3] = (byte) (rand >> 56);
            encryptKey[(i << 3) + 1] = (byte) (rand >> 48);
            encryptKey[(i << 3) + 2] = (byte) (rand >> 40);
            encryptKey[(i << 3) + 3] = (byte) (rand >> 32);
            encryptKey[(i << 3) + 4] = (byte) (rand >> 24);
            encryptKey[(i << 3) + 5] = (byte) (rand >> 16);
            encryptKey[(i << 3) + 6] = (byte) (rand >> 8);
            encryptKey[(i << 3) + 7] = (byte) rand;
        }
        return encryptSeed;
    }

    /**
     * Returns a random float number.
     * @param min Minimum number
     * @param max Maximum number
     * @return A random number between min and max.
     */
    public static float randomFloatRange(float min, float max) {
        return secureRandom.nextFloat() * (max - min) + min;
    }

    /**
     * Returns a random number.
     *
     * @param min Minimum number
     * @param max Maximum number
     * @return A random number between min and max.
     */
    public static int randomRange(int min, int max) {
        return secureRandom.nextInt() * (max - min) + min;
    }
}