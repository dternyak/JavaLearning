package com.company;

/**
 * Created by danielternyak2 on 8/29/15.
 */
public class Chair {
    private String woodType;
    private int legAmount;
    private String color;
    private int reclined_amount;

    public Chair(String woodType, int legAmount, String color) {
        this.woodType = woodType;
        this.legAmount = legAmount;
        this.color = color;
    }

    public String getWoodType() {
        return woodType;
    }

    public int getLegAmount() {
        return legAmount;
    }

    public String getColor() {
        return color;
    }

    public void recline(int amount) {
        this.reclined_amount = this.reclined_amount + amount;
        System.out.println(this.reclined_amount);


    }
}
