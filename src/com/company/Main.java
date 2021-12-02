package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] meatOnly = {"Roast beef semis product", "Horse meat", "Camel"};
        String[] fowlOnly = {"Turkey", "Wild duck", "Ostrich"};
        MeatShelf meatShelf = new MeatShelf(meatOnly, fowlOnly);

        String[] liquidsForFreezer = new String[]{"Water", "Jam", "Russian Plasma Drink", "Lemonade"};
        System.out.println("You can choose any drink using according number of a drink: \n" + "1 " + liquidsForFreezer[0] + ". 2 " + liquidsForFreezer[1] + ". 3 " + liquidsForFreezer[2] + ". 4 " + liquidsForFreezer[3]);
        Scanner scanner = new Scanner(System.in);
        IceTray iceTray = new IceTray(liquidsForFreezer, 5);
        iceTray.setDrink(scanner.nextInt());


        String[] productsForFreezer = new String[]{"Beef", "Chicken", "Duck"};
        Freezer freezer = new Freezer(productsForFreezer, iceTray, meatShelf);

        int[] eggs = {5, 3};
        EggTray eggTray = new EggTray(eggs);

        String[] medicines = {"Carvalol", "Ibufen"};
        BottomDoorShelf bottomDoorShelf = new BottomDoorShelf(medicines);

        String[] seasoning = {"Seasoning for Plov", "Seasoning for Shish-Kebab"};
        TopDoorShelf topDoorShelf = new TopDoorShelf(eggTray, seasoning);

        FridgeDoor fridgeDoor = new FridgeDoor(eggTray, bottomDoorShelf, topDoorShelf);


        SecondLevelShelf secondLevelShelf = new SecondLevelShelf(productsForFreezer);
        double[] quantityOfVeggiesForBottomShelf = {5, 7, 2, 1};
        String[] vegetables = {"carrots", " onions", "corn", "beans"};
        String[] vegetablesPlusQuantity = new String[4];
        for (int i = 0; i < vegetables.length; i++) {
            vegetablesPlusQuantity[i] = vegetables[i] + " "
                    + quantityOfVeggiesForBottomShelf[i] + " kg";
        }


        BottomShelf bottomShelf = new BottomShelf(vegetables, quantityOfVeggiesForBottomShelf, vegetablesPlusQuantity);

        FridgeMainSection fridgeMainSection = new FridgeMainSection(fridgeDoor, bottomShelf, secondLevelShelf);
        Fridge fridge = new Fridge(freezer, fridgeDoor, fridgeMainSection);

        System.out.println(fridge);

    }
}
