package org.academiadecodigo.bootcamp.GameObjects.Doors;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.Room.Room;

public class Door extends GameObject {

//PROPERTIES
    private Room nextRoom;
    private DoorType type;


//CONSTRUCTOR
    public Door (DoorType type){
        super(type.getPos().getCol(), type.getPos().getRow());
        this.type = type;
}



//METHODS
    public void changeRoom (Room room){
        System.out.println("");
    }


    @Override
    public String getMessage (GameObject type){
        if(type.getClass() == Door.class) {
            return ((Door)type).type.getMessage();
        }
        return "something went wrong! - Door";
    }

    /*public void showInteraction (GameObject type, boolean isShowing){

    }*/


}

