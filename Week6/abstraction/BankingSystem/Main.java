package Week6.abstraction.BankingSystem;

public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(60000, 50);
        Account current = new CurrentAccount(70000);

        System.out.println("Savings Interest: " +
                savings.calculateInterest());

        System.out.println("Current Interest: " +
                current.calculateInterest());
    }
}