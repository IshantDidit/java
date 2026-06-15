package Week5.constructer;

public class Constructerexample {
    static void main(String[] args) {
        Account savingAccount=new Account("Ram",5000,"saving");
        savingAccount.accountdetail();

        Account currentAccount = new Account(savingAccount);
        currentAccount.accountdetail();
    }
}
