package com.codesai.patterns.adapter.temperature;

import org.junit.jupiter.api.Test;

import static com.codesai.patterns.adapter.temperature.City.LasPalmas;
import static com.codesai.patterns.adapter.temperature.City.Madrid;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CityTemperatureTest {

    @Test
    public void get_temperature_in_city() {
        CityTemperature cityTemperature = new CityTemperature();

        assertThat(cityTemperature.getTemperature(Madrid)).isBetween(0d, 40d);
        assertThat(cityTemperature.getTemperature(LasPalmas)).isEqualTo(25d);
    }

    /*@Test
    public void get_temperature_in_city_using_postal_code() {
        assertThat(cityTemperature.getTemperature("28001")).isBetween(0d, 40d);
        assertThat(cityTemperature.getTemperature("35001")).isEqualTo(25d);
    }

    @Test
    public void get_temperature_in_city_using_postal_code_in_farenheit() {
        assertThat(cityTemperature.getTemperature("28001")).isBetween(32d, 104d);
        assertThat(cityTemperature.getTemperature("35001")).isEqualTo(77d);
    }
    */
}