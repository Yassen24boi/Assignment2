package ca.concordia.coen352.impl;

import java.util.*;

import ca.concordia.coen352.adt.InventoryIndexADT;
import ca.concordia.coen352.model.Inventory;

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
    	//this can be modified by your dictionary or other type of data structure
        this.inventoryTable =
                inventoryTable;
    }

    @Override
    public void buildIndexes() {

        // STUDENT IMPLEMENTATION

    }
    
    /**
     * Builds the Price Index as an illustrating example; 
     */
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