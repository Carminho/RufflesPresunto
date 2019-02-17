package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.Item.Door;
import org.academiadecodigo.bootcamp.Item.DoorType;
import org.academiadecodigo.bootcamp.Item.Item;
import org.academiadecodigo.bootcamp.Item.ItemType;

public enum RoomType {

    DISSECTION_CELL(ItemType.DEAD_ET_BED, 1, 2, ItemType.DRAWER, 2, 3, ItemType.DESK, 4, 5, DoorType.ONE_TWO),
    SECURITY(ItemType.KEY, 1, 2, ItemType.SAFE, 5, 4, ItemType.CARPET, 1, 2, DoorType.TWO_ONE, DoorType.TWO_THREE),
    LOBBY(ItemType.TABLE, 1, 2, DoorType.THREE_TWO, DoorType.THREE_FOUR, DoorType.THREE_FIVE, DoorType.THREE_SIX),
    MEETING_ROOM(ItemType.CEO, 2, 3, ItemType.DEADBODY, 2, 4, DoorType.FOUR_THREE),
    LAB(ItemType.COMPUTER, 5, 4, DoorType.FIVE_THREE),
    WAREHOUSE(ItemType.ELVIS, 2, 3, ItemType.BIKE, 3, 4, ItemType.TLP, 5, 4, DoorType.SIX_THREE),
    EGGXIT(ItemType.ET_GAME_DISK, 4, 3);


    //PROPERTIES
    private Item[] items;
    private Door[] doors;


    //CONSTRUCTOR
    //rooms with 3 items and 1 door
    RoomType(ItemType type1, int col1, int row1, ItemType type2, int col2, int row2, ItemType type3, int col3, int row3, DoorType type4) {
        this.items = new Item[3];
        this.items[0] = new Item(type1, col1, row1);
        this.items[1] = new Item(type2, col2, row2);
        this.items[2] = new Item(type3, col3, row3);
        this.doors = new Door[1];
        this.doors[0] = new Door(type4);
    }

    //rooms with 3 items and 2 doors
    RoomType(ItemType type1, int col1, int row1, ItemType type2, int col2, int row2, ItemType type3, int col3, int row3, DoorType type4, DoorType type5) {
        this.items = new Item[3];
        this.items[0] = new Item(type1, col1, row1);
        this.items[1] = new Item(type2, col2, row2);
        this.items[2] = new Item(type3, col3, row3);
        this.doors = new Door[2];
        this.doors[0] = new Door(type4);
        this.doors[1] = new Door(type5);
    }

    //rooms with 2 items and 1 door
    RoomType(ItemType type1, int col1, int row1, ItemType type2, int col2, int row2, DoorType type3) {
        this.items = new Item[2];
        this.items[0] = new Item(type1, col1, row1);
        this.items[1] = new Item(type2, col2, row2);
        this.doors = new Door[1];
        this.doors[0] = new Door(type3);
    }

    //rooms with 1 item (no doors)
    RoomType(ItemType type1, int col1, int row1) {
        this.items = new Item[1];
        this.items[0] = new Item(type1, col1, row1);
        this.doors = new Door[0];
    }

    //rooms with 1 item and 1 door
    RoomType(ItemType type1, int col1, int row1, DoorType type2) {
        this.items = new Item[1];
        this.items[0] = new Item(type1, col1, row1);
        this.doors = new Door[1];
        this.doors[0] = new Door(type2);
    }

    //rooms with 1 item and 4 doors
    RoomType(ItemType type1, int col1, int row1, DoorType type2, DoorType type3, DoorType type4, DoorType type5) {
        this.items = new Item[1];
        this.items[0] = new Item(type1, col1, row1);
        this.doors = new Door[4];
        this.doors[0] = new Door(type2);
        this.doors[1] = new Door(type3);
        this.doors[2] = new Door(type4);
        this.doors[3] = new Door(type5);

    }

    public Item[] getItems() {
        return items;
    }

    public Door[] getDoors() {
        return doors;
    }
}
