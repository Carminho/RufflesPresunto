package org.academiadecodigo.bootcamp.GameObjects;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

//PROPERTIES
    private Position pos;
    private Picture pic;



//CONSTRUCTOR
    public GameObject(int col, int row){
        pos = new Position(col, row);
    }



//METHODS
    public abstract String getMessage ();


    public Position getPos (){
        return pos;
    }

    //public abstract void showInteraction ();

}
