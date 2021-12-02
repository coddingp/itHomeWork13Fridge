package com.company;

public class IceTray {
    String[] kindOfLiquid;
    int quantity;
    int drink;


    public IceTray(String[] kindOfLiquid, int quantity) {
        this.kindOfLiquid = kindOfLiquid;
        this.quantity = quantity;
    }

    public IceTray() {
    }

    public void setKindOfLiquid(String[] kindOfLiquid) {
        this.kindOfLiquid = kindOfLiquid;
    }

    public String getKindOfLiquid() {
        return kindOfLiquid[0];
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDrink(int drink) {
        this.drink = drink;
    }

    public int getDrink() {
        return drink;
    }

    public String icaTrayForSout() {
        return quantity + " ice cubes with" + " " + kindOfLiquid[2];//+ " " + kindOfLiquid[1] + " " + kindOfLiquid[2] + " " + kindOfLiquid[3]
    }

    public String[] iceTrayArray() {
        return new String[]{String.valueOf(quantity), " ice cubes with", kindOfLiquid[1]};

    }

    @Override
    public String toString() {
        String message = quantity + " ice cubes with " + kindOfLiquid[drink - 1];
        return message;
    }
}
