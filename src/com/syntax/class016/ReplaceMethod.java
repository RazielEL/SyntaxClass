package com.syntax.class016;

public class ReplaceMethod {


    public static void main(String[] args) {

        String str = "Batch 12 is good";
        System.out.println(str.replace("good", "great"));
        System.out.println(str.replace(" ", "_"));
        System.out.println(str.replace(" ", "")); // removal

        String str1 = "fkajdlzzzzzzzzzsfAAkasZZZjfkaAAjs 40ZZ239AA50aaa2zzz38-0 dfjazAzAzz  afAAZZAzzzzzzzzzsjdgoias0";
        System.out.println(str1.replaceAll("j", "X"));
        System.out.println(str1.replaceAll(("[0-9]"), "#")); // usuwa np numery
        System.out.println(str1.replaceAll(("[a-z]"), "#"));
    }
}
