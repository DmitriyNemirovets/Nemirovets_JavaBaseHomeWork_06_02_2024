package ua.hillel.nemirovets.homework.homework2;

public class Homework2 {
    public static void main(String[] args) {
        String city = "Konotop, Sumskoy region, Ukrain.";
        String latit = "DMS Lat";
        String longi = "DMS Long";

        byte byteLatit1 = 51;
        byte byteLongi1 = 33;
        byte byteLatit2 = 14;
        byte byteLongi2 = 13;

        double doubleLat = 29.61;
        double doubleLong = 36.68;

        char charL = '\u00B0';
        char charLt = '"';

        System.out.println(city);
        System.out.println(latit + " " + byteLatit1 + charL + byteLatit2 + "'" + doubleLat + charLt  + " " + longi + " " + byteLongi1 + charL + byteLongi2 + "'" + doubleLong + charLt);


    }
}
