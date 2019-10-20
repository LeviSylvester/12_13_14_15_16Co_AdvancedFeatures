package course.concurrency;

public class ThreadApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started " + Thread.currentThread().getName());
        MyThreadExtension myThreadExtension = new MyThreadExtension();
        Thread withRunnable = new Thread(new MyRunnableImplementation());
        MyThreadExtension myThreadExtension1 = new MyThreadExtension();
        System.out.println("Starting a " + myThreadExtension.getName());
        myThreadExtension.start();
        pauseMainThread();
        System.out.println("Starting a " + withRunnable.getName());
        withRunnable.start();
        System.out.println("Starting a " + myThreadExtension1.getName());
        myThreadExtension1.start();
        pauseMainThread();

        System.out.println("Waiting for threads to finish their execution.");
        myThreadExtension.join();
        withRunnable.join();
        myThreadExtension1.join();

        System.out.println("Stopping main thread.");
    }

    private static void pauseMainThread() throws InterruptedException {
        System.out.println("Pausing main thread: " + Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
