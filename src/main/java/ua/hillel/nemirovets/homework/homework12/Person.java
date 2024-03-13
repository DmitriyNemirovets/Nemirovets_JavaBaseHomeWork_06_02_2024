package ua.hillel.nemirovets.homework.homework12;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "7742123513"));
    }

    public static String personInfo(String name, String surname, String city, String tel) {
        return "Call a citizen " + name + " " + surname + " in town " + city + " you can by number " + tel + ".";
    }
}
