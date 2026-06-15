package Week7;

import java.util.ArrayList;

public class ArrayListExample {
    static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2); //{2,5,4}
        numbers.add(3);
        numbers.add(4);
        numbers.add(22);
        numbers.add(1,10);
        numbers.set(0,100);
        numbers.remove(Integer.valueOf(22));
        System.out.println(numbers);

        ArrayList<String>names=new ArrayList<>();
        names.add("KTM");
        names.add("Pokhara");
        names.remove("ktm");
        System.out.println(names);

        //GET
        System.out.println(numbers.get(2));
        System.out.println(numbers.contains(45));

        for(int num: numbers){
            System.out.println(num);
        }

       // for(int i=5; i <=20; i++){
        //    numbers.add(i);
        }



    }
