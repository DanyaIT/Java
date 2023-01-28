package Seminar.lesson_2;

import java.lang.reflect.Array;

public class program_2 {
    public static void main(String[] args) {
        String str = "aaaabbbbccddddw";
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                
            } else {
                newStr.append(str.charAt(i));
                newStr.append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length()-1));
        newStr.append(count);
        System.out.print(newStr);
    }
}
