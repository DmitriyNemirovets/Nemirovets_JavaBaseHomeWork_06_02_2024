package ua.hillel.nemirovets.homework.homework16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from an Android phone.");
    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " from an Android phone: " + message);
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone.");
    }

    @Override
    public void runTerminal() {
        System.out.println("Running terminal on Android phone.");
    }

    @Override
    public void executeCommand(String command) {
        System.out.println("Executing command on Android phone: " + command);
    }
}