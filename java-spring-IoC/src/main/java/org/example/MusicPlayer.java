package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;
    private Music rapMusic;

    public MusicPlayer() {
    }
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public Music getRapMusic() {
        return rapMusic;
    }

    @Autowired
    @Qualifier("rapMusic")
    public void setRapMusic(Music rapMusic) {
        this.rapMusic = rapMusic;
    }

    public Music getRockMusic() {
        return rockMusic;
    }

    public Music getClassicalMusic() {
        return classicalMusic;
    }

    public void playMusic() {
        System.out.println(rockMusic.getSongName() + " " + classicalMusic.getSongName() + " " + rapMusic.getSongName());
    }

}
