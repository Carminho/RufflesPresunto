package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

    //PROPERTIES
    private Position pos = new Position(0,0);
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private Picture scenery;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;
        pos = new Position(pos.getPADDING(), pos.getPADDING());

        items = new GameObject[type.getDoors().length + type.getItems().length];

        int index = 0;

        for (int i = 0; i < type.getDoors().length; i++) {
            items[index] = type.getDoors()[i];
            index += 1;
        }

        for (int i = 0; i < type.getItems().length; i++) {
            items[index] = type.getItems()[i];
            index += 1;
        }

        scenery= new Picture(pos.getPADDING(),pos.getPADDING(),"scenery.jpeg");
        scenery.draw();



    }


//METHODS
    public void interact() {
        for (int i = 0; i < items.length; i++) {
            if (et.getPos().equals(items[i].getPos())) {
                /** Insert code to show text box */
            }
        }
    }


}
