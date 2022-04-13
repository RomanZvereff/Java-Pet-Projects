package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicService service = context.getBean("musicService", MusicService.class);
        service.startService();

        context.close();
    }

}
