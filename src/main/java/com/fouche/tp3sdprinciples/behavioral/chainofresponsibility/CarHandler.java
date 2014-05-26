/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.chainofresponsibility;

/**
 *
 * @author foosh
 */
public abstract class CarHandler {
    CarHandler successor;
    
    public void setSuccessor(CarHandler successor){
        this.successor = successor;
    }
    
    public abstract void handleRequest(CarEnum request);
}
