package ca.concordia.coen352.model;

public record Inventory(

        int itemId,
        String productName,
        String category,
        double price,
        int quantity

) {}