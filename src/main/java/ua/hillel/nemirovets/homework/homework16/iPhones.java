package ua.hillel.nemirovets.homework.homework16;

public class iPhones implements Smartphones, IOs {
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from an iPhone.");
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " from an iPhone: " + message);
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone.");
    }

    @Override
    public void executeCommand(String command) {
        System.out.println("Execute Command code for Iphone " + command);
    }

    @Override
    public void useFaceID() {
        System.out.println("Using Face ID on iPhone.");

    }
}