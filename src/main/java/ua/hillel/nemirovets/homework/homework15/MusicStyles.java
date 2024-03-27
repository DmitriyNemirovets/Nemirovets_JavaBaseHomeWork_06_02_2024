package ua.hillel.nemirovets.homework.homework15;

public abstract class MusicStyles {
    private String name;
    public MusicStyles(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void playMusic();
}