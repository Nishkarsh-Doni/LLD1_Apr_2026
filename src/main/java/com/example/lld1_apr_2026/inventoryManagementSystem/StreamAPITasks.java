package com.example.lld1_apr_2026.inventoryManagementSystem;

import com.example.lld1_apr_2026.inventoryManagementSystem.models.Book;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Clothing;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Electronics;
import com.example.lld1_apr_2026.inventoryManagementSystem.models.Item;

import java.util.ArrayList;
import java.util.List;

public class StreamAPITasks {
    public static void main(String[] args) {
        List<Item> itemsList1 = new ArrayList<>();
        itemsList1.add(new Electronics("E1", "Laptop", 75000.0, 10, 24));
        itemsList1.add(new Electronics("E2", "Mobile Phone", 25000.0, 0, 12));
        itemsList1.add(new Book("B1", "Clean Code", 599.0, 15, "Robert Martin"));
        itemsList1.add(new Book("B2", "Effective Java", 499.0, 0, "Joshua Bloch"));
        itemsList1.add(new Clothing("C1", "T-Shirt", 999.0, 50, "L"));
        itemsList1.add(new Clothing("C2", "Jeans", 2499.0, 20, "M"));
        itemsList1.add(new Electronics("E3", "Earphones", 1999.0, 30, 6));

        /*
        Task 1: Stream Basics and Map Transformation
        1a. Print all item IDs in the inventory using map()
         */

        itemsList1
                .stream()                               // Stream<Item>
                .map(item -> item.getId())              // Stream<String>
                .forEach(id -> System.out.println(id)); // printing from the stream of ids


        /*
        1b. Create a list of item names in lowercase and print it
         */

        List<String> ans = itemsList1.stream()
                .map(item -> item.getName().toLowerCase())
                .toList();
        System.out.println(ans);

        /*
        1c. Generate a list of the lengths of item names
         */
        List<Integer> ans1 = itemsList1.stream()
                .map(item -> item.getName().length())
                .toList();

        System.out.println(ans1);

        /*
        Task 2: Filtering and Matching
        2a. Find all items priced above ₹1000 and print their names
         */

        itemsList1
                .stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(item -> System.out.println(item.getName()));

        /*
        2b. Check if any item has a quantity of 0 using anyMatch
         */
        boolean isItemOutOfStock = itemsList1
                .stream()
                .anyMatch(item -> item.getQuantity() == 0);

        System.out.println(isItemOutOfStock);

        /*
        2c. Verify that all items have a price greater than 0 using allMatch
         */
        boolean allItemHasAPriceToPay = itemsList1
                .stream()
                .allMatch(item -> item.getPrice() > 0); // true

    }
}
