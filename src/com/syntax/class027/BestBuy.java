package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args){

        HashMap<Integer, String> bestBut = new HashMap<>();
        bestBut.put(543543, "Printer");
        bestBut.put(342342, "Camera");
        bestBut.put(123512, "TV");
        bestBut.put(123124, "AGD");

        Iterator<Map .Entry<Integer, String>> iterator = bestBut.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
