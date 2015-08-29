package com.company;

/**
 * Created by danielternyak2 on 8/29/15.
 */
public class Room {
    Chair chair;
    Couch couch;

    public Room(Chair chair, Couch couch) {
        this.chair = chair;
        this.couch = couch;
    }

    public Chair getChair() {
        return chair;
    }

    public Couch getCouch() {
        return couch;
    }
}
