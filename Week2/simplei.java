package Week2;

import java.util.Scanner;

public class simplei{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal");
        int p=sc.nextInt();
        System.out.println(" rate");
        double r=sc.nextDouble();
        System.out.println("time");
        int t=sc.nextInt();
        double SI=(p*r*t)/100;
        System.out.println("Your Simple Interest is:"+SI);

    }
}
