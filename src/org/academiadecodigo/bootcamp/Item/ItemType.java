package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ItemType {

    DEAD_ET_BED(1,2,1,2,"bed.png"),
    DESK(1,2,1,2,"bed.png"),
    DRAWER(1,2,1,2,"bed.png"),
    KEY(1,2,1,2,"bed.png"),
    SAFE(1,2,1,2,"bed.png"),
    CARPET(1,2,1,2,"bed.png"),
    TABLE(1,2,1,2,"bed.png"),
    CEO(1,2,1,2,"bed.png"),
    DEADBODY(1,2,1,2,"bed.png"),
    COMPUTER(1,2,1,2,"bed.png"),
    ELVIS(1,2,1,2,"bed.png"),
    BIKE(1,2,1,2,"bed.png"),
    TLP(1,2,1,2,"bed.png"),
    ET_GAME_DISK(1,2,1,2,"bed.png");


//PROPERTIES
    private Picture image;


//CONSTRUCTOR
    ItemType (int col, int row, double x, double y, String image){
        this.image = new Picture(x,y,image);
    }


}
