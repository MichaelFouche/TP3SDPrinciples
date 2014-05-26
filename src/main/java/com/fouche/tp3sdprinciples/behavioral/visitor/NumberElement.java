/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.behavioral.visitor;

/**
 *
 * @author foosh
 */
public interface NumberElement {
    public void accept(NumberVisitor visitor);
}
