package Week5.encapsulation;

public class EncapsulationExample {
    static void main(String[] args) {
        User admin = new User();
        admin.setName("amar");
        admin.setAge(24);
        System.out.println("name" + admin.getName());
        System.out.println("age"+admin.getAge());
    }
}
