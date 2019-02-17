package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;

public enum DoorType {

    ONE_TWO(1,1,"Entering Security Room..."),
    TWO_ONE(1,1,"Entering Dissection Cell..."),
    TWO_THREE(1,1,"Entering Lobby..."),
    THREE_TWO(1,1,"Entering Security Room..."),
    THREE_FOUR(1,1,"Entering Meeting Room..."),
    FOUR_THREE(1,1,"Entering Lobby..."),
    THREE_FIVE(1,1,"Entering Lab..."),
    FIVE_THREE(1,1,"Entering Lobby..."),
    THREE_SIX(1,1,"Entering Warehouse..."),
    SIX_THREE(1,1,"Entering Lobby...");


//PROPERTIES
    private String message;
    private Position pos;


//CONSTRUCTOR
    DoorType (int col, int row, String message){
        pos = new Position(col, row);
        System.out.println(message);
    }

    public Position getPos (){
        return pos;
    }
}
