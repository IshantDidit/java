package Week6.polymorphism;

public class MethodOverloadingExample {
    public static void addition(int a, int b) {
        System.out.println("Addition=" + (a + b));

    }
    public static void addition(double a, double b) {
        System.out.println("Addition=" + (a + b));

    }
    public static void addition(int a, int b, int c) {
        System.out.println("Addition=" + (a + b + c));

    }

    static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.addition(2, 3);
        methodOverloadingExample.addition(4, 5.1);
        methodOverloadingExample.addition(2,3,54);
    }
}

