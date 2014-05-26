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
public class LegDecorator extends AnimalDecorator{
    public LegDecorator(Animal animal){
        super(animal);
    }
    @Override
    public String describe() {
        animal.describe();;
        System.out.println("i have legs");
        
        dance();
        return "dancing";
    }
    public String dance() {
        System.out.println("i can dance");
        return "dancing";
    }
}
