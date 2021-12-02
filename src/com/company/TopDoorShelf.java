package com.company;

public class TopDoorShelf {
    EggTray eggTray;
    String[] seasoning;

    public TopDoorShelf() {

    }

    public TopDoorShelf(EggTray eggTray,
                        String[] seasoning) {
        this.eggTray = eggTray = eggTray;
        this.seasoning = seasoning;
    }

    public void setEggTray(EggTray eggTray) {
        this.eggTray = eggTray;
    }

    public EggTray getEggTray() {
        return eggTray;
    }

    public void setSeasoning(String[] seasoning) {
        this.seasoning = seasoning;
    }

    public String[] getSeasoning() {
        return seasoning;
    }

    @Override
    public String toString() {
        String message = "\nThere is " + eggTray + " eggs in an eggTray" + " and " + seasoning[0] + " on the top door shelf";
        return message;
    }
}
