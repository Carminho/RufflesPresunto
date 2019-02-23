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


    //PROPERTIES
    private Position pos;
    //private ET et;
    private GameObject[] items;
    private RoomType type;
    private boolean isShowing;
    private Picture picture;
    private Picture scenery;
    //private Game game;


    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        pos = new Position(Position.PADDING, Position.PADDING);

        items = new GameObject[type.getDoors().length + type.getItems().length];

        scenery = new Picture(pos.PADDING, pos.PADDING, type.getPic());
        scenery.draw();

        createGameObjects();

        //game = new Game();

        /*if (type == RoomType.DISSECTION_CELL) {
            et = new ET(INIT_ET_COL, INIT_ET_ROW);
            et.show();
        }*/

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


    /*public ET getEt() {
        return et;
    }*/


    /*public void interact() {
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

                    System.out.println("door image :" + items[i].getImage(items[i]));

                    for (int j = 0; j < RoomType.values().length; j++) {
                        if (RoomType.values()[j].getPic().equals(items[i].getImage(items[i]))) {                               //se nome da imagem de Door é = ao nome da imagem de RoomType
                            System.out.println("room type image: " + RoomType.values()[j].getPic());
                            System.out.println("room type to set current: " + RoomType.values()[j]);
                            game.setCurrentRoom(RoomType.values()[j]);
                            System.out.println("current room " + game.getCurrentRoom());
                            ET et = new ET(((Door) items[i]).getType().getEtCol(), ((Door) items[i]).getType().getEtRow());
                            this.et = et;
                            et.show();
                            return;
                        }
                    }
                    return;
                }

                if (items[i].getClass() == Item.class) {
                    picture = new Picture(2 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, items[i].getImage(items[i]));
                    picture.draw();
                    isShowing = true;
                    System.out.println("current room " + game.getCurrentRoom());
                    return;
                }


            }

        }

    }*/

    public GameObject[] getItems() {
        return items;
    }

    public void setItems(GameObject[] items) {
        this.items = items;
    }

    public RoomType getType() {
        return type;
    }

    public boolean isShowing() {
        return isShowing;
    }

    public Picture getPicture (){
        return picture;
    }

    public void setIsShowing (boolean value){
        isShowing = value;
    }

    public void setPicture (Picture image){
        picture = image;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type=" + type +
                '}';
    }
}




