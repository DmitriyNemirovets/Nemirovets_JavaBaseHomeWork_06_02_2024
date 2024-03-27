package ua.hillel.nemirovets.homework.homework15;

public class Main {

    public static void main(String[] args) {
        PopMusic popBand = new PopMusic("Pop Band");
        RockMusic rockBand = new RockMusic("Rock Band");
        ClassicMusic classicBand = new ClassicMusic("Classic Band");

        MusicStyles[] musicBands = {popBand, rockBand, classicBand};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}

