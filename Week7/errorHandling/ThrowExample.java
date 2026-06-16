package Week7.errorHandling;

public class ThrowExample {
    static void main(String[] args) {
        //throw
        int age = 3;
        try {
            if (age < 18) {
                // throw new ArithmeticException("not eligible for vote.");
                throw new MyException("not eiligible for vote");

            }
        } catch (MyException e) {
            System.out.println("exception" + e.getMessage());
        }
    }
}
