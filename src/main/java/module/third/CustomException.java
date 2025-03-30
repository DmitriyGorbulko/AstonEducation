package module.third;

import java.io.IOException;

public class CustomException extends IOException {
    private final int errorCode; // Дополнительное поле для кода ошибки
    private final String context; // Дополнительное поле для контекста ошибки

    public CustomException(String message, int errorCode, String context) {
        super(message);
        this.errorCode = errorCode;
        this.context = context;
    }

    // Геттеры для дополнительных полей
    public int getErrorCode() {
        return errorCode;
    }

    public String getContext() {
        return context;
    }

    @Override
    public String toString() {
        return "CustomeException{" +
                "message='" + getMessage() + '\'' +
                ", errorCode=" + errorCode +
                ", context='" + context + '\'' +
                '}';
    }
}

