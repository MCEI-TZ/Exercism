public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    public final int serverity;

    LogLevel(int serverity) {
        this.serverity = serverity;
    }

    public int getServerity() {
        return serverity;
    }
}
