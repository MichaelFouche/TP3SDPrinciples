/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fouche.behavioral;

import com.fouche.tp3sdprinciples.behavioral.visitor.NumberElement;
import com.fouche.tp3sdprinciples.behavioral.visitor.NumberVisitor;
import com.fouche.tp3sdprinciples.behavioral.visitor.SumVisitor;
import com.fouche.tp3sdprinciples.behavioral.visitor.ThreeElement;
import com.fouche.tp3sdprinciples.behavioral.visitor.TwoElement;
import java.util.ArrayList;
import java.util.List;
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
public class TestVisitor {
    
    public TestVisitor() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
     public void hello() {
         TwoElement two1 = new TwoElement(3,9);
         ThreeElement three1 = new ThreeElement(3,6,9);
         List<NumberElement> numberElements = new ArrayList<>();
         NumberVisitor sumVisitor = new SumVisitor();
         numberElements.add(two1);
         numberElements.add(three1);
         sumVisitor.visit(numberElements);
         
         Assert.assertNotNull(numberElements);
         
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
