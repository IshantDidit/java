package Week6.abstraction.BankingSystem;

public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double calculateInterest() {
        // Current accounts may have no interest
        return 0;
    }
}
