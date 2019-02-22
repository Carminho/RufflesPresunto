package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.Position;

public abstract class GameObject {

    //PROPERTIES
    private int IMAGE_X;

    private Position pos;
    //private Picture pic;


    //CONSTRUCTOR
    public GameObject(int col, int row) {
        pos = new Position(col, row);
    }


    //METHODS
    public Position getPos() {
        return pos;
    }


    public abstract String getImage(GameObject type);


    //public abstract void getImage (GameObject type);

    @Override
    public String toString() {
        return "GameObject{" +
                "pos=" + pos +
                '}';
    }
}
