package com.skywatch.application.services;

import java.util.HashMap;
import java.util.Map;

public class WeatherService {

    // This is a placeholder for the weather data storage
    private final Map<String, WeatherData> weatherDataMap;

    public WeatherService() {
        weatherDataMap = new HashMap<>();
        // You might want to initialize this with some default data or load from an API
    }

    // Method to add weather data for a specific location
    public void addWeatherData(String location, WeatherData weatherData) {
        weatherDataMap.put(location, weatherData);
        System.out.println("Weather data added for: " + location);
    }

    // Method to retrieve current weather data for a specific location
    public WeatherData getCurrentWeather(String location) {
        return weatherDataMap.get(location); // Returns null if not found
    }

    // Method to fetch weather data from an external API (pseudocode)
    public void fetchWeatherData(String location) {
        // This is where you'd integrate with a weather API
        // For example, calling OpenWeatherMap API to get weather data
        // Here, we will simulate this by adding dummy data

        // Simulated data retrieval
        WeatherData simulatedWeatherData = new WeatherData(location, 25.0, "Clear", 1015);
        addWeatherData(location, simulatedWeatherData);
    }

    // Inner class for WeatherData
    public static class WeatherData {
        private final String location;
        private final double temperature; // Temperature in Celsius
        private final String condition; // Weather condition (e.g., Clear, Rainy)
        private final int pressure; // Atmospheric pressure in hPa

        public WeatherData(String location, double temperature, String condition, int pressure) {
            this.location = location;
            this.temperature = temperature;
            this.condition = condition;
            this.pressure = pressure;
        }

        public String getLocation() {
            return location;
        }

        public double getTemperature() {
            return temperature;
        }

        public String getCondition() {
            return condition;
        }

        public int getPressure() {
            return pressure;
        }

        @Override
        public String toString() {
            return "WeatherData{" +
                    "location='" + location + '\'' +
                    ", temperature=" + temperature +
                    ", condition='" + condition + '\'' +
                    ", pressure=" + pressure +
                    '}';
        }
    }
}
