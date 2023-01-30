package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private static final String LONDON = "London";
    private static final String CALIFORNIA = "California";
    private static final String CAPE_TOWN = "Cape Town";
    private static final int HOT_TEMPERATURE = 30;
    private static final int COLD_TEMPERATURE = 10;
    private String location;
    private double temperature;


    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String print() {

        double fahrenheitTemp = (9.0 / 5.0) * temperature + 32;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), fahrenheitTemp);

    }

    public String checkLocation() {
        if (LONDON.equals(location)) {

            return "🌦";

        } else if (CALIFORNIA.equals(location)) {

            return "🌅";

        } else if (CAPE_TOWN.equals(location)) {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > HOT_TEMPERATURE) {

            return "It's too hot 🥵!";

        } else if (temperature < COLD_TEMPERATURE) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
