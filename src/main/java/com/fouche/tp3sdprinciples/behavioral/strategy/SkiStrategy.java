/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.strategy;

/**
 *
 * @author foosh
 */
public class SkiStrategy implements Strategy{

    @Override
    public boolean checkTempreature(int tempreatureInF) {
       if(tempreatureInF <= 32){return true;}
       else return false;
    }
    
}
