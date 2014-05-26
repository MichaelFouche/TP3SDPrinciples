/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.structural;

import com.fouche.tp3sdprinciples.structural.decorator.Animal;
import com.fouche.tp3sdprinciples.structural.decorator.GrowlDecorator;
import com.fouche.tp3sdprinciples.structural.decorator.LegDecorator;
import com.fouche.tp3sdprinciples.structural.decorator.LivingAnimal;
import com.fouche.tp3sdprinciples.structural.decorator.WingDecorator;
import org.testng.Assert;
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
public class TestDecorator {
    
    public TestDecorator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void RunDecorator() {
         Animal animal = new LivingAnimal();
         animal.describe();
         Assert.assertEquals(animal.describe(), "animal");
         
         animal = new LegDecorator(animal);
         animal.describe();
         Assert.assertEquals(animal.describe(), "dancing");
         
         animal = new WingDecorator(animal);
         animal.describe();
         Assert.assertEquals(animal.describe(), "flying");
         animal = new GrowlDecorator(animal);
         animal = new GrowlDecorator(animal);
         Assert.assertEquals(animal.describe(), "grr");
         animal.describe();
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
