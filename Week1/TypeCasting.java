package Week1;

import java.sql.SQLOutput;

public class TypeCasting {
    public static void main(String[] args) {
        int price=280;
        double newPrice=price;   //implicit or widening type casting
        System.out.println(price);
        System.out.println(newPrice);

        double clothPrice = 5900.45; // explicit or narrowing type casting
        int newClothPrice = (int) clothPrice;
        System.out.println(clothPrice);
        System.out.println("new cloth price = " +newClothPrice);

        int num1= 90;
        int num2= 234;

        int result = num2/num1;
        System.out.println("result is ="+result);
    }
}
