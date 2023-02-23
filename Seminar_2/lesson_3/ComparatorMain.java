package Seminar_2.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
//        Создать класс Notebook с полями (price(double), ram(int))
//        1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
//        2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
//        3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)


        List<String> strings = new ArrayList<>(List.of("first", "abcde", "Igor", "geekbrains", "aa", "AA"));
        Collections.sort(strings);

        String first = "first";
        String second = "second";
        int compare = first.compareTo(second);

        System.out.println(strings);


////        Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
//        Comparator<String> stringComparator = Comparator.comparingInt(String::length);
//
//
//        Comparator<String> stringLengthComparator = Comparator.comparingInt(String::length);
//
//        Collections.sort(strings, stringLengthComparator);
//
//        String x = "abcde";
//        String y = "foo";
//        int compare = stringLengthComparator.compare(x, y);
////        if (x > y) {
////        if (compare > 0) {
////            String tmp = x;
////            x = y;
////            y = tmp;
////        }
//
//        System.out.println(strings);

    }

    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            if (o1.length() < o2.length()) {
                return -1;
            } else if (o1.length() > o2.length()) {
                return 1;
            }

            return 0;
        }
    }


}
