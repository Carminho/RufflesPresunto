package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.Item.ItemAbstract;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Room {


//PROPERTIES
    private Position pos;
    private ET et;
    //private ItemAbstract[] item;
    private Rectangle room;
    private RoomType type;



//CONSTRUCTOR
    public Room (RoomType type, int col, int row){
        this.type = type;
        pos = new Position (col, row);
    }


//METHODS





}
