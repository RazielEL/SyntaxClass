package com.syntax.replits;

class Account {

    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public void setAcc_no(long newAcc_no){
        acc_no = newAcc_no;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }
    public void setAmount(double newAmount){
        amount = newAmount;
    }

    public long getAcc_no(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getAmount(){
        return amount;
    }

}


class Rep181 {
    public static void main (String[] args) {

        Account a = new Account();

        a.setAcc_no(7560504000L);
        a.setName("Sumair");
        a.setEmail("sumair@syntax.com");
        a.setAmount(50000.0);

        System.out.println(a.getAcc_no() + " " + a.getName() + " " + a.getEmail() + " " + a.getAmount());
    }
    }