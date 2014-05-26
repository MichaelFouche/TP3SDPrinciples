/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.state;

/**
 *
 * @author foosh
 */
public class SadState implements EmotionalState{

    @Override
    public String sayHello() {
       return "Bye, sniff, sniff";
    }

    @Override
    public String sayGoodbye() {
       return "Hello, sniff, sniff";
    }
    
}
