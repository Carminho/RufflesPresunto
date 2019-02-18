package org.academiadecodigo.bootcamp.GameObjects.Doors;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
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
    public String getMessage (){
        return "teste";
    }


    /*@Override
    public void showInteraction (DoorType type){
        switch (type){
            case ONE_TWO: System.out.println("interact ONE_TWO");
            case TWO_ONE: System.out.println("interact TWO_ONE");
            case TWO_THREE: System.out.println("interact TWO_THREE");
            case THREE_TWO: System.out.println("interact THREE_TWO");
            case THREE_FOUR: System.out.println("interact THREE_FOUR");
            case FOUR_THREE: System.out.println("interact FOUR_THREE");
            case THREE_FIVE: System.out.println("interact THREE_FIVE");
            case FIVE_THREE: System.out.println("interact FIVE_THREE");
            case THREE_SIX: System.out.println("interact THREE_SIX");
            case SIX_THREE: System.out.println("interact SIX_THREE");
        }
    }*/

}

