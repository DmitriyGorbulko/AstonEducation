package module.fifth.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {
    private final Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("До вызова метода: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("После вызова метода: " + method.getName() + " с результатом: " + result);
        return result;
    }
}
