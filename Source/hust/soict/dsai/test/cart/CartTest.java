package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.disc.DVD;
public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Tạo các hust.soict.dsai.aims.disc mẫu
        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DVD dvd3 = new DVD("Aladin", "Animation", null, 18.99f, null, 0);

        // Thêm hust.soict.dsai.aims.disc vào giỏ hàng
        cart.addItem(dvd1);
        cart.addItem(dvd2);
        cart.addItem(dvd3);

        //In gio hang
        cart.printCart();
        
        // Tìm kiếm hust.soict.dsai.aims.disc
        System.out.println("Tìm kiếm hust.soict.dsai.aims.disc có ID 'DVD2':");
        cart.searchDVDById("DVD2");

        System.out.println("\nTìm kiếm hust.soict.dsai.aims.disc có ID 'DVD4':");
        cart.searchDVDById("DVD4");
    }
}
