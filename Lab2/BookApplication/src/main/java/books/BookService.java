package books;


import java.util.List;

public interface BookService {
    Book addBook(Book book);

    Book updateBook(Book book);

    void deleteBook(String isbn);

    Book getBook(String isbn);

    List<Book> getAllBooks();
}
