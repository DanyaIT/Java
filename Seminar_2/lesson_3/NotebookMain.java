package Seminar_2.lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Создать класс Notebook с полями (price(double), ram(int))
// 1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
// 2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
// 3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

public class NotebookMain {
    public static void main(String[] args) {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(15000.32, 16));
        notebooks.add(new Notebook(17000.23, 8));
        notebooks.add(new Notebook(18000.23, 4));
        notebooks.add(new Notebook(13000.23, 32));

        // 1. По цене
        Comparator<Notebook> PriceComparator = new ComparePriceComparator();
        Collections.sort(notebooks, PriceComparator);
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }
        System.out.println();

        // 2. По памяти
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam));
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }
        System.out.println();

        // 3. Сортировка сначала по памяти, потом по цене
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam)
                .thenComparingDouble(Notebook::getPrice));
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }

    }

    public static class Notebook {
        private double price;
        private int ram;

        public Notebook(double price, int ram) {
            this.price = price;
            this.ram = ram;
        }

        public double getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public String printNotebook() {
            System.out.println("price: " + price + "р; RAM: " + ram + " гб;");
            return null;
        }
    }

    public static class ComparePriceComparator implements Comparator<Notebook> {

        @Override
        public int compare(Notebook o1, Notebook o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }

}
