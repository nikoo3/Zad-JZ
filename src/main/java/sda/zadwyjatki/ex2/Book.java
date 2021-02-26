package sda.zadwyjatki.ex2;

public class Book {
    protected double isbn;
    protected String title;
    protected String author;
    protected int Release;

    public Book(double isbn, String title, String author, int release) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        Release = release;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getRelease() {
        return Release;
    }

    public void setRelease(int release) {
        Release = release;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", Release=" + Release +
                '}';
    }

    static class NoBookFoundException extends Exception {

        public NoBookFoundException(String x){
            super("Book not found." + x +" not exist");
        }
    }
}
