package ua.hillel.nemirovets.homework.homework8;

public class Homework8 {
    public static void main(String[] args) {
        int count = 0;
        int shuttles = 155;
        for (int i = 1; i <= shuttles; i++) {
            int result = i;
            while (result > 0) {
                if (result % 10 == 4 || result % 10 == 9) {
                    result = result % 10;
                    break;
                }
                result = result / 10;
            }
            if (result != 4 && result != 9) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Shuttles amount = " + count);
    }
}
