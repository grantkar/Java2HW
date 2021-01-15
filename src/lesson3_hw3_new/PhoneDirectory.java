package lesson3_hw3_new;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {
    private HashMap<String, List<Integer>> directory;

    public PhoneDirectory(){
        this.directory = new HashMap<>();
    }

    public void add(String surname, int number){
        if(directory.containsKey(surname)){
            List<Integer> numbers = directory.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
            }
        } else {
            directory.put(surname, new ArrayList<>(Arrays.asList(number)));
        }
    }

    public List<Integer> get(String surname){
        if(directory.containsKey(surname)) {
            System.out.println("Номера " + surname + " :");
            System.out.println(directory.get(surname));
            return directory.get(surname);
        }
        else {
            System.out.println("Абонента " +surname + " нет в Телефонной книге!");
        }
        return new ArrayList<>();
    }
}
