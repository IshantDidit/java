package Week6.innerClass;


public class Main {
    static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("x"+outerClass.x);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("y"+innerClass.y);
    }
}
