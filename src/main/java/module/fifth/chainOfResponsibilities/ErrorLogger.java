package module.fifth.chainOfResponsibilities;

public class ErrorLogger extends AbstractLogger {
    @Override
    public void log(String message, LogLevel level) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(message, level);
        }
    }
}