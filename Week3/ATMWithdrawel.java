package Week3;

import java.util.Scanner;

public class ATMWithdrawel {
    static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        boolean isEnd = false;

        while (!isEnd) {
            System.out.println("Choose an option");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("Enter your amount:");
                    int amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Deposited amount:" + amount);
                    System.out.println("Current balance:" + balance);
                }

                case 2 -> {
                    System.out.print("How much would u like to withdraw? =");
                    int amount = sc.nextInt();

                    if (amount < 0) {
                        System.out.println("Invalid amount");
                    } else if (amount > balance) {
                        System.out.println("insufficient balance");
                    } else {
                        balance -= amount;
                        System.out.println("Amount withdrawn successfully:");
                        System.out.println("Withdraw amount:" + amount);
                        System.out.println("Current balance:" + balance);
                    }
                }

                case 3 -> {
                    System.out.print("Your current balance is:" + balance);
                }

                case 4 -> {
                    isEnd = true;
                    System.out.println("Thank you for using this program");
                }

                default -> System.out.println("Invalid option");
            }
        }
    }
}