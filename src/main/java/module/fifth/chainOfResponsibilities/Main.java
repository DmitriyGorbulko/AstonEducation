package module.fifth.chainOfResponsibilities;

public class Main {
    public static void main(String[] args) {
        ILogger debugLogger = new DebugLogger();
        ILogger infoLogger = new InfoLogger();
        ILogger warningLogger = new WarningLogger();
        ILogger errorLogger = new ErrorLogger();

        debugLogger.setNext(infoLogger);
        infoLogger.setNext(warningLogger);
        warningLogger.setNext(errorLogger);

        LoggerChain loggerChain = new LoggerChain();
        loggerChain.setLogger(debugLogger);

        loggerChain.log("Это сообщение для DEBUG", LogLevel.DEBUG);
        loggerChain.log("Это сообщение для INFO", LogLevel.INFO);
        loggerChain.log("Это сообщение для WARNING", LogLevel.WARNING);
        loggerChain.log("Это сообщение для ERROR", LogLevel.ERROR);
    }
}