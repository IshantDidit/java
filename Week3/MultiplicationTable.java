package Week3;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int m = 1;

        while (m <= 10) {
            int table = m * n;
            System.out.println(table);
            m++;
        }
    }
}