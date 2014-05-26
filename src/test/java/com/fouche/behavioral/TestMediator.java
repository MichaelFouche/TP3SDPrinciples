/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.behavioral;

import com.fouche.tp3sdprinciples.behavioral.mediator.AmericanSeller;
import com.fouche.tp3sdprinciples.behavioral.mediator.Buyer;
import com.fouche.tp3sdprinciples.behavioral.mediator.DollarConverter;
import com.fouche.tp3sdprinciples.behavioral.mediator.FrenchBuyer;
import com.fouche.tp3sdprinciples.behavioral.mediator.Mediator;
import com.fouche.tp3sdprinciples.behavioral.mediator.SwedishBuyer;
import junit.framework.Assert;
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
public class TestMediator {
    
    public TestMediator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void hello() {
         Mediator m = new Mediator();
         Buyer swed = new SwedishBuyer(m);
         float sellingPriceInDollars = 10.0f;
         AmericanSeller a = new AmericanSeller(m, sellingPriceInDollars);
         DollarConverter dc = new DollarConverter(m);
         
         float swedishBidKronor = 55.0f;
         while(!swed.attemptToPurchase(swedishBidKronor)){
             swedishBidKronor+=15.0f;
         }
         
         org.testng.Assert.assertNotNull(m);
         org.testng.Assert.assertNotNull(swed);
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
