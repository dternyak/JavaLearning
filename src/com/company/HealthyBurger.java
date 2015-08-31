package com.company;

/**
 * Created by danielternyak2 on 8/30/15.
 */
public class HealthyBurger extends Hamburger {

    private boolean poppys;
    private boolean cheese;

    public HealthyBurger(boolean poppys, boolean cheese, boolean lettuce, boolean tomato, boolean carrot) {
        super(lettuce, tomato, carrot);
        this.poppys = poppys;
        this.cheese = cheese;
    }

    public int totalPrice() {
        int total = 5;
        if (this.poppys) {
            total += 1;
        }
        if (this.cheese) {
            total += 1;
        }
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

}
