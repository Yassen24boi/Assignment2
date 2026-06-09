package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class InventoryIndex
        implements InventoryIndexADT {

    private ArrayList<Inventory>
            inventoryTable; //this can be modified by your dictionary or other type of data structure

    private TreeMap<String,Integer>
            productNameIndex;

    private TreeMap<Double,List<Integer>>
            priceIndex;

    private TreeMap<String,List<Integer>>
            categoryIndex;

    private TreeMap<Integer,List<Integer>>
            quantityIndex;

    public InventoryIndex(
            ArrayList<Inventory> inventoryTable) {
                this.inventoryTable = inventoryTable;

                productNameIndex = new TreeMap<>();
                priceIndex = new TreeMap<>();
                categoryIndex = new TreeMap<>();
                quantityIndex = new TreeMap<>();
            }

    @Override
    public void buildIndexes() {

        buildPriceIndex();
        buildProductNameIndex();
        buildCategoryIndex();
        buildQuantityIndex();
    }
    
    //given buildPriceIndex fucntion we used this to implemnent the other build index functions, you can use the same logic to implement the find and print functions
    public void buildPriceIndex() {

        priceIndex.clear(); 

        for (int position = 0;
             position < inventoryTable.size();
             position++) {

            Inventory item =
                    inventoryTable.get(position);

            double price =
                    item.price();

            /*
             * If this price has never appeared,
             * create an empty list first.
             */
            if (!priceIndex.containsKey(price)) {

                priceIndex.put(
                        price,
                        new ArrayList<>());
            }

            /*
             * Store the record position.
             */
            priceIndex.get(price)
                      .add(position);
        }
    }

    public void buildProductNameIndex() { // for the product name index we can use a simple tree map since the product name is unique and we can store the position of the record in the inventory table as the value of the index
        productNameIndex.clear(); // clear the index before building it

    for (int position = 0; position < inventoryTable.size();position++) {      // iterate through the inventory table

        Inventory item = inventoryTable.get(position);                          // get the inventory item at the current position

        String productName = item.productName();                        // extract the product name from the inventory item

        productNameIndex.put( productName,position);                   // add the product name and its position to the index

    }
    }

    public void buildCategoryIndex() {  // we can use the same logic as the price index but instead of using the price as the key we will use the category and since there can be multiple records with the same category we will store a list of positions for each category
        categoryIndex.clear();

        for (int position = 0;position < inventoryTable.size();position++) { // iterate through the inventory table

            Inventory item = inventoryTable.get(position); // get the inventory item at the current position

            String category =  item.category(); // extract the category from the inventory item

            /*
             * If this category has never appeared,
             * create an empty list first.
             */
            if (!categoryIndex.containsKey(category)) {

                categoryIndex.put(
                        category,
                        new ArrayList<>());
            }

            /*
             * Store the record position.
             */
            categoryIndex.get(category)
                      .add(position);
        }
   
    
        
    }

    //since its an integer the array method we used in price index works fine
    public void buildQuantityIndex() {

        quantityIndex.clear();

        for (int position = 0;
             position < inventoryTable.size();
             position++) {

            Inventory item =
                    inventoryTable.get(position);

            int quantity =
                    item.quantity();

            /*
             * If this quantity has never appeared,
             * create an empty list first.
             */
            if (!quantityIndex.containsKey(quantity)) {

                quantityIndex.put(
                        quantity,
                        new ArrayList<>());
            }

            /*
             * Store the record position.
             */
            quantityIndex.get(quantity)
                      .add(position);
        }
    }

    
    
    

    @Override
    public Inventory findByProductName(
            String productName) {
    	
    	// STUDENT IMPLEMENTATION
        return null;
    }

    @Override
    public List<Inventory> findByPrice(
            double price) {
    	
    	// STUDENT IMPLEMENTATION
        return null;
    }

    @Override
    public List<Inventory> findByCategory(
            String category) {
    	
    	// STUDENT IMPLEMENTATION

        return null;
    }

    @Override
    public List<Inventory> findByQuantity(
            int quantity) {
    	// STUDENT IMPLEMENTATION

        return null;
    }

    
    /**
     * Print all records sorted by price as an example
     */
    @Override
    public void printInventorySortedByPrice() {

        for (Double price :
                priceIndex.keySet()) {

            System.out.println(
                    "\nPrice = " + price);

            List<Integer> positions =
                    priceIndex.get(price);

            for (Integer pos :
                    positions) {

                System.out.println(
                        inventoryTable.get(pos));
            }
        }
    }
    
    

    @Override
    public void printInventorySortedByName() {
    	// STUDENT IMPLEMENTATION

    }

    @Override
    public void printInventorySortedByCategory() {
    	// STUDENT IMPLEMENTATION

    }

    @Override
    public void printInventorySortedByQuantity() {
    	// STUDENT IMPLEMENTATION

    }
}