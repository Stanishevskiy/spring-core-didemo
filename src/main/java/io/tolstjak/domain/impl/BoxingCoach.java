package io.tolstjak.domain.impl;

import io.tolstjak.domain.Coach;
import io.tolstjak.services.Fortune;

public class BoxingCoach implements Coach {

    private Fortune fortune;

    public BoxingCoach() {
    }

    public BoxingCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Boxing around 6 rounds";
    }

    @Override
    public String getFortune() {
        return fortune.getDailyFortune();
    }
}
