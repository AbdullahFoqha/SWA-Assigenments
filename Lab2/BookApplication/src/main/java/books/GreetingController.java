package books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/books")
public class GreetingController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping(value = "/getBook/{id}")
    public Book getBook(@PathVariable String id) {
        return bookService.getBook(id);
    }

    @RequestMapping(value = "/addBook")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @RequestMapping(value = "/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping(value = "/deleteBook/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }

    @GetMapping(value = {"", "getAllBooks"})
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}