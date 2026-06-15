package Week5.constructer;

public class Account {
    String accHolderName;
    double balance;
    String accountType;

    //non parameterised constructoer
    //Account(){
        //this.balance=5000;
        //System.out.println("account constructor");
   // }
    Account(String accHolderName, double balance, String accountType){
        this.accHolderName=accHolderName;
        this.balance=balance;
        this.accountType=accountType;
    }
    //copy construter
    Account (Account account){
        this.accHolderName = account.accHolderName;
        this.balance = account.balance;
        this.accountType = account.accountType;
    }

    public void accountdetail(){
        System.out.println("Name"+accHolderName);
        System.out.println("balance"+balance);
        System.out.println("account type"+ accountType);
    }
}
