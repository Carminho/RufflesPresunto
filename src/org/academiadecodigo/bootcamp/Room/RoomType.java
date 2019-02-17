package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.Item.Item;
import org.academiadecodigo.bootcamp.Item.ItemType;

public enum RoomType {

    DISSECTION_CELL(3,ItemType.DEAD_ET_BED,ItemType.DRAWER,ItemType.DESK),
    SECURITY(3,ItemType.KEY,ItemType.SAFE,ItemType.CARPET),
    LOBBY(1,ItemType.TABLE),
    MEETING_ROOM(2,ItemType.CEO,ItemType.DEADBODY),
    LAB(1,ItemType.COMPUTER),
    WAREHOUSE(3,ItemType.ELVIS,ItemType.BIKE,ItemType.TLP);


//PROPERTIES
    private Item[] items;



//CONSTRUCTOR
    RoomType (int items, Item num1, Item num2, Item num3){
        this.items = new Item[items];
        this.items[0] = num1;
        this.items[1] = num2;
        this.items[2] = num3;
    }

    RoomType (int items, Item num1, Item num2){
        this.items = new Item[items];
        this.items[0] = num1;
        this.items[1] = num2;
    }

    RoomType (int items, Item num1){
        this.items = new Item[items];
        this.items[0] = num1;
    }


}
