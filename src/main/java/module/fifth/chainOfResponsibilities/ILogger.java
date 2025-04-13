package module.fifth.chainOfResponsibilities;

public interface ILogger {
    void setNext(ILogger next);
    void log(String message, LogLevel level);
}
