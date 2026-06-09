package ca.concordia.coen352.adt;

import java.util.List;

import ca.concordia.coen352.model.Inventory;

public interface InventoryIndexADT {

    void buildIndexes();

    Inventory findByProductName(String productName);

    List<Inventory> findByPrice(double price);

    List<Inventory> findByCategory(String category);

    List<Inventory> findByQuantity(int quantity);

    void printInventorySortedByPrice();

    void printInventorySortedByName();

    void printInventorySortedByCategory();

    void printInventorySortedByQuantity();
}