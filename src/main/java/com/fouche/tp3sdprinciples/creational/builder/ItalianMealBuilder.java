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
public class ItalianMealBuilder  implements MealBuilder {
    private Meal meal;
    
    public ItalianMealBuilder(){
        meal=new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("wine");
    }

    @Override
    public void buildFood() {
      meal.setFood("Pizza");  
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
    
    
}