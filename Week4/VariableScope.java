package Week4;

public class VariableScope {
    String userName; //instance variable / instance scope
    static int age; //static variable
    public static void printInfo(){
        System.out.println(age);

        if ( age>18){
            String address=""; // block scope
        }

    }
    public static void  displayDetail(String newName){
        String name ="nepal"; //local variable
    }
    static void main(String[] args) {

    }
}
