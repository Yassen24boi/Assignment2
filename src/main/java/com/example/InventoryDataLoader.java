package ca.concordia.coen352.data;

import java.util.ArrayList;

import ca.concordia.coen352.model.Inventory;

public class InventoryDataLoader {

    public static ArrayList<Inventory> createSampleData() {

        ArrayList<Inventory> data =
                new ArrayList<>();

        data.add(new Inventory(
                101,
                "Mouse",
                "Electronics",
                25.99,
                50));

        // add remaining records

        return data;
    }


}