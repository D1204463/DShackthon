@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    // 定義資料庫操作方法
}
