package com.example;

import java.util.ArrayList;

public class InventoryApplication {
          public static void main(String[] args) {

        ArrayList<Inventory> inventory =
                InventoryDataLoader.createSampleData();

        InventoryIndex index =
                new InventoryIndex(inventory);

        index.buildIndexes();

        index.printInventorySortedByPrice();
    }
}