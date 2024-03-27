package ua.hillel.nemirovets.homework.homework15;

class ClassicMusic extends MusicStyles {
    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing classical music by " + getName());
    }
}