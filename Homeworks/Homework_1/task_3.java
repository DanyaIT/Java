package Homeworks.Homework_1;

import java.util.Scanner;
/* 
 Задание 3.
Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
Ответ: Такой операции нет
*/

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Укажите первое число: ");
        Integer x = iScanner.nextInt();
        System.out.print("Укажите второе число: ");
        Integer y = iScanner.nextInt();
        System.out.print("Укажите мат. опереацию: ");
        String operation = iScanner.next();
        switch (operation) {
            case "+":
                System.out.print(sum(x, y));
                break;
            case "-":
                System.out.print(minus(x, y));
                break;
            case "/":
                divide(x, y);
                break;
            case "*":
                System.out.print(multi(x, y));
                break;
            default:
                System.out.print("Такую опереацию я не обрабатываю (-_-)");
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static void divide(int x, int y) {
        try {
            int divided = x / y;
            System.out.print(divided);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static int multi(int x, int y) {
        return x * y;
    }

}
