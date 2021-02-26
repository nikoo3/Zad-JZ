package sda.zadwyjatki.ex2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();
    public void addBook(Book book){
        this.books.add(book);
    }

    public void List<Book> deleteBook(String isbn) throws NoBookFoundException {
        for (Book book : books){
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException(isbn);
    }

    public void findByIsbn (String isbn) throws Book.NoBookFoundException {
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        throw new Book.NoBookFoundException(isbn);
    }
}
