package com.pattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        // 这里显示代码
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getTemperature();
            display();
        }

    }
}
