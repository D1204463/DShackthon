@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Book>> recommendBooks(@PathVariable String userId) {
        List<Book> recommendedBooks = recommendationService.recommendBooks(userId);
        return ResponseEntity.ok(recommendedBooks);
    }
}
