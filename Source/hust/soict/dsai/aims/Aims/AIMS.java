package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.disc.DVD;
import hust.soict.dsai.deliveryInfo.DeliveryInfo;
import hust.soict.dsai.order.Order;
import hust.soict.dsai.payment.Payment;
import hust.soict.dsai.test.cart.Cart;

public class AIMS {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();
        
        DVD dvd1 = new DVD("0001", "The lion king1", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd1);
        
        DVD dvd2 = new DVD("0002", "The lion king2", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd2);
        
        DVD dvd3 = new DVD("0003", "The lion king3", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd3);
        
        DVD dvd4 = new DVD("0004", "The lion king4", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd4);
        
        DVD dvd5 = new DVD("0005", "The lion king5", "Animation", 19.25, "Roger Aller", 5);
        anOrder.addItem(dvd5);
        
        System.out.println("Total cost is: " + anOrder.getTotalCost());
        
        DeliveryInfo deliveryInfo = new DeliveryInfo(
                "John Doe", 
                "123 Elm Street, Springfield", 
                "123-456-7890", 
                "Leave at the front door"
        );
        anOrder.printCart();
        
        Order order = new Order(anOrder, deliveryInfo, "tu@gmail.com");

       
        order.calculateDeliveryFee(2.5, "local"); // giả sử trọng lượng là 2.5 kg
        System.out.println("Delivery fee is: " + order.getDeliveryFee());

        
        Payment payment = new Payment("John Doe", order.calculateTotalCost() + order.getDeliveryFee());
        boolean paymentSuccess = payment.makePayment("1234567812345678");

        if (paymentSuccess) {
            System.out.println("hust.soict.dsai.payment successful!");
            payment.displayTransactionInfo();
            System.out.println("Invoice:");
            order.generateInvoice();
        } else {
            System.out.println("hust.soict.dsai.payment failed. Please check your card details.");
        }
        
    }
}