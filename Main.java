
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Add sample books
        library.addBook(new Book("B101", "Java Basics", "James"));
        library.addBook(new Book("B102", "Python Guide", "David"));

        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    library.addBook(
                        new Book(id, title, author)
                    );
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    String searchId = sc.nextLine();
                    library.searchBook(searchId);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
