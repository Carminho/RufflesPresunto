package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;

public enum ItemType {

    DEAD_ET_BED(1,2),
    DRAWER(1,2),
    DESK(1,2),
    KEY(1,2),
    SAFE(1,10),
    CARPET(10,20),
    TABLE(20,10),
    CEO(2,5),
    DEADBODY(10,10),
    COMPUTER(1,20),
    ELVIS(5,20),
    BIKE(4,50),
    TLP(10,10),
    ET_GAME_DISK(10,35);


//PROPERTIES
    private Position pos;



//CONSTRUCTOR
    ItemType(int col, int row){
        this.pos = new Position(col, row);
    }
}
