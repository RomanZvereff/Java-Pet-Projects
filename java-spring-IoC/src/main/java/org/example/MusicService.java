package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class MusicService {

    private MusicPlayer musicPlayer;

    public MusicService() {
    }

    @PostConstruct
    private void init() {
        System.out.println("MusicService...initialization!");
    }

    // Not working when @Scope("prototype")
    @PreDestroy
    private void destroy() {
        System.out.println("MusicService...destroyed!");
    }

    @Autowired
    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void startService() {
        musicPlayer.playMusic();
    }

}
