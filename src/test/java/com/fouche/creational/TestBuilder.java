/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.creational;

import com.fouche.tp3sdprinciples.creational.builder.ItalianMealBuilder;
import com.fouche.tp3sdprinciples.creational.builder.Meal;
import com.fouche.tp3sdprinciples.creational.builder.MealBuilder;
import com.fouche.tp3sdprinciples.creational.builder.MealDirector;
import org.junit.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author foosh
 */
public class TestBuilder {
    
    public TestBuilder() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

      @Test
     public void RunItalianBuilder(){
        MealBuilder mealBuild = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuild);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        Assert.assertEquals("Pizza", meal.getFood());
     }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
