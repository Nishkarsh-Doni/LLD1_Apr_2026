package com.example.lld1_apr_2026.inventoryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order implements Comparable<Order>{

    String orderId;
    boolean isExpress;

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress && !o.isExpress) return -1;
        else if(!this.isExpress && o.isExpress) return 1;
        return this.orderId.compareTo(o.orderId);
    }
    @Override
    public String toString() {
        return orderId;
    }
}

class OrderProcessor {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("#R003", false));
        orders.add(new Order("#X001", true));
        orders.add(new Order("#R001", false));
        orders.add(new Order("#X002", true));
        orders.add(new Order("#R002", false));

        Collections.sort(orders);
        System.out.println(orders);
    }
}
