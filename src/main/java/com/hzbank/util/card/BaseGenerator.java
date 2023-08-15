package com.hzbank.util.card;

import java.util.Date;
import java.util.Random;

public abstract class BaseGenerator {
    public abstract String generate();

    private static Random random = null;

    protected Random getRandomInstance() {
        if (random == null) {
            random = new Random(new Date().getTime());
        }

        return random;
    }
}
