package Week7.groceryManager;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryManager {
    static void main(String[] args) {
        ArrayList<String> grocerylist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = false;

        while (!isEnd){
            System.out.println("choose an option");
            System.out.println("1. Add Item");
            System.out.println("2. Remove item");
            System.out.println("3. List item");
            System.out.println("4. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 ->{
                    System.out.println("enter gorcery item name");
                    String item = scanner.nextLine();
                    grocerylist.add(item);
                }
                case 2 ->{
                    System.out.println("item to remove");
                    String item = scanner.nextLine();
                    grocerylist.remove(item);
                    System.out.println("removed"+ item);
                }
                case 3 ->{
                    System.out.println("the lists");
                    for (String item:grocerylist){
                        System.out.println(item);
                    }

                }
                case 4-> {
                    isEnd=true;
                    System.out.println("exit");
                }
                default -> System.out.println("invalid option1");
            }
        }
    }
}
