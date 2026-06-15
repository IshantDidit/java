package Week2;

public class JavaCondition {
    static void main(String[] args) {
        int number = 313;
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");

        }
        int days = 4;

        if (days == 1) {
            System.out.println("Sunday");
        } else if (days == 2) {
            System.out.println("Monday");
        } else if (days == 3) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Some Other Days");

        }

    }
}
