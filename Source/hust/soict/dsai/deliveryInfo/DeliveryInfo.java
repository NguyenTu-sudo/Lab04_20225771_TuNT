package hust.soict.dsai.deliveryInfo;

public class DeliveryInfo {
    private String recipientName;
    private String address;
    private String phoneNumber;
    private String deliveryInstructions;

    // Constructor
    public DeliveryInfo(String recipientName, String address, String phoneNumber, String deliveryInstructions) {
        this.recipientName = recipientName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.deliveryInstructions = deliveryInstructions;
    }

    // Getters và Setters
    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    public void setDeliveryInstructions(String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }
}
