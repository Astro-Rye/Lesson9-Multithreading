public class ThreadWaiterOne implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(20_000); // 20 seconds
        } catch (InterruptedException e) {
            // if interrupted, just exit early
            return;
        }
        System.out.println("Thread waiter one is done: [x]");
    }
}
