package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;

public class Game {


    //PROPERTIES
    private Room[] rooms;


    //CONSTRUCTOR
    public Game() {
        rooms = new Room[RoomType.values().length];

    }


    //METHODS
    public void start() {
        createRooms();

    }


    private Room[] createRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(RoomType.values()[i]);
            System.out.println("A " + RoomType.values()[i] + " was created");
        }

        return rooms;
    }

}
