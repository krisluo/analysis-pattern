package com.pattern;

import java.util.*;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    private List<Float> temperatures;

    public StatisticsDisplay(Observable observable) {
        this.temperatures = new ArrayList<>();
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg() + "/" + max() + "/" + min());
    }

    @Override
    public void update(Observable observable,Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperatures.add(weatherData.getTemperature());
            this.temperatures.sort(Float::compareTo);
            display();
        }

    }

    private float min(){
        if (this.temperatures.size()>0){
            return this.temperatures.get(0);
        }
        return 0f;
    }

    private float max(){
        if (this.temperatures.size()>0){
            return this.temperatures.get(temperatures.size() - 1);
        }
        return 0f;
    }

    private float avg(){
        if (temperatures.size()>0){
            float sum = 0f;
            for (float temp : this.temperatures){
                sum += temp;
            }
            return sum/temperatures.size();
        }
        return 0f;
    }
}
