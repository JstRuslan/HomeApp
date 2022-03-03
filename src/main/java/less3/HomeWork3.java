package less3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HomeWork3 {

    public static void main(String[] args){

        String[] words = {"one", "two", "three", "four", "five", "one", "two", "three", "four", "five", "six", "one", "two", "three"};
        ArrayList<String> listWords = new ArrayList<>();
        Collections.addAll(listWords, words);
        System.out.println(">>>Vocabulary:" + listWords);

        HashSet<String> uniquesWords = new HashSet<>(listWords);
        System.out.println(">>>Uniques words: " + uniquesWords);

        System.out.println(">>>Count of repeat: ");
        for (String i : listWords) {
            Collections.frequency(listWords, i);
            System.out.printf("%s --> %d раз\n", i, Collections.frequency(listWords, i));
        }

        System.out.println(">>>Phonebook");

        Phonebook book = new Phonebook();
        book.addPhone("Philipov", 123);
        book.addPhone("Philipov", 234);
        book.addPhone("Kasparov", 345);
        book.addPhone("Ivanov", 456);
        book.addPhone("Shalyapin", 567);
        book.addPhone("Philipov", 567);

        book.getPhone("Philipov");
    }
}
