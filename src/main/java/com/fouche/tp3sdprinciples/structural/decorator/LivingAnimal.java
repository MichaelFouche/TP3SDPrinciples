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
public class LivingAnimal implements Animal{
    
    @Override
    public String describe() {
        System.out.println("I R Animal");
        return "animal";
    }
}
