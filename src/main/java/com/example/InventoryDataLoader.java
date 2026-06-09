package com.example;

import java.util.ArrayList;

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

        data.add(new Inventory(
                102,
                "Keyboard",
                "Electronics",
                45.99,
                30));   
        
        data.add(new Inventory(
                103,
                "Monitor",
                "Electronics",
                199.99,
                20));

        data.add(new Inventory(
                104,
                "Chair",
                "Furniture",
                89.99,
                15));

        data.add(new Inventory(
            104,
            "Desk",
            "Furniture",
            300.00,
            5));

        

        data.add(new Inventory(
            104,
             "Lamp",
              "Office",
              49.99,
              10));

        data.add(new Inventory(
            105,
            "Controller",
            "Gaming",
            49.99,
            10));
            
        return data;
    }


}