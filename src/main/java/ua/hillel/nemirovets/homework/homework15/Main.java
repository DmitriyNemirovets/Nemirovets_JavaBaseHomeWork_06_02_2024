package ua.hillel.nemirovets.homework.homework15;

public class Main {

    public static void main(String[] args) {
        PopMusic popBand = new PopMusic("Pop Band");
        RockMusic rockBand = new RockMusic("Rock Band");
        ClassicMusic classicOrchestra = new ClassicMusic("Classic Orchestra");

        MusicStyles[] musicBands = {popBand, rockBand, classicOrchestra};

        for (MusicStyles band : musicBands) {
            band.playMusic();
        }
    }
}

