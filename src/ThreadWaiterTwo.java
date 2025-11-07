public class ThreadWaiterTwo implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5_000);// 5 seconds
        } catch (InterruptedException e) {
            return;
        }
        System.out.println("Thread waiter two is done: [x]");
    }
}
