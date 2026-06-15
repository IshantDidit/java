package Week7;
import java.util.LinkedList;
public class LinkListExample {
    static void main(String[] args) {
        LinkedList<String> places = new LinkedList<>();
        places.add("chitwan");
        places.add("pokhara");
        places.add("kathmandu");
        places.addFirst("gorkha");
        places.addLast("rara");
        places.remove("rara");
        places.removeFirst();
        places.removeLast();
        System.out.println(places);

        // for each loop
        for (String place:places){
            System.out.println(place);
        }
        LinkedList<Integer> values = new LinkedList<>();
        values.add(12);
        values.add(36);
        values.add(39);
        values.add(52);
        values.add(65);
        values.removeIf(x -> x % 2==0 );


    }
}
