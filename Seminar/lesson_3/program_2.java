package Seminar.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

public class program_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }
        Collections.sort(list);
        System.out.print(list);
    }
}
