package com.example.lld1_apr_2026.inventoryManagementSystem;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewed {

    private final int max_size;
    private final LinkedList<String> items;

    public RecentlyViewed(int size){
        max_size = size;
        items = new LinkedList<>();
    }

    public void viewItem(String item){
        items.remove(item);
        items.addFirst(item);
        if(items.size()>max_size){
            items.removeLast();
        }
    }

    public List<String> getItems(){
        return items;
    }

    public static void main(String[] args) {
        RecentlyViewed rv = new RecentlyViewed(3);
        rv.viewItem("1");
        rv.viewItem("2");
        rv.viewItem("3");
        System.out.println(rv.getItems());
        rv.viewItem("2");
        rv.viewItem("4");
        System.out.println(rv.getItems());
    }
}
