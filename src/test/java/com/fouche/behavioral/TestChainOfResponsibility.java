/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.behavioral;

import com.fouche.tp3sdprinciples.behavioral.chainofresponsibility.CarEnum;
import com.fouche.tp3sdprinciples.behavioral.chainofresponsibility.CarHandler;
import com.fouche.tp3sdprinciples.behavioral.chainofresponsibility.DatsunHandler;
import com.fouche.tp3sdprinciples.behavioral.chainofresponsibility.ToyotaHandler;
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
public class TestChainOfResponsibility {
    
    public TestChainOfResponsibility() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    public static CarHandler setUpChain(){
     CarHandler toyotaHandler = new ToyotaHandler();
     CarHandler datsunHandler = new DatsunHandler();
     toyotaHandler.setSuccessor(datsunHandler);
     return toyotaHandler;
    }
    
     @Test
     public void hello() {
         CarHandler chain = setUpChain();
         chain.handleRequest(CarEnum.TOYOTA);
         Assert.assertNotNull(chain);
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
