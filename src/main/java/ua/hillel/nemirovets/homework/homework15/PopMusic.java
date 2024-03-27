package ua.hillel.nemirovets.homework.homework15;

class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing pop music by " + getName());
    }
}