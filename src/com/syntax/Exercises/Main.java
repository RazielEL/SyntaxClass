package com.syntax.Exercises;

import java.util.*;
import java.util.Map.Entry;


class Main {
    public static void main (String[] args) {

        List<Map<String, Object>> datalist = new ArrayList<>();


        Map<String, Object> appleMap = new LinkedHashMap<>();

        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.00d);
        appleMap.put("Quantity", 10);

        datalist.add(appleMap);

        Map<String, Object> orangeMap = new LinkedHashMap<>();

        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99d);
        orangeMap.put("Quantity", 10);

        datalist.add(orangeMap);

        double purchaseTotal = 0;

        for (int i = 0; i < datalist.size(); i++) {

            Map<String, Object> currentMapValue = datalist.get(i);


            String name = (String) currentMapValue.get("Items");
            double price = (double) currentMapValue.get("Price");
            int quantity = (int) currentMapValue.get("Quantity");
            double quantity2 = quantity;
            double subTotal = price * quantity;
            purchaseTotal = purchaseTotal + subTotal;


                System.out.println("Items: " + name + " Price: " + price + " Quantity: " + quantity2 + " SubTotal: " + subTotal);
                System.out.println();

            }
        System.out.println("Your Purchase total:" + purchaseTotal);
            }

        }






