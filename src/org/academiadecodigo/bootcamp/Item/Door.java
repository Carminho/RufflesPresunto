package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.bootcamp.Room.Room;

public class Door extends ItemAbstract {

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
    public String getMessage (){
        return "teste";
    }
}
