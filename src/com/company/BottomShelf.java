package com.company;

import java.util.Arrays;

public class BottomShelf {
    String[] veggies;
    double[] quantity;
    String[] veggiesPlusQuantity;

    public BottomShelf(){

    }
    public BottomShelf(String[] veggies, double[] quantity,String[] veggiesPlusQuantity){
        this.veggies=veggies;
        this.quantity = quantity;
        this.veggiesPlusQuantity= veggiesPlusQuantity;
    }

    public void setVeggies(String[] veggies) {
        this.veggies = veggies;
    }

    public String[] getVeggies() {
        return veggies;
    }

    public void setQuantity(double[] quantity) {
        this.quantity = quantity;
    }

    public double[] getQuantity() {
        return quantity;
    }

    public void setVeggiesPlusQuantity(String[] veggiesPlusQuantity) {
        this.veggiesPlusQuantity = veggiesPlusQuantity;
    }

    public String[] getVeggiesPlusQuantity() {
        return veggiesPlusQuantity;
    }

    @Override
    public String toString() {
        return "\nBottom Shelf contains " +
                Arrays.toString(veggiesPlusQuantity);
    }
}
