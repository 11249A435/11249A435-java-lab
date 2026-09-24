import java.util.concurrent.TimeUnit;

public class TaskManager {
    public static void main(String[] args) {
        System.out.println("Task Manager started.");
        CounterThread counter = new CounterThread();
        counter.start();
    }
}

class CounterThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}