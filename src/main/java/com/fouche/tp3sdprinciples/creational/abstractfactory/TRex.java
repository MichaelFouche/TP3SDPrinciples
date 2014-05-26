/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.creational.abstractfactory;

import com.fouche.tp3sdprinciples.creational.factorymethod.Animal;

/**
 *
 * @author foosh
 */
public class TRex extends Animal{
    @Override
    public String makeSound(){
        return "Roar";
    }
}
