/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.mediator;

/**
 *
 * @author foosh
 */
public class Buyer {
    Mediator mediator;
    String unitOfcurrency;
    
    public Buyer(Mediator mediator, String unitOfCurrency){
        this.mediator = mediator;
        this.unitOfcurrency = unitOfCurrency;
    }
    
    public boolean attemptToPurchase(float bid){
        System.out.println("Buyer attempted a bid of " + bid + " " + unitOfcurrency);
        return mediator.placeBid(bid, unitOfcurrency);
    }
}
