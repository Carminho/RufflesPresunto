package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.ET;
import org.academiadecodigo.bootcamp.Game;
import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Room {

    private final int INIT_ET_COL = 6;
    private final int INIT_ET_ROW = 2;

    //PROPERTIES
    private Position pos;
    private ET et;
    private GameObject[] items;
    private RoomType type;
    private boolean isShowing;
    private Picture picture;
    private Game game;



    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        pos = new Position(Position.PADDING, Position.PADDING);

        items = new GameObject[type.getDoors().length + type.getItems().length];

        Picture scenery = new Picture(pos.PADDING, pos.PADDING, "dissection-room.jpeg");
        scenery.draw();

        createGameObjects();

        et = new ET(INIT_ET_COL, INIT_ET_ROW);
        et.show();

    }

    //METHODS


    private void createGameObjects() {
        int index = 0;
        for (int i = 0; i < type.getDoors().length; i++) {
            items[index] = type.getDoors()[i];
            index++;
        }
        for (int i = 0; i < type.getItems().length; i++) {
            items[index] = type.getItems()[i];
            index++;
        }
    }


    public ET getEt() {
        return et;
    }

    public void interact() {
        for (int i = 0; i < items.length; i++) {

            if (isShowing) {
                picture.delete();
                isShowing = false;
                return;
            }
            if (et.getPos().equals(items[i].getPos())) {
                if (items[i].getClass() == Door.class) {
                    picture = new Picture(Position.PADDING, Position.PADDING, items[i].getImage(items[i]));
                    picture.draw();
                    ET et = new ET(((Door) items[i]).getType().getEtCol(), ((Door) items[i]).getType().getEtRow());
                    this.et = et;
                    et.show();
                    /*System.out.println(items[i].getImage(items[i]));
                    switch (items[i].getImage(items[i])){
                        case "resources/security.jpeg"
                    }*/
                    }

                if (items[i].getClass() == Item.class) {
                    picture = new Picture(2 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, items[i].getImage(items[i]));
                    picture.draw();
                    isShowing = true;
                    return;
                }


            }

        }

    }

    public RoomType getType() {
        return type;
    }


}




