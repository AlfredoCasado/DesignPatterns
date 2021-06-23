package com.codesai.patterns.adapter.temperature;

import java.util.Random;

public class CityTemperature {

    public double getTemperature(City city) {
        switch (city) {
            case Madrid: return new Random().nextInt(40);
            case LasPalmas: return 25d;
            default: return new Random().nextInt(60) - 20;
        }
    }

}
