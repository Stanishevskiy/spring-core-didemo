package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;
import io.tolstjak.services.Fortune;

public class TennisCoach implements Coach {

    private Fortune fortune;

    public void setFortuneService(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Play tennis around 90 minutes";
    }

    @Override
    public String getFortune() {
        return fortune.getDailyFortune();
    }
}
