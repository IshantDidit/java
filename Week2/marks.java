package Week2;

import java.util.Scanner;

public class marks {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("put your Marks:");
        int marks= sc.nextInt();
        if (marks >=90) {
            System.out.println("Your Marks is 90%");
        } else if (marks>=80) {
            System.out.println("Your marks is 80%");
        } else if (marks>=70) {
            System.out.println("Your Marks is 70%");
        } else if (marks>=60) {
            System.out.println("Your Marks is 60%");
        }else{
            System.out.println("Your Marks is below 60");
        }

    }
}
