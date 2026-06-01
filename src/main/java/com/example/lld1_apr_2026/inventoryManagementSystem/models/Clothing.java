package com.example.lld1_apr_2026.inventoryManagementSystem.models;

public class Clothing extends Item {
    private String size;

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getName() + " [Size: " + size + "] (₹" + getPrice() + ", qty: " + getQuantity() + ")";
    }


}
