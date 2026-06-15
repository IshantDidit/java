package Week3;

import java.util.Scanner;

public class TrafficLightSystem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a signal: ");
        String str;
        str = sc.nextLine();
        str = str.toLowerCase();

        switch (str) {
            case "red":
                System.out.println("STOP");
                break;

            case "yellow":
                System.out.println("SLOW DOWN");
                break;

            case "green":
                System.out.println("GO");
                break;

            default:
                System.out.println("Invalid Signal");
        }
    }
}
