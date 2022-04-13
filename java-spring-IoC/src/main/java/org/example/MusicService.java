package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicService {

    public MusicService() {
    }

    private MusicPlayer musicPlayer;

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
