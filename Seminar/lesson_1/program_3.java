package Seminar.lesson_1;

public class program_3 {
    public static void main(String[] args) {
                             // 0  1  2  3  4  5        
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                    count = 0;
                }
            }
            // System.out.print(maxCount);
        }
        if (maxCount < count) {
            maxCount = count;
        }
        System.out.println(maxCount);
    }
}
