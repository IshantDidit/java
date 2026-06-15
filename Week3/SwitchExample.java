package Week3;

import java.util.Scanner;

public class SwitchExample {
    static void main(String[] args) {

        int statusCode = 200;

        // Traditional switch
        switch (statusCode) {
            case 500:
                System.out.println("Internet server error");
                break;

            case 200:
                System.out.println("Success response");
                break;

            case 400:
                System.out.println("Validation error");
                break;

            default:
                System.out.println("Invalid status code");
        }

        switch (statusCode) {
            case 500 -> System.out.println("Internet server error");
            case 200 -> System.out.println("Success response");
            case 400 -> System.out.println("Validation error");
            default  -> System.out.println("Invalid status code");
        }

        String result = "";
        switch (statusCode) {
            case 500 -> result = ("Internet server error");
            case 200 -> result = ("Success response");
            case 400 -> result = ("Validation error");
            default  -> result = ("Invalid status code");
        }
        System.out.println(result);

        String result2 = switch (statusCode) {
            case 500 -> "Internet server error";
            case 200 -> "Success response";
            case 400 -> "Validation error";
            default  -> "Invalid status code";
        };
        System.out.println(result2);
    }
}