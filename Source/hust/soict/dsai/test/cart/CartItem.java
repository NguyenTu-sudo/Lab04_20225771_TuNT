// CartItem.java
package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.disc.DVD;

public class CartItem {
    private DVD dvd;
    private int quantity;
    private double cost;

    public CartItem(DVD dvd) {
        this.dvd = dvd;
        this.quantity = 1;
        updateCost();
    }

    public void incrementQuantity() {
        quantity++;
        updateCost();
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateCost();
    }

    private void updateCost() {
        this.cost = dvd.getCost() * quantity;
    }

    // Getters
    public DVD getDvd() {
        return dvd;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }
}