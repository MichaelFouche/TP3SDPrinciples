/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.interpretor;

/**
 *
 * @author foosh
 */
public class OrExpression implements Expression{
    private Expression expr;
    private Expression expr1;

    public OrExpression(Expression e1, Expression e2) {
        expr = e1;
        expr1 = e2;
    }
    
    @Override
    public boolean interpreter(String context) {
        return expr.interpreter(context) || expr1.interpreter(context);
    }
    
}
