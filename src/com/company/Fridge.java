package com.company;

public class Fridge {
    Freezer freezer;
    FridgeDoor fridgeDoor;
    FridgeMainSection fridgeMainSection;

    public Fridge() {

    }

    public Fridge(Freezer freezer, FridgeDoor fridgeDoor,
                  FridgeMainSection fridgeMainSection) {
        this.freezer = freezer;
        this.fridgeDoor = fridgeDoor;
        this.fridgeMainSection = fridgeMainSection;
    }

    public void setFridgeMainSection(FridgeMainSection fridgeMainSection) {
        this.fridgeMainSection = fridgeMainSection;
    }

    public FridgeMainSection getFridgeMainSection() {
        return fridgeMainSection;
    }

    public void setFredgeDoor(FridgeDoor fridgeDoor) {
        this.fridgeDoor = fridgeDoor;
    }

    public FridgeDoor getFredgeDoor() {
        return fridgeDoor;
    }

    public void setFreezer(Freezer freezer) {
        this.freezer = freezer;
    }

    public Freezer getFreezer() {
        return freezer;
    }

    @Override
    public String toString() {
        String message = "" + this.fridgeMainSection + this.freezer;
        return message;
    }


}
