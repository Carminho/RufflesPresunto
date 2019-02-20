package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

    private final int PADDING = 10;


    //PROPERTIES
    private Position pos;
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private Picture scenery;
    private boolean isShowing;


    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        isShowing = false;

        pos = new Position(PADDING, PADDING);

        items = new GameObject[type.getDoors().length + type.getItems().length];

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


        scenery = new Picture(pos.PADDING, pos.PADDING, "dissection-room.jpeg");
        scenery.draw();

        et = new ET(0, 0);
        et.move(6, 2);
        et.show();

    }


    //METHODS


    public ET getEt() {
        return et;
    }

    public void interact() {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Interacting");
            System.out.println("ET position: " + et.getPos());
            System.out.println("item " + i + " position :" + items[i].getPos());
            if (!isShowing) {

                if (et.getPos().equals(items[i].getPos())) {
                    items[i].showInteraction(items[i], this.isShowing);
                    this.isShowing = true;
                    System.out.println("Interact show. Boolean: " + this.isShowing );
                    return;
                }
            } else {
                items[i].showInteraction(items[i], this.isShowing);
                this.isShowing = false;
                System.out.println("interact delete. Boolean: " + this.isShowing );
                return;
            }
        }

    }
}
