package Week5;

import Week5.accessModifier.Vehicle;

public class TestAccess extends Vehicle {
    static void main(String[] args) {
        Vehicle bus=new Vehicle();
        TestAccess testAccess = new TestAccess();
        testAccess.printDetail();

    }
}
