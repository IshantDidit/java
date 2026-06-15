package Week2;

import java.util.Scanner;
//Ishant Dahal

public class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int a =sc.nextInt();

        if (a>0){
            System.out.println("its positive");
        }
        else if (a==0){
            System.out.println("its zero");
        }
        else{
            System.out.println("its negative");
        }
    }
}
