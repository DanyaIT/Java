package Homeworks.Homework_3;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;

// Задание 2:
// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        double max = list.get(list.size() - 1);
        double min = list.get(list.get(0));
        double avg = (max + min) / 2;
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
    }
}
