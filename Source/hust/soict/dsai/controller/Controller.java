package hust.soict.dsai.controller;

import hust.soict.dsai.aims.disc.*;
import hust.soict.dsai.order.Order;
import hust.soict.dsai.test.cart.Cart;

import java.util.*;
import java.util.stream.Collectors;

public class Controller {
 private Cart cart;
 private List<DVD> store;

 public Controller() {
     this.cart = new Cart();
     this.store = new ArrayList<>();
 }

 public List<DVD> searchByTitle(String keywords) {
     String[] words = keywords.toLowerCase().split("\\s+");
     return store.stream()
         .filter(dvd -> {
             String title = dvd.getTitle().toLowerCase();
             return Arrays.stream(words)
                 .anyMatch(title::contains);
         })
         .sorted((m1, m2) -> 
             m2.getDateAdded().compareTo(m1.getDateAdded()))
         .collect(Collectors.toList());
 }

 public List<DVD> searchByCategory(String category) {
     return store.stream()
         .filter(dvd -> 
             dvd.getCategory().equalsIgnoreCase(category))
         .sorted((m1, m2) -> 
             m2.getDateAdded().compareTo(m1.getDateAdded()))
         .collect(Collectors.toList());
 }

 public List<Media> searchByPrice(float min, float max) {
     return store.stream()
         .filter(dvd -> 
             dvd.getCost() >= min && dvd.getCost() <= max)
         .sorted((m1, m2) -> 
             m2.getDateAdded().compareTo(m1.getDateAdded()))
         .collect(Collectors.toList());
 }

 public void addToCart(String dvdId) {
     DVD dvd = findMediaById(dvdId);
     if (dvd != null) {
         cart.addItem(dvd);
     }
 }

 public Order placeOrder(String customerEmail, 
                       DeliveryInfo deliveryInfo) {
     if (cart.isEmpty()) return null;
     Order order = new Order(customerEmail, cart.getItems());
     order.setDeliveryInfo(deliveryInfo);
     order.calculateDeliveryFee();
     // Process payment and other order logic
     return order;
 }

 private DVD findMediaById(String id) {
     return store.stream()
         .filter(dvd -> dvd.getId().equals(id))
         .findFirst()
         .orElse(null);
 }
}