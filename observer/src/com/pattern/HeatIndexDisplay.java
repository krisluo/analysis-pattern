package com.pattern;

public class HeatIndexDisplay implements Observer,DisplayElement{
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // ... formula
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
