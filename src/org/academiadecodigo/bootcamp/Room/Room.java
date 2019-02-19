package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

<<<<<<< HEAD
    private final int PADDING = 10;

=======
>>>>>>> 4f81f135244335a0e323b570c0617bbb8c59517f
    //PROPERTIES
    private Position pos;
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private Picture scenery;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;
<<<<<<< HEAD
        pos = new Position(PADDING, PADDING);
=======
        pos = new Position(pos.PADDING, pos.PADDING);
>>>>>>> 4f81f135244335a0e323b570c0617bbb8c59517f

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
<<<<<<< HEAD
        field = new Rectangle(PADDING,PADDING,400,400);
        field.draw();



            floor = new Picture(PADDING,PADDING,"tile.png");
            floor.draw();
=======

        scenery= new Picture(pos.PADDING,pos.PADDING,"scenery.jpeg");
        scenery.draw();
>>>>>>> 4f81f135244335a0e323b570c0617bbb8c59517f



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
