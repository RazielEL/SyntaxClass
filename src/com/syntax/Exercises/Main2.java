package com.syntax.Exercises;

class Main2 {
    public static void main(String[] args) {

        String s1 = ") ()                            (";
        String s = s1.replaceAll(" ","");
        System.out.println(isBalanced(s));
    }
    public static boolean isBalanced(String s){
        String[] split = s.split("");


        boolean flag = false;
        for (int i = 0; i < split.length-1; i++){


            if (split[i].equals(split[split.length - 1 - i])) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        return flag;
    }
}

