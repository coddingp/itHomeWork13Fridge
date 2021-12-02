package com.company;

import java.util.Arrays;

public class SecondLevelShelf {
    String[] products;

    public SecondLevelShelf(String[] products){
        this.products=products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "\nThere is " +
                Arrays.toString(products) +" on the Second Level Shelf.";
    }
}
