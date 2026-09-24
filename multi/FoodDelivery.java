import java.util.concurrent.TimeUnit;

public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        placement.start();
        delivery.start();
    }
}

class OrderPlacement extends Thread {
    @Override
    public void run() {
        System.out.println("Order placement started...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Placing order: Step " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Order placed successfully!");
    }
}

class OrderDelivery extends Thread {
    @Override
    public void run() {
        System.out.println("Order delivery started...");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Delivery in progress: Step " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("Order delivered successfully!");
    }
}

