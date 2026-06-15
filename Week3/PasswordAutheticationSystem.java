package Week3;

import java.util.Scanner;

public class PasswordAutheticationSystem {
    static void main(String[] args) {

        String username = "Hello";
        String password = "Ishant";
        System.out.println("Username: " + username);
        int q = 1;

        while (q <= 3) {
            System.out.print("Enter Your Password:");
            String pass = new Scanner(System.in).next();
            if (pass.equals(password)) {
                System.out.println("Your Password has been authenticated");
                q = 5;
            } else {
                System.out.println("Your Password has been NOT authenticated");
                q++;
            }
            if (q == 4) {
                System.out.println("Account locked");
            }
        }
    }
}