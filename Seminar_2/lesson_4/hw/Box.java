package Seminar_2.lesson4.hw;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    List<T> fruits = new ArrayList<T>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T fr : fruits) {
            weight += fr.getWeight();
        }
        return weight;
    }

    public void moveTo(Box<? super T> anotherBox) {
        for (T fr : fruits) {
            anotherBox.add(fr);
        }
        fruits = new ArrayList<T>();
    }

}