public class LogLevels {
    
    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.split("]:")[0].substring(1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message1 = message(logLine);
        String log =  logLevel(logLine);
        return message1 + " (" + log +")"; 
    }
}
