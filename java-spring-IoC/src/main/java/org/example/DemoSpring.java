package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer =  context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getMusicPlayerModel());
        System.out.println(musicPlayer.getMusicPlayerYear());

        context.close();
    }

}
