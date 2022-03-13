package com.syntax.class022;

//        Write program: userClass  that has a constructor that initializes instance variable
//        name and mobile number. Create a subclass  userInfo that will have user address
//        variable and it also being initialized through constructor call. Print users name,
//        mobile number and address in userDetails method. Test your code.

//WAZNE W CHUJ WAZNE W CHUJ WAZNE W CHUJ WAZNE W CHUJ

    public class Task1 {



}


    class userClass {
    String name;
    String mobileNumber;
    userClass (String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

    class userInfo extends userClass {
    String userAddress;
    userInfo (String name, String mobileNumber, String userAddress){   // jak mamy w parent clasie construktor to musimy do child class tez skopiowac, zeby sie zgadzalo
        super(name,mobileNumber);                                       // jak skopiujemy to w child classie robimy tez super( ) z tymi co skopiowalismy)
        this.userAddress = userAddress;

    }


    void userDetalis(){

    System.out.println("name = " + name);
    System.out.println("Address = " + userAddress);
    System.out.println("Mobile = " + mobileNumber);

}

    public static void main (String[] args){


        userInfo UserInfo =  new userInfo("Jurij", "6466481396", "USA" );
        UserInfo.userDetalis();


    }


}