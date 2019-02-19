package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.Item.ItemAbstract;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

    private final int PADDING = 10;

    //PROPERTIES
    private Position pos;
    private ET et;
    private ItemAbstract[] item;
    private Rectangle field;
    private RoomType type;
    private Picture floor;



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
        field = new Rectangle(PADDING,PADDING,400,400);
        field.draw();



            floor = new Picture(PADDING,PADDING,"tile.png");
            floor.draw();



    }


//METHODS
    public void interact() {
        for (int i = 0; i < item.length; i++) {
            if (et.getPos().equals(item[i].getPos())) {
                /** Insert code to show text box */
            }
        }
    }


}
