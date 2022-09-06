package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Hello world!
 *
 */
@Test
public class ProductTest {
    public void testNotNull(){
    Product pr = new Product();
        assertNotNull("Verify that pr is NOT null", pr);
    }
    public void testSetProductPrice(){
        int a=-5;
        Product pr1 = new Product();
        pr1.setProductPrice(-5);
    }





}
