package Homeworks.Homework_1;

/* Задание 2.
Вывести все простые числа от 1 до 1000
*/

public class task_2 {
    public static void main(String[] args) {
        printSimpleNumbers(1000);
    }

    public static void printSimpleNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "; ");
            }
        }
    }
}
