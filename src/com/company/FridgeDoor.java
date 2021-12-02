package com.company;

public class FridgeDoor {
    EggTray eggTray;
    BottomDoorShelf bottomDoorShelf;
    TopDoorShelf topDoorShelf;

    public FridgeDoor() {

    }

    public FridgeDoor(EggTray eggTray, BottomDoorShelf bottomDoorShelf, TopDoorShelf topDoorShelf) {
        this.bottomDoorShelf = bottomDoorShelf;
        this.eggTray = eggTray;
        this.topDoorShelf = topDoorShelf;
    }

    public void setEggTray(EggTray eggTray) {
        this.eggTray = eggTray;
    }

    public EggTray getEggTray() {
        return eggTray;
    }

    public void setButtomDoorShelf(BottomDoorShelf bottomDoorShelf) {
        this.bottomDoorShelf = bottomDoorShelf;
    }

    public BottomDoorShelf getButtomDoorShelf() {
        return bottomDoorShelf;
    }

    public void setTopDoorShelf(TopDoorShelf topDoorShelf) {
        this.topDoorShelf = topDoorShelf;
    }

    public TopDoorShelf getTopDoorShelf() {
        return topDoorShelf;
    }

    @Override
    public String toString() {
        String message = "\n" + bottomDoorShelf + topDoorShelf + " on the fridge door.";
        return message;
    }
}

