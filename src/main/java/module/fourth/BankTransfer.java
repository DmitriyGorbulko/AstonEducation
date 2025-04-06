package module.fourth;

public class BankTransfer {
    private static final String account1 = "Thread#1";
    private static final String account2 = "Thread#2";

    public static void transfer(String from, String to, int amount) {
        synchronized (from) {
            System.out.println(" locked " + from);
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (to) {
                System.out.println(" transferred $" + amount);
            }
        }
    }

    public static void main(String[] args) {
        new Thread(() -> transfer(account1, account2, 100)).start();
        new Thread(() -> transfer(account2, account1, 200)).start();
    }
}
