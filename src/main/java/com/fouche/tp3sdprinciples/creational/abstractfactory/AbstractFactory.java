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
public class AbstractFactory {
    public SpeciesFactory getSpeciesFactory(String type){
        if("Mammal".equals(type)){
            return new MammalFactory();
        }
        else
            return new ReptileFactory();
    }
}
