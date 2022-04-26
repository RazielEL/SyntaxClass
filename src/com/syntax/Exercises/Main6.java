package com.syntax.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Main6 {

    public static void main(String[] args) {

        List<String> deviceNames = new ArrayList<String>(Arrays.asList("switch", "tv", "switch", "tv", "switch", "tv", "radio"));


        System.out.println(countDeviceNames(deviceNames));

    }

    public static List<String> countDeviceNames(List<String> deviceNames) {

        List<String> dev= new ArrayList<>();
        for(int i = 0; i < deviceNames.size(); i++){
            for (int j = 0; j < deviceNames.size(); j++){
                if (i == j){
                    continue;
                }

                if(deviceNames.get(i).contains(deviceNames.get(j))){
                    StringBuilder str = new StringBuilder(deviceNames.get(i));
                    str.append(dev.add(deviceNames.get(i)+1));
                    dev.set(i, str.toString());
                } else {
                    dev.add(deviceNames.get(i)+0);
                }

            }
        }




        return dev;
    }
}
