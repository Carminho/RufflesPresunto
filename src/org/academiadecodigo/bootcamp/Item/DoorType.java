package org.academiadecodigo.bootcamp.Item;

public enum DoorType {

    ONE_TWO("Entering Security Room..."),
    TWO_ONE("Entering Dissection Cell..."),
    TWO_THREE("Entering Lobby..."),
    THREE_TWO("Entering Security Room..."),
    THREE_FOUR("Entering Meeting Room..."),
    FOUR_THREE("Entering Lobby..."),
    THREE_FIVE("Entering Lab..."),
    FIVE_THREE("Entering Lobby..."),
    THREE_SIX("Entering Warehouse..."),
    SIX_THREE("Entering Lobby...");


//PROPERTIES
    private String message;


//CONSTRUCTOR
    DoorType (String message){
        System.out.println(message);
    }

}
