public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadWaiterOne(), "Waiter One");
        Thread t2 = new Thread (new ThreadWaiterTwo(), "Waiter Two");

        t1.start();
        t2.start();

        // wait for both to complete
        t1.join();
        t2.start();
        // should prevent the program from exiting early

        // print message
        System.out.println("Both waiter threads have finished");
    }
}
