package igorkorapin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
	task1();
	task2();
    }

    public static void task1() {
        System.out.println("Задание 1.");
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("apple");
        words.add("apple");
        words.add("apple");
        words.add("orange");
        words.add("orange");
        words.add("orange");
        words.add("mango");
        words.add("lemon");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");
        words.add("cherry");

        System.out.println("Исходный массив");
        System.out.println(words.toString());

        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(words);

        System.out.println("Уникальные слова");
        System.out.println(uniqueWords.toString());

        System.out.println("Подсчет количества повторяющихся слов");
        HashMap<String, Integer> countWords = new HashMap<>();
        for (String w : words) {
            countWords.put(w, countWords.get(w) != null ? countWords.get(w) + 1 : 1);
        }

        System.out.println(countWords.toString());
    }

    public static void task2() {
        System.out.println("Задание 2.");
        PhoneBook myBook = new PhoneBook();

        myBook.add("Ivanov", "1111");
        myBook.add("Petrov", "2222");
        myBook.add("Sidorov", "3333");
        myBook.add("Ivanov", "2211");
        myBook.add("Ivanov", "1122");
        myBook.add("Sidorov", "2233");
        myBook.add("Sidorov", "3322");
        myBook.add("Sidorov", "3311");

        myBook.print();

        System.out.println("Поиск номера");

        myBook.get("Ivanov");
        myBook.get("Petrov");
    }

}
