package Seminar_2.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        NumberStorage<String> stringNumberStorage = new NumberStorage<>();
//        NumberStorage<Integer> integerNumberStorage = new NumberStorage<>();
//        NumberStorage<Long> longNumberStorage = new NumberStorage<>();
//        NumberStorage<Double> doubleNumberStorage = new NumberStorage<>();
//
//        doubleNumberStorage.add(2.3);
//        doubleNumberStorage.add(2.4);
//        doubleNumberStorage.add(1.1);
//        System.out.println(doubleNumberStorage.sum());
//
//        NumberStorage numberStorage = new NumberStorage();
//        numberStorage.add(2.3);
//        numberStorage.add(2L);
//        numberStorage.add(5);
//
//
        List<Integer> byteArrayList = new ArrayList<>();


        IntStream intStreamRange = IntStream.range(0, 50);
        Stream<Integer> boxed = intStreamRange.boxed();
        Stream<Integer> filtered = boxed.filter(it -> it < 10);
        Stream<String> stringStream = filtered.map(integer -> String.valueOf(integer));
        Stream<String> stringStream1 = stringStream.map(it -> "T" + it);
        String result = stringStream1.collect(Collectors.joining(", "));

        System.out.println(result);


    }

}
