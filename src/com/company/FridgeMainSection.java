package com.company;

public class FridgeMainSection {
FridgeDoor fridgeDoor;
BottomShelf bottomShelf;
SecondLevelShelf secondLevelShelf;

public FridgeMainSection(FridgeDoor fridgeDoor, BottomShelf bottomShelf,
                         SecondLevelShelf secondLevelShelf){
    this.fridgeDoor = fridgeDoor;
    this.bottomShelf=bottomShelf;
    this.secondLevelShelf=secondLevelShelf;
}

    public void setFridgeDoor(FridgeDoor fridgeDoor) {
        this.fridgeDoor = fridgeDoor;
    }

    public FridgeDoor getFridgeDoor() {
        return fridgeDoor;
    }

    public void setBottomShelf(BottomShelf bottomShelf) {
        this.bottomShelf = bottomShelf;
    }

    public BottomShelf getBottomShelf() {
        return bottomShelf;
    }

    public void setSecondLevelShelf(SecondLevelShelf secondLevelShelf) {
        this.secondLevelShelf = secondLevelShelf;
    }

    public SecondLevelShelf getSecondLevelShelf() {
        return secondLevelShelf;
    }

    @Override
    public String toString() {
        return "Fridge Main Section includes " +
                "" + fridgeDoor +
                "" + bottomShelf +
                "" + secondLevelShelf;
    }
}
