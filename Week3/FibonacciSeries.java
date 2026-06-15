package Week3;

import java.util.Scanner;

public class FibonacciSeries {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci series: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            //System.out.print(a + " ");
        }
    }
}