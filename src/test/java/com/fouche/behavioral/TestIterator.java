/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.behavioral;

import com.fouche.tp3sdprinciples.behavioral.iterator.Item;
import com.fouche.tp3sdprinciples.behavioral.iterator.Menu;
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
public class TestIterator {
    
    public TestIterator() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void hello() {
         Item i = new Item("cheese snackwhich", 12.59f);
         Item i1 = new Item("chicken snackwhich", 18.59f);
         Item i2 = new Item("steak snackwhich", 24.59f);
         
         Menu menu = new Menu();
         menu.addItem(i);
         menu.addItem(i1);
         menu.addItem(i2);
         
         Assert.assertNotNull(menu);
         
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
