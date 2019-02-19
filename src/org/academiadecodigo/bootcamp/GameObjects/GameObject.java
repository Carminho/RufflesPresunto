package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;
import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

//PROPERTIES
    private Position pos;
    //private Picture pic;



//CONSTRUCTOR
    public GameObject(int col, int row){
        pos = new Position(col, row);
    }



//METHODS
    public Position getPos (){
        return pos;
    }


    public abstract String getMessage (GameObject type);



    public abstract void showInteraction (GameObject type);


    @Override
    public String toString() {
        return "GameObject{" +
                "pos=" + pos +
                '}';
    }
}
