package hust.soict.dsai.order;
import hust.soict.dsai.deliveryInfo.DeliveryInfo;
import hust.soict.dsai.test.cart.Cart;
import hust.soict.dsai.test.cart.CartItem;

import java.util.*;

public class Order {
    private String id;
    private String customerEmail;
    private List<CartItem> items;
    private OrderStatus status;
    private DeliveryInfo deliveryInfo;
    private double totalCost;
    private double deliveryFee;
    private Date dateCreated;

    public enum OrderStatus {
        PENDING, APPROVED, REJECTED
    }

    public Order(Cart anOrder, DeliveryInfo deliveryInfo, String customerEmail) {
        this.id = UUID.randomUUID().toString();
        this.customerEmail = customerEmail;
        this.items = new ArrayList<>(anOrder.getItems()); // Lấy danh sách CartItem từ hust.soict.dsai.test.cart
        this.deliveryInfo = deliveryInfo;
        this.status = OrderStatus.PENDING;
        this.dateCreated = new Date();
        calculateTotalCost();
    }

    public void calculateDeliveryFee(double weight, String location) {
        this.deliveryFee = weight * 5.0;
        if (location.equalsIgnoreCase("remote")) {
            this.deliveryFee += 10.0;
        }
    }

    public void generateInvoice() {
        System.out.println("=== INVOICE ===");
        System.out.println("hust.soict.dsai.order ID: " + id);
        System.out.println("Customer: " + customerEmail);
        System.out.println("\nItems:");
        for (CartItem item : items) {
            System.out.printf("%s x%d: $%.2f\n", 
                item.getDvd().getTitle(), 
                item.getQuantity(), 
                item.getCost());
        }
        System.out.printf("\nSubtotal: $%.2f\n", totalCost);
        System.out.printf("VAT (10%%): $%.2f\n", totalCost * 0.1);
        System.out.printf("Delivery Fee: $%.2f\n", deliveryFee);
        System.out.printf("Total: $%.2f\n", 
            totalCost * 1.1 + deliveryFee);
    }

    public double calculateTotalCost() {
        totalCost = 0;
        for (CartItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }
}
