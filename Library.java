
import java.util.HashMap;

public class Library {

    HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.id, book);
        System.out.println("Book added successfully!");
    }

    public void displayBooks() {
        for (Book book : books.values()) {
            book.displayBook();
        }
    }

    public void searchBook(String id) {
        Book book = books.get(id);

        if (book != null) {
            System.out.println("Book found:");
            book.displayBook();
        } else {
            System.out.println("Book not found!");
        }
    }
}
