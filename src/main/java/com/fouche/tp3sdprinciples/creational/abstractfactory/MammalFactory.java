/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.creational.abstractfactory;

import com.fouche.tp3sdprinciples.creational.factorymethod.Animal;
import com.fouche.tp3sdprinciples.creational.factorymethod.Cat;
import com.fouche.tp3sdprinciples.creational.factorymethod.Dog;

/**
 *
 * @author foosh
 */
public class MammalFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type){
        if("Canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
}
