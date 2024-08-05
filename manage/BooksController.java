@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.ok("Book added successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return ResponseEntity.ok("Book updated successfully");
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getBook(@PathVariable String id) {
        Book book = bookService.getBook(id);
        return ResponseEntity.ok(book);
    }
}
