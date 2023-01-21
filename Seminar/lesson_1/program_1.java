package Seminar.lesson_1;
import java.util.Scanner;

public class program_1 {
    public static void main(String[] args) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("name: ");
      String name = iScanner.nextLine();
      System.out.printf("Привет, %s!", name);
      iScanner.close();
    }
    

}

