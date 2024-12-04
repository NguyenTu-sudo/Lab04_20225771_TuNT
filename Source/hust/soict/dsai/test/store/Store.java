
package hust.soict.dsai.test.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DVD;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<>();

    // Constructor
    public Store() {
        itemsInStore = new ArrayList<>();
    }
//lab04
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media đã tồn tại trong kho: " + media.getTitle());
        } else {
            itemsInStore.add(media);
            System.out.println("Đã thêm vào kho: " + media.getTitle());
        }
    }
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Đã xóa khỏi kho: " + media.getTitle());
        } else {
            System.out.println("Media không tồn tại trong kho: " + media.getTitle());
        }
    }
    public void displayStore() {
        System.out.println("Nội dung trong kho:");
        for (Media media : itemsInStore) {
            System.out.println("- " + media.getTitle() + " | Giá: " + media.getCost() + " | Loại: " + media.getClass().getSimpleName());
        }
    }
//
    // Thêm một hust.soict.dsai.aims.disc vào cửa hàng
    public void addDVD(DVD dvd) {
        if (dvd != null) {
            itemsInStore.add(dvd);
            System.out.println("Added hust.soict.dsai.aims.disc: " + dvd.getTitle());
        } else {
            System.out.println("Cannot add a null hust.soict.dsai.aims.disc.");
        }
    }

    // Xóa một hust.soict.dsai.aims.disc khỏi cửa hàng
    public void removeDVD(String title) {
        boolean removed = itemsInStore.removeIf(dvd -> dvd.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Removed hust.soict.dsai.aims.disc: " + title);
        } else {
            System.out.println("hust.soict.dsai.aims.disc with title '" + title + "' not found.");
        }
    }

    // In danh sách hust.soict.dsai.aims.disc trong cửa hàng
    public void printStore() {
        System.out.println("***************************STORE************************");
        System.out.println("Items in hust.soict.dsai.test.store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DVD dvd = itemsInStore.get(i);
            System.out.println((i + 1) + ". " + dvd.toString());
        }
        System.out.println("********************************************************");
    }
}
