package com.company;

public class Freezer {
    String[] products;
    IceTray iceTray;
    MeatShelf meatshelf;

    public Freezer(String[] products, IceTray iceTray, MeatShelf meatshelf) {
        this.products = products;
        this.iceTray = iceTray;
        this.meatshelf = meatshelf;
    }

    public Freezer() {
    }

    public void setMeatShelf(MeatShelf meatshelf) {
        this.meatshelf = meatshelf;
    }

    public MeatShelf getMeatShelf() {
        return meatshelf;
    }

    public void setIceTray(IceTray iceTray) {
        this.iceTray = iceTray;
    }

    public IceTray getIceTray() {
        return iceTray;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String[] getProducts() {
        return this.products;
    }

    @Override
    public String toString() {
        return "\nThere is " + this.products[0] + " and " + iceTray + " and " + meatshelf + " in the freezer.";
    }


}
