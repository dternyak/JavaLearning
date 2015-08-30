package com.company;

/**
 * Created by danielternyak2 on 8/30/15.
 */
public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.health = health;
        }


    }

    public void loseHealth(int damage) {
        int to_apply = this.health - damage;
        if (to_apply > 0) {
            this.health = to_apply;
        } else {
            System.out.println("knocked out");
        }
    }

}
