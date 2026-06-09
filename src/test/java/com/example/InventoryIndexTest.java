package com.example;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class InventoryIndexTest {

    @Test
    public void testFindByProductName() {

        ArrayList<Inventory> inventory =  InventoryDataLoader.createSampleData(); // load sample data
        InventoryIndex index = new InventoryIndex(inventory); // create index
        index.buildIndexes(); // build indexes

        Inventory result = index.findByProductName("Mouse"); // search for product by name

        assertNotNull(result); // verify result is not null
        assertEquals("Mouse", result.productName()); // verify product name
        assertEquals("Electronics", result.category()); // verify category
        assertEquals(25.99, result.price()); // verify price
        assertEquals(50, result.quantity()); // verify quantity
    }

    @Test
    public void testFindByPrice() {
        ArrayList<Inventory> inventory =  InventoryDataLoader.createSampleData(); // load sample data
        InventoryIndex index = new InventoryIndex(inventory); // create index
        index.buildIndexes(); // build indexes

        List<Inventory> results = index.findByPrice(25.99); // search for products by price

        assertNotNull(results); // verify results is not null
        assertEquals(4, results.size()); // verify number of results
    
    }

    @Test
    public void testFindByCategory() {

        ArrayList<Inventory> inventory =  InventoryDataLoader.createSampleData(); // load sample data
        InventoryIndex index = new InventoryIndex(inventory); // create index
        index.buildIndexes(); // build indexes

        List<Inventory> results = index.findByCategory("Furniture"); // search for products by category

        assertNotNull(results); // verify results is not null
        assertEquals(8, results.size()); // verify number of results
    }

    @Test
    public void testFindByQuantity() {
        ArrayList<Inventory> inventory =  InventoryDataLoader.createSampleData(); // load sample data
        InventoryIndex index = new InventoryIndex(inventory); // create index
        index.buildIndexes(); // build indexes

        List<Inventory> results = index.findByQuantity(10); // search for products by quantity
        
        assertNotNull(results); // verify results is not null
        assertEquals(3, results.size()); // verify number of results

    }
}