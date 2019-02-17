package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class ItemAbstract {

//PROPERTIES
    private Position pos;
    private Picture pic;



//CONSTRUCTOR
    public ItemAbstract(int col, int row){
        pos = new Position(col, row);
    }



//METHODS
    public abstract String getMessage ();


    public Position getPos (){
        return pos;
    }

}
