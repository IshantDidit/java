package Week5.encapsulation;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0 || age>=150){
            System.out.println("Invalid age");
        }
        else{
            this.age = age;
        }
    }
}
