package com.company;

/**
 * Created by danielternyak2 on 8/30/15.
 */
public class Hamburger {

    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;

    public Hamburger(boolean lettuce, boolean tomato, boolean carrot) {
        this.lettuce  = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
    }

    public int totalPrice() {
        int total = 5;
        if (this.getLettuce()) {
            total += 1;
        }
        if (this.getTomato()) {
            total += 1;
        }
        if (this.getCarrot()) {
            total += 1;
        }
        return total;
    }

    public boolean getLettuce() {
        return this.lettuce;

    }

    public boolean getTomato() {
        return this.tomato;

    }

    public boolean getCarrot() {
        return this.carrot;

    }




}
