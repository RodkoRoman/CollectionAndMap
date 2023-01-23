package org.rodko;

public class Main {
    public static void main(String[] args) {

        BoxList boxList = new BoxList();
        boxList.printListsInformation();

        ProductMap productMap = new ProductMap();
        productMap.printAllMethods();

        PetMap petMap = new PetMap();
        petMap.printPetName();


    }
}