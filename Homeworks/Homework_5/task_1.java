package Homeworks.Homework_5;

import java.util.HashMap;
import java.util.List;

// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

public class task_1 {
    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Иванов");
    }

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void addInPhoneBook() {
        phoneBook.put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Сидоров", List.of("+7(555)555-55-55", "+7(666)666-66-66"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
