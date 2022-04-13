package org.example;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    @Override
    public String getSongName() {
        return "Some rap song";
    }
}
