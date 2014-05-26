/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.creational.prototype;

/**
 *
 * @author foosh
 */
public class Person implements Prototype{
    String name;
    
    public Person (String name){
        this.name=name;
    }
    @Override
    public Prototype doClone(){
        return new Person(name);
    }
    @Override
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return "This person is named "+ name;
    }
}
