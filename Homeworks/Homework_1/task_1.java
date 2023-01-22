package Homeworks.Homework_1;

import java.util.Scanner;
/*Задание 1.
Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */

public class task_1 {
    public static void main(String[] args) {
        System.out.printf("Сумма чисел равна: %s", searchSum());
        System.out.println("");

        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Укажите факториал числа: ");
        Integer n = iScanner.nextInt();

        System.out.printf("Факториал числа %s", n);
        System.out.printf(" равен: %s", searchFactorial(n));


    }

    public static int searchSum() {
        Integer sum = 0;
        try {
            Scanner iScanner = new Scanner(System.in, "cp866");
            System.out.print("Укажите конечное значение промежутка: ");
            Integer n = iScanner.nextInt();
            if (n < 0) {
                throw new Error("Укажите положительное значение");
            }
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        return sum;
    }

    public static int searchFactorial(Integer n){
        if(n == 1) return 1;
        if(n == 0) return 0;
        if(n < 0) return 0;
        n *= searchFactorial(n - 1);
        return n;
    }
}
