package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;
import io.tolstjak.services.Fortune;

public class SwimmingCoach implements Coach {

    private Fortune fortune;
    private String name;
    private String email;

    public SwimmingCoach() {
    }

    public SwimmingCoach(Fortune fortune, String name, String email) {
        this.fortune = fortune;
        this.name = name;
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        return "Coach " + name + " with email: " + email + "\n" +
                "Gave workout: Swim around 500 meters";
    }

    @Override
    public String getFortune() {
        return fortune.getDailyFortune();
    }
}
