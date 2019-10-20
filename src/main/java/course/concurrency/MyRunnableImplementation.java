package course.concurrency;

import static java.lang.Thread.sleep;

public class MyRunnableImplementation implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Pause MyRunnable implementation: " + Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
