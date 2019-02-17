package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.Item.ItemAbstract;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Room {

    private final int PADDING = 10;

    //PROPERTIES
    private Position pos;
    private ET et;
    private ItemAbstract[] item;
    private Rectangle room;
    private RoomType type;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;
        pos = new Position(PADDING, PADDING);

        item = new ItemAbstract[type.getDoors().length + type.getItems().length];

        int index = 0;

        for (int i = 0; i < type.getDoors().length; i++) {
            item[index] = type.getDoors()[i];
            index += 1;
        }

        for (int i = 0; i < type.getItems().length; i++) {
            item[index] = type.getItems()[i];
            index += 1;
        }

    }


//METHODS
    public void interact() {
        for (int i = 0; i < item.length; i++) {

        }
    }


}
