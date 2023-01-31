package Homeworks.Homework_3;

import java.util.ArrayList;
import java.util.Random;

// Задание 1.
// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

public class task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < 10; i++) {
            list.add(random.nextInt(11));
        }
        System.out.println(list);
        int i = 0;
        while(i<list.size())
        {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else i++;
        }
        System.out.println(list);
    }
    
}
