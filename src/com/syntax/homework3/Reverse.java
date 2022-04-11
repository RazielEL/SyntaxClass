package com.syntax.homework3;

public class Reverse {

    String rev (String str){
    StringBuilder stb = new StringBuilder();
    stb.append(str);
    stb.reverse();
    stb.toString();

    return stb.toString();

    }
}
