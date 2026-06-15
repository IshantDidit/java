package Week6.polymorphism;

public class AdminUser extends User{
    private String username;

    public AdminUser(String name, String age, String username) {
        super(name, age);
        this.username = username;
    }

    @Override //annotation - to give info, validate
    public void detail() {
        super.detail();
        System.out.println("username"+username);
    }
    public void demo(){
        System.out.println("demo");
    }
}
