package Seminar.lesson_2;

public class program_1 {
    public static void main(String[] args) {
    var s = System.currentTimeMillis();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
    sb.append("TEST");
    }
    System.out.println(sb);
    System.out.println(System.currentTimeMillis() - s + " мс");
    }
   }
   