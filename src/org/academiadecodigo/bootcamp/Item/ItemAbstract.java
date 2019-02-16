package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;

public abstract class Item {

//PROPERTIES
    private Position pos;
    private Picture pic;



//CONSTRUCTOR
    public Item (Position x, Position y){

    }



//METHODS
    public abstract String getMessage ();

}
