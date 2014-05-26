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
public class AndExpression implements Expression{
    private Expression expr;
    private Expression expr1;

    public AndExpression(Expression expr, Expression expr1) {
        this.expr = expr;
        this.expr1 = expr1;
    }
    
    
    @Override
    public boolean interpreter(String context) {
        return expr.interpreter(context) && expr1.interpreter(context);
    }
}
