package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer =  context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2 =  context.getBean("musicPlayerBean", MusicPlayer.class);

        boolean isEquals = musicPlayer == musicPlayer2;
        System.out.println(isEquals);

        musicPlayer2.setMusicPlayerYear(2022);

        System.out.println(musicPlayer.getMusicPlayerYear());
        System.out.println(musicPlayer2.getMusicPlayerYear());

        context.close();
    }

}
