package org.academiadecodigo.bootcamp.GameObjects.Doors;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.Room.Room;

public class Door extends GameObject {

    //PROPERTIES
    private Room nextRoom;
    private DoorType type;


    //CONSTRUCTOR
    public Door(DoorType type) {
        super(type.getPos().getCol(), type.getPos().getRow());
        this.type = type;
    }


    //METHODS
    @Override
    public String getImage(GameObject door) {
        if (door.getClass() == Door.class) {
            return ((Door) door).type.getImage();
        }
        return "something went wrong! - class Door";
    }

    public DoorType getType() {
        return type;
    }
}

