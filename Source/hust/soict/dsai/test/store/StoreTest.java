package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DVD;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng
        Store store = new Store();

        // Tạo các đối tượng hust.soict.dsai.aims.disc
        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DVD dvd3 = new DVD("Aladin", "Animation", null, 0, 18.99f);

        // Thêm hust.soict.dsai.aims.disc vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // In danh sách hust.soict.dsai.aims.disc trong cửa hàng
        store.printStore();

        // Xóa một hust.soict.dsai.aims.disc khỏi cửa hàng
        store.removeDVD("Star Wars");

        // In lại danh sách hust.soict.dsai.aims.disc trong cửa hàng
        store.printStore();

        // Thử xóa hust.soict.dsai.aims.disc không tồn tại
        store.removeDVD("Nonexistent hust.soict.dsai.aims.disc");
    }
}
