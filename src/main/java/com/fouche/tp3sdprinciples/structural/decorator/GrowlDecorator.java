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
public class GrowlDecorator  extends AnimalDecorator   {
    public GrowlDecorator(Animal animal){
        super(animal);
    }
    @Override
    public String describe() {
        animal.describe();
        growl();
        return "grr";
    }
    public String growl() {
        System.out.println("grrrrrrr");
        return "grr";
    }
}
