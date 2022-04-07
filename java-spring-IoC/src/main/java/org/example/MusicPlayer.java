package org.example;

public class MusicPlayer {

    private final Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void playMusic() {
        System.out.println(music.getSongName());
    }

}
