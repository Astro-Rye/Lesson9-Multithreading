public class Second  implements Runnable{
    @Override
    public void run() {
        int seconds = 0;

        try {
            while ((!Thread.currentThread().isInterrupted())) {
                Thread.sleep(1_000); // wait 1 second
                seconds++;
                System.out.println(seconds + " second(s)");
            }
        } catch (InterruptedException e) {
            // allow the thread to exit
        }
        System.out.println("Second thread STOPPED ");
    }
}
