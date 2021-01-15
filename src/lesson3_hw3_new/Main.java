package lesson3_hw3_new;

import lesson3HW3.PhoneDirectory;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory kontakt = new PhoneDirectory();

        String [] strings = {"adc", "acd", "abc", "ABC", "while", "abc", "ABC", "adc", "abc", "run", "run", "adc",

                "abc", "rUn", "string"};

        System.out.println(Arrays.toString(strings));

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(strings));
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            Integer val = map.getOrDefault(str, 0);
            map.put(str, val+1);
        }
        System.out.println(map);



        kontakt.add("Иванов", 555777);
        kontakt.add("Сидоров", 123456);
        kontakt.add("Карпенко", 987654);
        kontakt.add("Васильев", 456456);
        kontakt.add("Игнатьев", 777777);
        kontakt.add("Иванов", 555777);
        kontakt.add("Иванов", 789456);


        kontakt.get("Сидоров");
        kontakt.get("СИДОРОВ");
        kontakt.get("Иванов");
        kontakt.get("Игнатьев");
    }
}
