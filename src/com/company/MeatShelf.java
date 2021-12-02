package com.company;

public class MeatShelf {
    String[] meats;
    String[] fowl;

    public MeatShelf() {

    }

    public MeatShelf(String[] meats,
                     String[] fowl) {
        this.meats = meats;
        this.fowl = fowl;
    }

    public void setMeats(String[] meats) {
        this.meats = meats;
    }

    public String[] getMeats() {
        return meats;
    }

    public void setFowl(String[] fowl) {
        this.fowl = fowl;
    }

    public String[] getFowl() {
        return fowl;
    }

    @Override
    public String toString() {
        String message = "\n" + meats[0] + ", also " + fowl[0];
        return message;
    }
}
