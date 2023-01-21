package Seminar.lesson_1;

import java.time.LocalDateTime;
import java.util.Scanner;

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class program_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        LocalDateTime date = LocalDateTime.now();
    
        if (date.getHour() >= 5 && date.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (date.getHour() >= 12 && date.getHour() < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (date.getHour() >= 18 && date.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Добрый ночи, %s!", name);
        }
        iScanner.close();
    }

}