package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;
import io.tolstjak.services.Fortune;

public class TrackCoach implements Coach {

    private Fortune fortune;
    private String name;
    private String email;

    public void setFortune(Fortune fortune) {
        this.fortune = fortune;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        return "Coach " + name + " with email: " + email + "\n" +
                "Run around 20 km";
    }

    @Override
    public String getFortune() {
        return fortune.getDailyFortune();
    }
}
