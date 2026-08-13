import java.util.Scanner;

public class LibraryBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = new String[10];

        System.out.println("Enter 10 book titles:");

        for (int i = 0; i < books.length; i++) {
            books[i] = sc.nextLine();
        }

        System.out.println("\nBooks starting with 'A':");

        for (String book : books) {
            if (book.startsWith("A") || book.startsWith("a")) {
                System.out.println(book);
            }
        }

        sc.close();
    }
}