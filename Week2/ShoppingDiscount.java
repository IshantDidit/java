package Week2;

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, discount, finalAmount;

        System.out.print("Enter shopping amount: ");
        amount = sc.nextDouble();

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 2000 && amount <= 5000) {
            discount = amount * 0.10;
        } else if (amount <= 2000) {
            discount = 0;
        } else {
            discount = 0;
        }

        finalAmount = amount - discount;

        System.out.println("MRP Amount: Rs. " + amount);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("After discount: Rs. " + finalAmount);

        sc.close();
    }
}