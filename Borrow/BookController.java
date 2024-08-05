@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/borrow")
    public ResponseEntity<String> borrowBook(@RequestBody BorrowRequest borrowRequest) {
        boolean success = bookService.borrowBook(borrowRequest.getBookId(), borrowRequest.getUserId());
        if (success) {
            return ResponseEntity.ok("Book borrowed successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to borrow book");
        }
    }

    @PostMapping("/return")
    public ResponseEntity<String> returnBook(@RequestBody ReturnRequest returnRequest) {
        boolean success = bookService.returnBook(returnRequest.getBookId(), returnRequest.getUserId());
        if (success) {
            return ResponseEntity.ok("Book returned successfully");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to return book");
        }
    }
}
