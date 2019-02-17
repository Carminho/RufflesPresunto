package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;

public class Game {

    private static final int PADDING = 10;

//PROPERTIES
    private Room[] rooms;



//CONSTRUCTOR
    public Game (){
        rooms = new Room[RoomType.values().length];

    }



//METHODS
    public void start (){
        createRooms();

    }


    private Room[] createRooms (){
        for (int i=0; i<rooms.length; i++){
            rooms[i] = new Room(RoomType.values()[i],PADDING,PADDING);
            System.out.println("A " + RoomType.values()[i] + " was created");
        }
        return rooms;
    }

}
