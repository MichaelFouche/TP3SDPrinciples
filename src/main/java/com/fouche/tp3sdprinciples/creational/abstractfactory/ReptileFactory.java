/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.creational.abstractfactory;


/**
 *
 * @author foosh
 */
public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) {
        if("Snake".equals(type))
            return new Snake();
        else
            return new TRex();
    }
}
