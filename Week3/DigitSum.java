package Week3;

public class DigitSum {

    static void main(String[] args) {

        int number = 12345;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;
            sum += digit;
            number = number / 10; //number/=10;

        }

        System.out.println("sum=" + sum);

    }
}