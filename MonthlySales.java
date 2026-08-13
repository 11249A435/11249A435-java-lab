public class MonthlySales {
    public static void main(String[] args) {

        int[] sales = {12000, 15000, 18000, 9000, 20000, 17000, 11000, 22000, 14000, 16000, 13000, 19000};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest Sales = " + max);
        System.out.println("Lowest Sales = " + min);
    }
}