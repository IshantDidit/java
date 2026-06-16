package Week7.errorHandling;

public class ThrowExample {
    static void main(String[] args) {
        //throw
        int age=3;
        if (age < 18){
            throw new ArithmeticException("not eligible for vote.");

        }
    }
}
