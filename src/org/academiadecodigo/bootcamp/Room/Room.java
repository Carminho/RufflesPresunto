package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.Item.ItemAbstract;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {



    //PROPERTIES
    private Position pos = new Position(0,0);
    private ET et;
    private ItemAbstract[] item;
    private Rectangle field;
    private RoomType type;
    private Picture floor;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;
        pos = new Position(pos.getPADDING(), pos.getPADDING());

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
        field = new Rectangle(pos.getPADDING(),pos.getPADDING(),600,600);
        field.draw();




            floor = new Picture(pos.getPADDING(),pos.getPADDING(),"bg.png");
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
