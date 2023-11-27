public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng News
        News news = new News();

        // Thiết đặt các thông tin tin tức
        news.setId(1);
        news.setTitle("Breaking News");
        news.setPublicDate("2023-11-23");
        news.setAuthor("John Doe");
        news.setContent("Important events occurred!");

        // Hiển thị thông tin tin tức trước khi đánh giá
        System.out.println("Thông tin tin tức trước khi đánh giá:");
        news.display();

        // Nhập giá trị đánh giá và tính lại AverageRate
        news.inputRate(4);
        news.inputRate(5);
        news.inputRate(3);
        news.inputRate(5);
        news.inputRate(4);

        // Hiển thị thông tin tin tức sau khi đánh giá
        System.out.println("\nThông tin tin tức sau khi đánh giá:");
        news.display();
    }
}
