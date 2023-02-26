package Seminar_2.lesson4;


import java.util.ArrayList;
import java.util.List;

public class NumberStorage<T extends Number> {

    private final List<T> numbers = new ArrayList<>();

    public void add(T number) {
        numbers.add(number);
    }

    public int sum() {
        int sum = 0;
        for (T number : numbers) {
            sum += number.intValue();
        }
        return sum;
    }

}

