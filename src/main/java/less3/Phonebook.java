package less3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Phonebook {

    private HashMap<String, ArrayList> phonebook = new HashMap<>();

    public void addPhone(String surname, int number){
        ArrayList<Integer> numbersPhone = new ArrayList<>();
       if (!phonebook.containsKey(surname)) {
           numbersPhone.add(number);
           phonebook.put(surname, numbersPhone);
        }
        else {
           phonebook.get(surname).add(number);
        }
     }

     public ArrayList getPhone(String name){
         System.out.println(name + phonebook.get(name));
            return phonebook.get(name);
     }

}
