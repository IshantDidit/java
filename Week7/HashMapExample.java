package Week7;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    static void main(String[] args) {
        //key and value
        //nepal 2
        //india 100
        //china 150
        HashMap<String,Integer> countryPopulation=new HashMap(13,0.6f);
        countryPopulation.put("nepal",2);
        countryPopulation.put("india", 100);
        countryPopulation.put("china", 150);
        System.out.println(countryPopulation.get("india"));

        System.out.println(countryPopulation.containsKey("nepal"));
        System.out.println(countryPopulation.containsValue(150));

        for (String key : countryPopulation.keySet()){
            System.out.println(countryPopulation.get(key));

        }
        for (Integer value: countryPopulation.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> keyValue:countryPopulation.entrySet()){
            System.out.println("key"+keyValue.getKey());
            System.out.println("value"+keyValue.getValue());
        }
    }
}
