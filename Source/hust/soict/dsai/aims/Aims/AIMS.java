package hust.soict.dsai.aims.Aims;
import java.util.Scanner;
import hust.soict.dsai.aims.disc.DVD;
import hust.soict.dsai.deliveryInfo.DeliveryInfo;
import hust.soict.dsai.order.Order;
import hust.soict.dsai.payment.Payment;
import hust.soict.dsai.test.cart.Cart;
import hust.soict.dsai.test.store.Store;

public class AIMS {
    private static Store store = new Store(); // Giả sử bạn đã tạo lớp Store
    private static Cart cart = new Cart(); // Giả sử bạn đã tạo lớp Cart
    private static Scanner scanner = new Scanner(System.in);
    
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. Xem cửa hàng");
        System.out.println("2. Cập nhật cửa hàng");
        System.out.println("3. Xem giỏ hàng hiện tại");
        System.out.println("0. Thoát");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn một số: 0-1-2-3: ");
    }
    public static void storeMenu() {
        System.out.println("Tùy chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Xem chi tiết phương tiện");
        System.out.println("2. Thêm phương tiện vào giỏ hàng");
        System.out.println("3. Phát phương tiện");
        System.out.println("4. Xem giỏ hàng hiện tại");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn một số: 0-1-2-3-4: ");
    }
    public static void mediaDetailsMenu() {
        System.out.println("Tùy chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Thêm vào giỏ hàng");
        System.out.println("2. Phát");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn một số: 0-1-2: ");
    }
    public static void updateStoreMenu() {
        System.out.println("Tùy chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Thêm phương tiện vào cửa hàng");
        System.out.println("2. Xóa phương tiện khỏi cửa hàng");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn một số: 0-1-2: ");
    }
    public static void cartMenu() {
        System.out.println("Tùy chọn: ");
        System.out.println("--------------------------------");
        System.out.println("1. Lọc phương tiện trong giỏ hàng");
        System.out.println("2. Sắp xếp phương tiện trong giỏ hàng");
        System.out.println("3. Xóa phương tiện khỏi giỏ hàng");
        System.out.println("4. Phát phương tiện");
        System.out.println("5. Đặt hàng");
        System.out.println("0. Quay lại");
        System.out.println("--------------------------------");
        System.out.print("Vui lòng chọn một số: 0-1-2-3-4-5: ");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng nhập
            switch (choice) {
                case 1:
                    showStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Thoát khỏi ứng dụng.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    public static void showStore() {
        while (true) {
            storeMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    viewMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    viewCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    public static void updateStore() {
        while (true) {
            updateStoreMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    public static void viewCart() {
        while (true) {
            cartMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    filterCart();
                    break;
                case 2:
                    sortCart();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMedia();
                    break;
                case 5:
                    placeOrder();
                    return;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }

    public static void viewMediaDetails() {
        System.out.print("Nhập tiêu đề của phương tiện: ");
        String title = scanner.nextLine();
        // Kiểm tra tính hợp lệ và hiển thị chi tiết phương tiện
    }

    public static void addMediaToCart() {
        System.out.print("Nhập tiêu đề của phương tiện để thêm vào giỏ hàng: ");
        String title = scanner.nextLine();
        // Thêm phương tiện vào giỏ hàng
    }

    public static void playMedia() {
        System.out.print("Nhập tiêu đề của phương tiện để phát: ");
        String title = scanner.nextLine();
        // Phát phương tiện
    }

    public static void addMediaToStore() {
        System.out.println("Thêm phương tiện vào cửa hàng...");
        // Thêm phương tiện vào cửa hàng
    }

    public static void removeMediaFromStore() {
        System.out.println("Xóa phương tiện khỏi cửa hàng...");
        // Xóa phương tiện khỏi cửa hàng
    }

    public static void filterCart() {
        System.out.println("Lọc phương tiện trong giỏ hàng...");
        // Lọc phương tiện theo id hoặc tiêu đề
    }

    public static void sortCart() {
        System.out.println("Sắp xếp phương tiện trong giỏ hàng...");
        // Sắp xếp phương tiện theo tiêu đề hoặc giá
    }

    public static void removeMediaFromCart() {
        System.out.println("Xóa phương tiện khỏi giỏ hàng...");
        // Xóa phương tiện khỏi giỏ hàng
    }

    public static void placeOrder() {
        System.out.println("Đơn hàng đã được tạo!");
        // Thông báo đơn hàng và xóa giỏ hàng
    }
}
