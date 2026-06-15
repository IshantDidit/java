package Week4;

public class MethodExample {
    public static void addition(int a, int b) {
        System.out.println("addition= " + (a+b));

    }
    public static double multiply(double a, double b){
        double res=a*b;
        return res;

    }
    static void main(String[] args){
        addition(3,4);
        System.out.println("multiply " + multiply(3.1,5));
    }
}
