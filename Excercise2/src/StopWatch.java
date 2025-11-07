public class StopWatch {
    public static void main(String[] args) throws InterruptedException {
        Thread minuteThread = new Thread(new Minute(), "Minute Thread");
        Thread secondThread = new Thread(new Second(), "Second Thread");

        minuteThread.start();
        secondThread.start();

        // Let it run ~66 seconds to see at least 'one second'
        Thread.sleep(65_000);

        // Stop both threads
        minuteThread.interrupt();
        secondThread.interrupt();

        // Wait for clean shutdown
        minuteThread.join();
        secondThread.join();

        System.out.println("Stopwatch Ended....");
    }
}
