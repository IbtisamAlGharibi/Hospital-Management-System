package Behaviours;

public interface BillableInterface {
    void  calculateCharges();
    void generateBill();
    void processPayment(double amount);
}
