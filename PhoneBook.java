package igorkorapin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    private final HashMap<String, HashSet<String>> book;

    public PhoneBook() {
        this.book = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (book.get(lastName) == null) {
            book.put(lastName, new HashSet<>());
        }
        book.get(lastName).add(phoneNumber);
    }

    public void print() {
        for(Map.Entry<String, HashSet<String>> e : book.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue().toString());
        }
    }
}