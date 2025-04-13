package module.fifth.chainOfResponsibilities;

public class InfoLogger extends AbstractLogger {
    @Override
    public void log(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(message, level);
        }
    }
}
