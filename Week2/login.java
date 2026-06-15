package Week2;

import java.util.Scanner;

public class login {
    static void main(String[] args) {
        String validUsername="ishant";
        String validPwd="ishant@123";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String username=sc.nextLine();
        System.out.println("Enter Password");
        String pwd=sc.nextLine();

        if (username.equals(validUsername)&& validPwd.equals(pwd)) {
            System.out.println("Login Successful");

        } else if (username.equals(validUsername)&&!pwd.equals(validPwd)) {
            System.out.println("Invalid Password");

        } else if (!username.equals(validUsername)&& pwd.equals(validPwd)) {
            System.out.println("Invalid Username");

        }else {
            System.out.println("Both Username and Password Invalid");
        }

    }
}
