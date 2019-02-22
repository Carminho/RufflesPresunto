package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {


    //PROPERTIES
    private Position pos;
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private Picture scenery;
    private boolean isShowing;
    private Picture picture;


    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        pos = new Position(Position.PADDING, Position.PADDING);

        items = new GameObject[type.getDoors().length + type.getItems().length];

        scenery = new Picture(pos.PADDING, pos.PADDING, "dissection-room.jpeg");
        scenery.draw();

        int index = 0;

        for (int i = 0; i < type.getDoors().length; i++) {
            items[index] = type.getDoors()[i];
            System.out.println("Index: " + index + " Door: " + items[index]);
            index++;
        }

        for (int i = 0; i < type.getItems().length; i++) {
            items[index] = type.getItems()[i];
            System.out.println("Index: " + index + " Item: " + items[index]);
            index++;
        }


        et = new ET(6, 2);
        et.show();

    }


    //METHODS


    public ET getEt() {
        return et;
    }

    public void interact() {
        for (int i = 0; i < items.length; i++) {

            if (et.getPos().equals(items[i].getPos())) {

                if (items[i].getClass() == Item.class) {

                    if (!isShowing) {
                        picture = new Picture(2 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, items[i].getImage(items[i]));

                        picture.draw();
                        isShowing = true;
                        System.out.println("draw");
                    } else {

                        picture.delete();
                        isShowing = false;
                        System.out.println("delete");
                    }


                } else {
                    picture = new Picture(Position.PADDING, Position.PADDING, items[i].getImage(items[i]));
                    picture.draw();
                    if (items[i].getClass() == Door.class) {
                        ET et = new ET(((Door) items[i]).getType().getEtCol(), ((Door) items[i]).getType().getEtRow());
                        this.et = et;
                        et.show();
                    }
                }
            }
        }
    }


}




