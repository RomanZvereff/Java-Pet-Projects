package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class MusicPlayer {

    private Music rockMusic;
    private Music classicalMusic;
    private Music rapMusic;

    @Value("${musicPlayerModel}")
    private String musicPlayerModel;

    @Value("${musicPlayerYear}")
    private int musicPlayerYear;

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
        System.out.println(this);
        System.out.println(rockMusic.getSongName() + " " + classicalMusic.getSongName() + " " + rapMusic.getSongName());
    }

    @PreDestroy
    private void destroy() {
        System.out.println("MusicPlayer...stop and destroy!");
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "musicPlayerModel='" + musicPlayerModel + '\'' +
                ", musicPlayerYear=" + musicPlayerYear +
                '}';
    }
}
