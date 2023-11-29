public class Main {
    public static void main(String[] args) {
        // Gọi phương thức main để kiểm thử chương trình
        testPhoneBook();
    }

    // Phương thức kiểm thử chức năng của PhoneBook
    private static void testPhoneBook() {
        // Tạo một đối tượng PhoneBook
        PhoneBook phoneBook = new PhoneBook();

        // Thêm dữ liệu vào danh bạ
        phoneBook.insertPhone("John Doe", "123456789");
        phoneBook.insertPhone("Jane Smith", "987654321");
        phoneBook.insertPhone("John Doe", "555555555");

        // Hiển thị danh bạ trước khi sắp xếp
        System.out.println("Danh bạ trước khi sắp xếp:");
        displayPhoneBook(phoneBook);

        // Sắp xếp danh bạ
        phoneBook.sort();

        // Hiển thị danh bạ sau khi sắp xếp
        System.out.println("\nDanh bạ sau khi sắp xếp:");
        displayPhoneBook(phoneBook);

        // Tìm kiếm số điện thoại theo tên
        PhoneNumber searchResult = phoneBook.searchPhone("Jane Smith");
        if (searchResult != null) {
            System.out.println("\nSố điện thoại của Jane Smith: " + searchResult.getPhone());
        } else {
            System.out.println("\nKhông tìm thấy Jane Smith trong danh bạ.");
        }

        // Xóa người dùng và số điện thoại
        phoneBook.removePhone("John Doe");

        // Hiển thị danh bạ sau khi xóa
        System.out.println("\nDanh bạ sau khi xóa:");
        displayPhoneBook(phoneBook);
    }

    // Phương thức hiển thị danh bạ
    private static void displayPhoneBook(PhoneBook phoneBook) {
        for (PhoneNumber contact : phoneBook.getPhoneList()) {
            System.out.println("Tên: " + contact.getName() + ", Số điện thoại: " + contact.getPhone());
        }
    }
}
