package com.company;

public class EggTray {
    int[] eggs;

    public EggTray() {

    }

    public EggTray(int[] eggs) {
        this.eggs = eggs;
    }

    public void setEggs(int[] eggs) {
        this.eggs = eggs;
    }

    public int[] getEggs() {
        return eggs;
    }

    @Override
    public String toString() {
        String message = "" + eggs[0];
        return message;
    }
}
