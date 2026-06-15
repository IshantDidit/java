package Week6.abstraction;

public class Main {
    static void main(String[] args){
        Account savingAccount = new SavingAccount();
        savingAccount.accountDetail();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.accountDetail();

        Vehicle car=new Car();
        Vehicle.test();
        car.start();
        car.stop();
        car.music();
    }

}
