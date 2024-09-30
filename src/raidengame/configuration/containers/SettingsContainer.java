package raidengame.configuration.containers;

public class SettingsContainer {
    // Boolean
    public boolean isDebug = true;
    // Objects
    public KCPInfo kcpInfo = new KCPInfo();
    public Maintenance maintenance = new Maintenance();

    public static class KCPInfo {
        public int kcpInterval = 3;
        public int kcpTimeout = 1000 * 30; // 30 seconds.
        public String gateserverIP = "127.0.0.1";
        public int gateserverPort = 8882;
        public boolean logPackets = true;
    }

    public static class Maintenance {
        public boolean isMaintenance = true;
        public int start_time;
        public int end_time;
        public String message;
        public String url;
    }
}