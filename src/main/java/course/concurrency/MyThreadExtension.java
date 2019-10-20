package course.concurrency;

public class MyThreadExtension extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Pause MyThread extension: " + Thread.currentThread().getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
}
