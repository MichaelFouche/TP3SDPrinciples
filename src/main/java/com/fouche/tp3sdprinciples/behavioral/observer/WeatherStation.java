/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author foosh
 */
public class WeatherStation implements WeatherSubject{
    Set<WeatherObserver> weatherObservers;
    int tempreature;

    public WeatherStation(int temppreature) {
        weatherObservers = new HashSet<WeatherObserver>();
        this.tempreature = tempreature;
    }

    @Override
    public void addObserver(WeatherObserver weatherObserver) {
       weatherObservers.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    @Override
    public void doNotify() {
        Iterator <WeatherObserver> it = weatherObservers.iterator();
        while(it.hasNext()){
            WeatherObserver weatherObserver = it.next();
            weatherObserver.doUpdate(tempreature);
        }
    }
    
    
    public void setTempreature(int newTempreature){
       System.out.println("\nWeather station setting tempreature to " + newTempreature);
       tempreature = newTempreature; 
       doNotify();
    }

    public int getTempreature() {
        return tempreature;
    }
    
}
