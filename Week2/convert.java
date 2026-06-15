package Week2;

import java.util.Scanner;

public class convert {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your USD");
        int userInput=sc.nextInt();
        int NPR=userInput*150;
        System.out.println("Your USD is:"+NPR);

    }
}
