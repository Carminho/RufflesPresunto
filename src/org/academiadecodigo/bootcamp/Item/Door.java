package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.bootcamp.Room.Room;

public class Door extends ItemAbstract {

//PROPERTIES
    private Room nextRoom;



//CONSTRUCTOR
    public Door (int col, int row){
        super(col, row);
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
