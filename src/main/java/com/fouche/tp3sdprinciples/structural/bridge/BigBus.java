/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.structural.bridge;

/**
 *
 * @author foosh
 */
public class BigBus extends Vehicle{
    public BigBus(Engine engine){
        this.weightKg = 3000;
        this.engine = engine;
    }
    
    @Override
    public void drive() {
        System.out.println("bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
}
