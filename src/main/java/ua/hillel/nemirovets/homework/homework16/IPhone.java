package ua.hillel.nemirovets.homework.homework16;

 class iPhones implements Smartphones, IOs {
    public void call(String number) {
        System.out.println("Calling " + number + " from an iPhone.");
    }

    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + " from an iPhone: " + message);
    }

    public void internet() {
        System.out.println("Browsing the internet on an iPhone.");
    }

    public void useFaceID() {
        System.out.println("Using Face ID on iPhone.");
    }
}