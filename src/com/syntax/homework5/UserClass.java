package com.syntax.homework5;

public class UserClass {

    String name;
    String mobile;
    String address;

   UserClass() {

    }

    public static void main (String[] args){

    UserInfo man = new UserInfo("Adam", "555 454 212", "Korfantego 13");

    man.userDetails();

    }
}

class UserInfo extends UserClass{

    String address;

    UserInfo(String name, String mobile,String address){
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    void userDetails() {
        System.out.println(name + " " + mobile + " " + address);


    }


}


