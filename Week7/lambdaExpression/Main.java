package Week7.lambdaExpression;

public class Main {
    static void main(String[] args) {
        Calculation calc=(a,b)-> a+b;
        System.out.println(calc.addition(3,4));
    }
}
