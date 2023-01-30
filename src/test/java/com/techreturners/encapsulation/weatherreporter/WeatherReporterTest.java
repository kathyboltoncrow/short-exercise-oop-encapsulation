package com.techreturners.encapsulation.weatherreporter;
import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WeatherReporterTest {
    @Test
    public void checkLocation() {
        WeatherReporter londonWeatherReporter = new WeatherReporter("London", 45.0);
        assertEquals("🌦", londonWeatherReporter.checkLocation());
        WeatherReporter cairoWeatherReporter = new WeatherReporter("Cairo", 45.0);
        assertEquals("🔆", cairoWeatherReporter.checkLocation());
    }
    @Test
    public void checkTemperature() {
        WeatherReporter londonWeatherReporter = new WeatherReporter("London", 20.0);
        assertEquals("Ahhh...it's just right 😊!", londonWeatherReporter.checkTemperature());
        WeatherReporter cairoWeatherReporter = new WeatherReporter("Cairo", 45.0);
        assertEquals("It's too hot 🥵!", cairoWeatherReporter.checkTemperature());
    }

}
