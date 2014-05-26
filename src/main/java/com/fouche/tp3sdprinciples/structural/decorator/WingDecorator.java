/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.structural.decorator;

/**
 *
 * @author foosh
 */
public class WingDecorator extends AnimalDecorator{
    public WingDecorator(Animal animal){
        super(animal);
    }
    @Override
    public String describe() {
        System.out.println("I have wings");
        fly();
        return "flying";
    }
    public String  fly(){
        System.out.println("i can fly");
        return "flying";
    }
}
