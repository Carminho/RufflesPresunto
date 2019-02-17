package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.Item.Item;
import org.academiadecodigo.bootcamp.Item.ItemType;

public enum RoomType {

    DISSECTION_CELL(3, ItemType.DEAD_ET_BED,1,2,ItemType.DRAWER,2,3,ItemType.DESK,4,5),
    SECURITY(3,ItemType.KEY,1,2,ItemType.SAFE,5,4,ItemType.CARPET,1,2),
    LOBBY(1,ItemType.TABLE,1,2),
    MEETING_ROOM(2,ItemType.CEO,2,3,ItemType.DEADBODY,2,4),
    LAB(1,ItemType.COMPUTER,5,4),
    WAREHOUSE(3,ItemType.ELVIS,2,3,ItemType.BIKE,3,4,ItemType.TLP,5,4),
    EGGXIT(1,ItemType.ET_GAME_DISK,4,3);


//PROPERTIES
    private Item[] items;



//CONSTRUCTOR
    RoomType (int items, ItemType type1, int col1, int row1, ItemType type2, int col2, int row2, ItemType type3, int col3, int row3){
        this.items = new Item[items];
        this.items[0] = new Item(type1,col1,row1);
        this.items[1] = new Item(type2,col2,row2);
        this.items[2] = new Item(type3,col3,row3);
    }

    RoomType (int items, ItemType type1, int col1, int row1, ItemType type2, int col2, int row2){
        this.items = new Item[items];
        this.items[0] = new Item(type1,col1,row1);
        this.items[1] = new Item(type2,col2,row2);
    }

    RoomType (int items, ItemType type1, int col1, int row1){
        this.items = new Item[items];
        this.items[0] = new Item(type1,col1,row1);
    }


}
