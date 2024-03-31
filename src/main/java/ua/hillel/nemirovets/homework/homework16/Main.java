package ua.hillel.nemirovets.homework.homework16;

public class Main {
    public static void main(String[] args) {
        // Створення екземпляра Androids
        Androids androidPhone = new Androids();
        androidPhone.call("123456789");
        androidPhone.sms("123456789", "Hello there!");
        androidPhone.internet();
        androidPhone.runTerminal();
        androidPhone.executeCommand("ls");

        // Створення екземпляра iPhones
        iPhones iPhone = new iPhones();
        iPhone.call("987654321");
        iPhone.sms("987654321", "Hi!");
        iPhone.internet();
        iPhone.useFaceID();
    }
}