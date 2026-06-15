package Week5.accessModifier;

public class Vehicle {
    //access on same package class
    //access on outside package class through inheritance
    protected void printDetail(){
        System.out.println("this is vehicle");
    }
    void start(){
        //default
        //access on same package class
        System.out.println("vehicle start");
    }
    //access on same class
    private void stop(){
        System.out.println("vehicle stop");
    }
}

