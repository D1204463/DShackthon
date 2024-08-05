@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public boolean borrowBook(String bookId, String userId) {
        // 實現借書邏輯
    }

    public boolean returnBook(String bookId, String userId) {
        // 實現還書邏輯
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }

    public Book getBook(String id) {
        return bookRepository.findById(id).orElse(null);
    }
}
