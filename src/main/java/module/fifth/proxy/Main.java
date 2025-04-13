package module.fifth.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Calculator realCalculator = new Calculator();

        ICalculator proxyCalculator = (ICalculator) Proxy.newProxyInstance(
                ICalculator.class.getClassLoader(),
                new Class[]{ICalculator.class},
                new LoggingHandler(realCalculator)
        );

        System.out.println("Результат сложения: " + proxyCalculator.add(5, 7));
        System.out.println("Результат умножения: " + proxyCalculator.multiply(5, 7));
    }
}
