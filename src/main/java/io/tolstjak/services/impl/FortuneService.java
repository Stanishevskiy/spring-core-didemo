package io.tolstjak.services.impl;

import io.tolstjak.services.Fortune;

public class FortuneService implements Fortune {

    public String getDailyFortune() {
        return "Today a lucky day";
    }
}
