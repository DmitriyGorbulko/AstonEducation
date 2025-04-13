package module.fifth.chainOfResponsibilities;

public class AbstractLogger implements ILogger{
    protected ILogger next;

    @Override
    public void setNext(ILogger next) {
        this.next = next;
    }

    @Override
    public void log(String message, LogLevel level) {
        if (next != null){
            next.log(message, level);
        }
    }
}
