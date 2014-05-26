/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.behavioral;

import com.fouche.tp3sdprinciples.behavioral.observer.WeatherCustomer1;
import com.fouche.tp3sdprinciples.behavioral.observer.WeatherCustomer2;
import com.fouche.tp3sdprinciples.behavioral.observer.WeatherStation;
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
public class TestObserver {
    
    public TestObserver() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void hello() {
         WeatherStation ws = new WeatherStation(65);
         WeatherCustomer1 w1 = new WeatherCustomer1();
         WeatherCustomer2 w2 = new WeatherCustomer2();
         ws.addObserver(w1);
         ws.addObserver(w2);
         ws.setTempreature(64);
         Assert.assertEquals(ws.getTempreature(), 64);
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
