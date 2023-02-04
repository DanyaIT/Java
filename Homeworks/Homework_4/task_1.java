package Homeworks.Homework_4;

import java.util.LinkedList;

// Задание 1.
// ​
// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.
// ​

public class task_1 {
    public static void main(String[] args) {

        int[] listMas = {1,34,24,6,37,45,69,5};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println(linkList);

        
    }
}

