package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

    private final int PADDING = 10;


    //PROPERTIES
    private Position pos;
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private Picture scenery;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        pos = new Position(PADDING, PADDING);

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


        scenery= new Picture(pos.PADDING,pos.PADDING,"scenery.jpeg");
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
