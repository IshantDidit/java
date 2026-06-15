package Week6.polymorphism;

public class MethodOverridingExample {
    static void main(String[] args) {
        //runtime polymorphism
        AdminUser adminUser=new AdminUser("sathoe","11","hellppw");
        adminUser.detail();
        adminUser.demo();
        User adminUser2=new AdminUser("ajfj","34","kali");
        adminUser2.detail();
    }
}
