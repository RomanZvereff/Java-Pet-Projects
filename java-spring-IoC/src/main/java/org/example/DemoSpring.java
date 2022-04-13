package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer =  context.getBean("musicPlayer", MusicPlayer.class);

        Music classicalMusic = context.getBean("classicalMusic", Music.class);

        musicPlayer.setMusic(classicalMusic);
        musicPlayer.playMusic();

        context.close();
    }

}
