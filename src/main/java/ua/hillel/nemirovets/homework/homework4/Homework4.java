package ua.hillel.nemirovets.homework.homework4;

public class Homework4 {
    public static void main(String[] args) {
        int a = 21; // Length parallelepiped
        int b = 16; // Width parallelepiped
        int c = 13; // Height parallelepiped
        int value = a * b * c; // Formula Value
        System.out.println("Volume of a parallelepiped = " + value);
        int parallelepipedLenght = (4 * a) + (4 * b) + (4 * c);  //Formula Lenght parallelepiped
        System.out.println("length of all sides = " + parallelepipedLenght );
    }
}
