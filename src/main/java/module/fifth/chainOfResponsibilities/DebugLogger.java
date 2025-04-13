package module.fifth.chainOfResponsibilities;

public class DebugLogger extends AbstractLogger {
    @Override
    public void log(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(message, level);
        }
    }
}