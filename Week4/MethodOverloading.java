package Week4;

public class MethodOverloading {
    public static void addition(int a, int b) {
        System.out.println("Addition=" + (a + b));

    }

    public static void addition(int a, double c) {
        System.out.println("Addition=" + (a + c));
    }

    public static void addition(int a, int b, int c) {
        System.out.println("Addition=" + (a + b + c));
    }

    static void main(String[] args) {
        addition(2, 3);
        addition(4, 5.1);
        addition(2,3,54);

    }
}
