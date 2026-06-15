package Week2;

public class stringe {
    static void main(String[] args) {
        String name="Chilie";
        String name2=new String("Chilie");
        String name3="Chilie";

        System.out.println(name+""+name2);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name2.equals(name3));//true

        String text="Java Programming";
        System.out.println(text.substring(5));
        System.out.println(text.substring(5,8));//pro
    }
}

