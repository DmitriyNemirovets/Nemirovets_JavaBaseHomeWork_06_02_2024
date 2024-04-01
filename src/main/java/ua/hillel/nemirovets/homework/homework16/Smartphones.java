package ua.hillel.nemirovets.homework.homework16;

public interface Smartphones {
    void call(String number);

    void sms(String number, String message);

    void internet();

    void executeCommand(String command);
}
