package ua.hillel.nemirovets.homework.homework7;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int progValue = (int) (Math.random() * 11);
        System.out.println("The computer guessed an integer");


        int userValue = 0;
        int counter = 6;
        System.out.println("Enter a number from 0 to 10");

        while (counter > 0) {
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                if (userValue < 0 || userValue > 10) {
                    System.out.println("You entered an incorrect number. The number must be between 0 and 10");
                } else if (userValue == progValue) {
                    System.out.println("Congratulation. You Win!!!");
                    break;
                } else if (progValue > userValue) {
                    System.out.println("Wrong data. Program value is bigger than " + userValue);
                } else {
                    System.out.println("Wrong data. Program value is less than " + userValue);
                }
            } else {
                System.out.println("Wrong data. The number must be between 0 and 10");
            }

            scanner.nextLine();
            System.out.println("Number of attempts left = " + (counter - 1));
            counter--;
        }

    }
}
