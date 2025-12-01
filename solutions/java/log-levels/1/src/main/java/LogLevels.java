public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        return arr[1].trim();
    }

    public static String logLevel(String logLine) {
        return logLine.substring(1,logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        String message1 = message(logLine);
        String log =  logLevel(logLine);
        return message1 + " (" + log +")"; 
    }
}
