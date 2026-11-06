
public class Book {
    String id;
    String title;
    String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println(id + " | " + title + " | " + author);
    }
}