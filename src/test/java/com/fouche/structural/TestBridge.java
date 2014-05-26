/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.structural;

import com.fouche.tp3sdprinciples.structural.bridge.BigBus;
import com.fouche.tp3sdprinciples.structural.bridge.BigEngine;
import com.fouche.tp3sdprinciples.structural.bridge.SmallCar;
import com.fouche.tp3sdprinciples.structural.bridge.SmallEngine;
import com.fouche.tp3sdprinciples.structural.bridge.Vehicle;
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
public class TestBridge {
    
    public TestBridge() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void runBus() {
         
         Vehicle vehicle = new BigBus(new SmallEngine());
         vehicle.drive();
         Assert.assertEquals(vehicle.getSpeed(), "slow");
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
         Assert.assertEquals(vehicle.getSpeed(), "slow");
         System.out.println("---------------------------------------------------");
         
     }
     
     @Test
     public void runCar() {
         
         Vehicle vehicle = new SmallCar(new SmallEngine());
         vehicle.drive();
         Assert.assertEquals(vehicle.getSpeed(), "average");
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
         Assert.assertEquals(vehicle.getSpeed(), "fast");
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
