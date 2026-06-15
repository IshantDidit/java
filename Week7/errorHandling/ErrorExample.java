package Week7.errorHandling;

public class ErrorExample {

    public void addition(int a, int b){
        System.out.println("Addition"+ (a*b)); // logical error
    }
    static void main(String[] args) {
        int a; // syntax error

        int value1=100;
        int value2=0;
        //runtime error
        System.out.println("----program started------");
        int result=value1/value2;
        System.out.println("result="+result);
        System.out.println("==========program end==========");

    }
}
