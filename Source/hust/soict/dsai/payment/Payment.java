package hust.soict.dsai.payment;

import java.time.LocalDateTime;

public class Payment {
    private String transactionID;
    private String cardOwner;
    private double transactionAmount;
    private LocalDateTime transactionDate;
    private String transactionMessage;
    private double balance;

    // Constructor
    public Payment(String cardOwner, double transactionAmount) {
        this.cardOwner = cardOwner;
        this.transactionAmount = transactionAmount;
        this.transactionDate = LocalDateTime.now();
    }

    // Phương thức xác thực thẻ tín dụng (giả lập)
    public boolean validateCreditCard(String cardNumber) {
        // Giả sử một thẻ hợp lệ nếu có 16 chữ số
        return cardNumber.length() == 16 && cardNumber.matches("\\d+");
    }

    // Phương thức thực hiện thanh toán
    public boolean makePayment(String cardNumber) {
        if (validateCreditCard(cardNumber)) {
            // Giả lập ID giao dịch
            this.transactionID = "TRANS" + System.currentTimeMillis();
            this.transactionMessage = "hust.soict.dsai.payment Successful";
            this.balance = this.balance - transactionAmount; // Trừ số dư
            this.transactionDate = LocalDateTime.now();
            return true;
        } else {
            this.transactionMessage = "hust.soict.dsai.payment Failed - Invalid Card";
            return false;
        }
    }

    // Phương thức hiển thị thông tin giao dịch
    public void displayTransactionInfo() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Card Owner: " + cardOwner);
        System.out.println("Transaction Amount: $" + transactionAmount);
        System.out.println("Transaction Date: " + transactionDate);
        System.out.println("Transaction Message: " + transactionMessage);
        System.out.println("Remaining Balance: $" + balance);
    }

    // Getters và Setters
    public String getTransactionID() {
        return transactionID;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
