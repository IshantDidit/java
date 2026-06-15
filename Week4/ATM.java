package Week4;

import java.util.Scanner;

public class ATM {
    static double balance = 5000;
    public static void withdrawAmount(double amount){
        if(amount< 1){
            System.out.println("invalid amount");
        } else if (amount>balance) {
            System.out.println("not suffcient");

        } else {
            balance -=amount;
            System.out.println("withdrawamount" + amount);
            System.out.println("current balance" + balance);
        }

    }
    public static void depositAmount(double amount){
        if(amount<=0){
            System.out.println("invalid amount");

        }
        else{
            balance +=amount;
            System.out.println("deposit amount"+amount);
            System.out.println("currect balance"+balance);
        }
    }
    public static void checkBalance(){
        System.out.println("current balance"+balance);

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEnd=false;
        while(!isEnd){
            System.out.println("choose an option");
            System.out.println("1 : withdraw");
            System.out.println("2 : Deposit");
            System.out.println("3 : check balance");
            System.out.println("4 : Exit");
            int option=sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1 ->{
                    System.out.println("enter withdraw amount");
                    double inputAmount=sc.nextDouble();
                    withdrawAmount(inputAmount);
                }// case 1 end
                case 2 ->{
                    System.out.println("enter deposit amount");
                    double inputAmount = sc.nextDouble();
                    depositAmount(inputAmount);
                }//case 2 end
                case 3 ->checkBalance();
                case 4 ->{
                    isEnd = true;
                    System.out.println("exiting");
                }
                default -> System.out.println("indvalid");

            }

        }

    }
}
