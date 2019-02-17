package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.bootcamp.Room.Room;

public class Door extends ItemAbstract {

//PROPERTIES
    private Room nextRoom;
    private DoorType type;


//CONSTRUCTOR
    public Door (DoorType type, int col, int row){
        super(col, row);
        this.type = type;
}



//METHODS
    public void changeRoom (Room room){
        System.out.println("");
    }


    @Override
    public String getMessage (){
        return "";
    }
}
