package com.company;

public class Main {

    public static void main(String[] args) {
        Chair roomChair = new Chair("OAK", 4, "RED");
        Couch myCouch = new Couch("HOM", "BLACK", 4);

        Room myRoom = new Room(roomChair, myCouch);

        System.out.println(myRoom.getChair().getLegAmount());

        myRoom.getChair().recline(6);
    }
}
