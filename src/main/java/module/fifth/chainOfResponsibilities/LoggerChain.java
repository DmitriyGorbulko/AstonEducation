package module.fifth.chainOfResponsibilities;

public class LoggerChain {
    private ILogger logger;

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public void log(String message, LogLevel level) {
        logger.log(message, level);
    }
}
