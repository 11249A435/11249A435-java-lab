import java.util.Scanner;

public class FeedbackAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ratings = new int[5];
        int sum = 0;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < ratings.length; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
            sum += ratings[i];
        }

        double average = (double) sum / ratings.length;

        System.out.println("Average Rating = " + average);

        sc.close();
    }
}