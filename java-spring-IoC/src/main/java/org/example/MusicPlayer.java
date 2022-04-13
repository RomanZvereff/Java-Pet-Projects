package org.example;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;
    private String musicPlayerModel;
    private int musicPlayerYear;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String getMusicPlayerModel() {
        return musicPlayerModel;
    }

    public void setMusicPlayerModel(String musicPlayerModel) {
        this.musicPlayerModel = musicPlayerModel;
    }

    public int getMusicPlayerYear() {
        return musicPlayerYear;
    }

    public void setMusicPlayerYear(int musicPlayerYear) {
        this.musicPlayerYear = musicPlayerYear;
    }

    public void playMusic() {
        System.out.println(music.getSongName());
    }

}
