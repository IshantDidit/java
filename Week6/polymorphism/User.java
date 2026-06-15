package Week6.polymorphism;

public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public void detail(){
        System.out.println("name"+name);
        System.out.println("age"+age);
    }
}
