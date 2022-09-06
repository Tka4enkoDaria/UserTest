package org.example;

import org.testng.annotations.Test;

public class Product {
    private String productName;
    private int productPrice;
    private int productCount;

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
        if (productPrice < 0) {
            System.out.println("Price is negative");
        }
    }

    @Test
    public boolean productAvailable() {
        if (productCount <= 0) {
            System.out.println("Products is null");
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
