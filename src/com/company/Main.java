package com.company;



public class Main {

    public static void main(String[] args) {
        Hamburger normalBurger = new Hamburger(true, false, false);
        HealthyBurger healthyBurger = new HealthyBurger(true, true, true, true, true);
        System.out.println(normalBurger.totalPrice());
        System.out.println(healthyBurger.totalPrice());



    }


}
