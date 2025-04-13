package module.fifth.chainOfResponsibilities;

public class WarningLogger extends AbstractLogger {
    @Override
    public void log(String message, LogLevel level) {
        if (level == LogLevel.WARNING) {
            System.out.println("WARNING: " + message);
        } else {
            super.log(message, level);
        }
    }
}
