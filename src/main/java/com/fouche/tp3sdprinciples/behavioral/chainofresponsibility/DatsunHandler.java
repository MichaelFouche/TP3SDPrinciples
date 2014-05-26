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
public class DatsunHandler extends CarHandler{

    @Override
    public void handleRequest(CarEnum request) {
       if(request == CarEnum.DATSUN)
            System.out.println("DatsunHandler handles " + request);
        else System.out.println("DatsunHnadler does not handle this " + request);
        if(successor != null){
            successor.handleRequest(request);
            
        }
    }
    
}
