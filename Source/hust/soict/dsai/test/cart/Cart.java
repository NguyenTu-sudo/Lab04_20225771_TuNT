// hust.soict.dsai.test.cart.java
package hust.soict.dsai.test.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DVD;

public class Cart {
    private List<CartItem> items;
    private double totalCost;
    private int quantity;

    public Cart() {
        items = new ArrayList<>();
        totalCost = 0;
    }

    public void addItem(DVD dvd) {
        CartItem existingItem = findItem(dvd.getId());
        if (existingItem != null) {
            existingItem.incrementQuantity();
        } else {
            items.add(new CartItem(dvd));
        }
        updateTotalCost();
    }
    //Lab03 ------------
    public void addDigitalVideoDisc(DVD[] dvdList) {
        for (DVD dvd : dvdList) {
            addItem(dvd);
        }
    }
    public void addDigitalVideoDisc(DVD dvd1, DVD dvd2) {
        addItem(dvd1);
        addItem(dvd2);
    }
    
    public void printCart() {
        System.out.println("***************************GIỎ HÀNG************************");
        System.out.println("Các mặt hàng đã đặt hàng:");
        
        int index = 1;
        for (CartItem item : items) {
            System.out.println(index + ". " + item.getDvd().toString());
            index++;
        }

        System.out.println("Tổng chi phí: " + String.format("%.2f", totalCost) + " $");
        System.out.println("******************************************************");
    }
    
    public void searchDVDById(String id) {
        boolean found = false;
        for (CartItem item : items) {
            DVD dvd = item.getDvd();
            if (dvd.getId().equalsIgnoreCase(id)) {
                System.out.println("Kết quả tìm kiếm:");
                System.out.println(dvd.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy hust.soict.dsai.aims.disc với ID: " + id);
        }
    }

    //---------------
    
    public void removeItem(String dvdId) {
        items.removeIf(item -> item.getDvd().getId().equals(dvdId));
        updateTotalCost();
    }

    public void updateQuantity(String dvdId, int quantity) {
        CartItem item = findItem(dvdId);
        if (item != null) {
            item.setQuantity(quantity);
            updateTotalCost();
        }
    }

    private void updateTotalCost() {
        totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getCost();
        }
    }

    private CartItem findItem(String dvdId) {
        return items.stream()
                   .filter(item -> item.getDvd().getId().equals(dvdId))
                   .findFirst()
                   .orElse(null);
    }

    // Getters
    public List<CartItem> getItems() {
        return items;
    }

    public double getTotalCost() {
        return totalCost;
    }
}