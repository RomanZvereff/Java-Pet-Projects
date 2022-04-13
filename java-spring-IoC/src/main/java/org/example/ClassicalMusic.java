package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSongName() {
        return "Some classical song";
    }

}
