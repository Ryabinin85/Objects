
public class Book {
    public Book(String bookTitle, Author author, int published) {
        this.bookTitle = bookTitle;
        this.published = published;
        this.author = author;
    }
    public void setPublished(int published) {
        this.published = published;
    }
    public int getPublished() {
        return published;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthor() {
        return author;
    }

    private final String bookTitle;
    private int published;
    private final Author author;
}
