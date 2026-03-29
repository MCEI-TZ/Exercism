public class LogLine {
    private final String logLevel;
    private final String message;

    public LogLine(String logLine) {
        logLevel = logLine.substring(1, 4);
        message = logLine.substring(7, logLine.length());
    }

    public LogLevel getLogLevel() {
        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().severity + ":" + message;
    }
}
