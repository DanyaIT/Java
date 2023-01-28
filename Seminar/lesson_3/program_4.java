package Seminar.lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. 
// Напишите метод для заполнения данной структуры.

public class program_4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Укажите жанр: ");
        String genre = iScanner.nextLine();
        System.out.print("Укажите название книги: ");
        String book = iScanner.nextLine();
        System.out.print("Укажите жанр: ");
        String genre2 = iScanner.nextLine();
        System.out.print("Укажите название книги: ");
        String book2 = iScanner.nextLine();

        ArrayList<String> list = new ArrayList<String>();
        list.add(genre);
        list.add(book);
        list.add(genre2);
        list.add(book2);
        System.out.println(list);
        matrix.add(list);
        System.out.print(matrix);
    }
}
