package Week5;

public class Main {
    static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.colour = "black";
        dog1.age = 6;
        dog1.height = 14;
        dog1.breed = "Breed A";
        dog1.bark();
        dog1.run();

        Dog dog2=new Dog();
        dog2.colour = "White";
        dog2.age = 4;
        dog2.height = 10;
        dog2.breed = "Breed B";
        dog2.bark();
        dog2.run();

        Dog dog3=new Dog();
        dog3.colour = "Orange";
        dog3.age = 7;
        dog3.height = 15;
        dog3.breed = "Breed B";
        dog3.bark();
        dog3.run();
    }
}
