package io.tolstjak.services.impl;

import io.tolstjak.services.Fortune;

public class RandomFortuneService implements Fortune {

    private String[] allFortuneVariants;

    public void setAllFortuneVariants(String[] allFortuneVariants) {
        this.allFortuneVariants = allFortuneVariants;
    }

    public String[] getAllFortuneVariants() {
        return allFortuneVariants;
    }

    public String getDailyFortune() {
        int variantSize = allFortuneVariants.length;
        int currentVariant = (int) (Math.random() * variantSize);
        return allFortuneVariants[currentVariant];
    }
}
