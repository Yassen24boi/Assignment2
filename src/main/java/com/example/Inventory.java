package com.example;

public record Inventory(

        int itemId,
        String productName,
        String category,
        double price,
        int quantity
) {}