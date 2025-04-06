package module.fourth;

//
public class MessageProcessor {
    static class Worker {
        private boolean busy;

        public void process(Worker worker) {
            while (true) {
                if (!busy) {
                    busy = true;
                    System.out.println(Thread.currentThread().getName() + " started processing");

                    try { Thread.sleep(1000); } catch (InterruptedException e) {}

                    if (worker.busy) {
                        System.out.println("Partner busy - releasing resource");
                        busy = false;
                        continue;
                    }

                    System.out.println("Processing completed");
                    busy = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        final Worker worker1 = new Worker();
        final Worker worker2 = new Worker();

        new Thread(() -> worker1.process(worker2)).start();
        new Thread(() -> worker2.process(worker1)).start();
    }
}
