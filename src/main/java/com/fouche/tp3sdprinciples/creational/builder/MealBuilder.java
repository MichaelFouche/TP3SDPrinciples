/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.tp3sdprinciples.creational.builder;

/**
 *
 * @author foosh
 */
public interface MealBuilder {
    public void buildDrink();
    public void buildFood();
    public Meal getMeal();
}
