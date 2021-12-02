package com.company;

public class BottomDoorShelf {
    String[] medicine;

    public BottomDoorShelf(String[] medicine) {
        this.medicine = medicine;
    }

    public void setMedicine(String[] medicine) {
        this.medicine = medicine;
    }

    public String[] getMedicine() {
        return medicine;
    }

    @Override
    public String toString() {
        String message = "\nThere is " + medicine[0] + " on the bottom shelf of the fridge door.";
        return message;
    }
}
