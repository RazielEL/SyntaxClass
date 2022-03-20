package com.syntax.class024;

public class ShoppingCart {
    private double originalPrice = 100;
    private double discount = 0.15;

    void setDiscount (double discount){
        if (discount > 0 && discount >= 0.15){
            this.discount = discount;
        } else {
            System.out.println("Can't have that much of a discount");
        }
    }


    void calculatePrice(){
        double price = originalPrice - (originalPrice * discount);
        System.out.println("Price after discount: " + price);

    }

    public double getDiscount() {
        return discount;
    }

    public static void main (String[] args){

        ShoppingCart sc = new ShoppingCart();

//        sc.originalPrice = 100;
//        sc.discount = 0.20;
        sc.setDiscount(0.1);
        sc.calculatePrice();

        System.out.println(sc.getDiscount());





    }

}
