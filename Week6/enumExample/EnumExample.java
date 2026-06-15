package Week6.enumExample;

public class EnumExample {
    static void main(String[] args) {
        Level level = Level.LOW;
        switch (level){
            case LOW -> System.out.println("temp is low");
            case MEDIUM -> System.out.println("temp medium");
            case HIGH -> System.out.println("high temp");
        }
    }
}
