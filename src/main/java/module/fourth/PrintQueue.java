package module.fourth;

public class PrintQueue {
    private boolean isThread1Turn = true;

    public synchronized void firstThreadMethod() throws InterruptedException {
        while (!isThread1Turn) {
            wait();
        }
        System.out.println("1");
        isThread1Turn = false;
        notify();
    }

    public synchronized void secondThreadMethod() throws InterruptedException {
        while (isThread1Turn) {
            wait();
        }
        System.out.println("2");
        isThread1Turn = true;
        notify();
    }

    public static void main(String[] args) {
        PrintQueue resource = new PrintQueue();

        // Создание потоков
        Thread printOne = new Thread(() -> {
            while (true) {
                try {
                    resource.firstThreadMethod();
                    Thread.sleep(100); // Задержка для наглядности
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread printTwo = new Thread(() -> {
            while (true) {
                try {
                    resource.secondThreadMethod();
                    Thread.sleep(100); // Задержка для наглядности
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Запуск потоков
        printOne.start();
        printTwo.start();
    }
}


