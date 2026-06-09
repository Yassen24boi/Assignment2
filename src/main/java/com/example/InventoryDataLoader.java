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
                20));   
        
        data.add(new Inventory(
                103,
                "Chair",
                "Furniture",
                129.99,
                10));

        data.add(new Inventory(
                104,
                "Desk",
                "Furniture",
                299.99,
                5));

        data.add(new Inventory(
            105,
             "Monitor",
              "Electronics",
              199.99,
              15));

        data.add(new Inventory(
            106,
            "Printer",
            "Electronics",
            25.99,
            30));

        data.add(new Inventory(
            107,
            "Bookshelf",
            "Furniture",
            129.99,
            8));

        data.add(new Inventory(
            108,
            "Lamp",
            "Furniture",
            49.99,
            25));  

        data.add(new Inventory(
            109,
            "Scanner",
            "Electronics",
            49.99,
            40));
        
        data.add(new Inventory(
            110,
            "Router",
            "Electronics",
            25.99,
            12));

        data.add(new Inventory(
            111,
            "Webcam",
            "Electronics",
            199.99,
            15));
        
        data.add(new Inventory(
            112,
            "Sofa",
            "Furniture",
            299.99,
            5));

        data.add(new Inventory(
            113,
            "Table",
            "Furniture",
            129.99,
            20));

        data.add(new Inventory(
            114,
            "Microphone",
            "Electronics",
            49.99,
            50));

        data.add(new Inventory(
            115,
            "Speaker",
            "Electronics",
            199.99,
            10));   
        
        data.add(new Inventory(
            116,
            "Cabinet",
            "Furniture",
            299.99,
            7));
            
        data.add(new Inventory(
            117,
            "Projector",
            "Electronics",
            49.99,
            25));
        
        data.add(new Inventory(
            118,
            "Headset",
            "Electronics",
            25.99,
            50));
        
        data.add(new Inventory(
            119,
            "DockingStation",
            "Electronics",
            199.99,
            15));

        data.add(new Inventory(
            120,
            "Whiteboard",
            "Furniture",
            129.99,
            10));

        return data;
    }


}