package Week6.abstraction;

public interface Vehicle {
    void start();

    void stop();
    //default method
    default void music(){
        System.out.println("vehicle music");
    }

    public static void test(){
        System.out.println("test");
    }
}
