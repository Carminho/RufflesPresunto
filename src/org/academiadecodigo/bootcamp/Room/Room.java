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
    private GameObject[] items;
    private RoomType type;
    private boolean isShowing;
    private Picture picture;
    private Picture scenery;


    //CONSTRUCTOR
    public Room(RoomType type) {
        this.type = type;

        pos = new Position(Position.PADDING, Position.PADDING);

        items = new GameObject[type.getDoors().length + type.getItems().length];

        scenery = new Picture(pos.PADDING, pos.PADDING, type.getPic());
        scenery.draw();

        createGameObjects();
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



    public GameObject[] getItems() {
        return items;
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




