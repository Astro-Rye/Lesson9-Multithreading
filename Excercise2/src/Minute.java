public class Minute implements Runnable{
    @Override
    public void run() {
        int minutes = 0;

        try{
            while(!Thread.currentThread().isInterrupted()) {
                Thread.sleep(60_000); // wait 60 seconds
            }
        } catch (InterruptedException e ) {
            // allow the thread to exit
        }
        System.out.println("Minute thread STOPPED");
    }
}
