package Week3;

import java.util.Scanner;

public class ReverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();
        int len = str.length();
        String reverse = "";

        for (int i = len - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.print("The reverse is " + reverse);
        System.out.println();

        if (reverse.equals(str)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}