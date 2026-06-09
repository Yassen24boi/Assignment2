package ca.concordia.coen352.app;

import java.util.ArrayList;

import ca.concordia.coen352.data.InventoryDataLoader;
import ca.concordia.coen352.impl.InventoryIndex;
import ca.concordia.coen352.model.Inventory;

public class InventoryApplication {

    public static void main(
            String[] args) {

        ArrayList<Inventory> inventory =
                InventoryDataLoader
                        .createSampleData();

        InventoryIndex index =
                new InventoryIndex(
                        inventory);

        index.buildIndexes();

        index.printInventorySortedByPrice();
    }
}