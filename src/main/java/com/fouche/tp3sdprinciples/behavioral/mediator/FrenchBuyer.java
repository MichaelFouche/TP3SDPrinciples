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
public class FrenchBuyer extends Buyer{
    public FrenchBuyer(Mediator mediator){
        super(mediator, "euro");
        this.mediator.regFrenchBuyer(this);
    }
}
