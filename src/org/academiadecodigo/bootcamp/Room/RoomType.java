package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.Doors.DoorType;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum RoomType {

    DISSECTION_CELL(ItemType.DEAD_ET_BED, ItemType.DRAWER, ItemType.DESK, DoorType.ONE_TWO),
    SECURITY(ItemType.KEY, ItemType.SAFE, ItemType.CARPET, DoorType.TWO_ONE, DoorType.TWO_THREE),
    LOBBY(ItemType.TABLE, DoorType.THREE_TWO, DoorType.THREE_FOUR, DoorType.THREE_FIVE, DoorType.THREE_SIX),
    MEETING_ROOM(ItemType.CEO, ItemType.DEADBODY, DoorType.FOUR_THREE),
    LAB(ItemType.COMPUTER, DoorType.FIVE_THREE),
    WAREHOUSE(ItemType.ELVIS, ItemType.BIKE, ItemType.TLP, DoorType.SIX_THREE),
    EGGXIT(ItemType.ET_GAME_DISK);


    //PROPERTIES
    private Item[] items;
    private Door[] doors;
    private Picture pic;


    //CONSTRUCTOR
    //rooms with 3 items and 1 door
    RoomType(ItemType type1, ItemType type2, ItemType type3, DoorType type4, String pic) {
        this.items = new Item[3];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.doors = new Door[1];
        this.doors[0] = new Door(type4);
        this.pic = new Picture(pic);
    }

    //rooms with 3 items and 2 doors
    RoomType(ItemType type1, ItemType type2, ItemType type3, DoorType type4, DoorType type5) {
        this.items = new Item[3];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.doors = new Door[2];
        this.doors[0] = new Door(type4);
        this.doors[1] = new Door(type5);
    }

    //rooms with 2 items and 1 door
    RoomType(ItemType type1, ItemType type2, DoorType type3) {
        this.items = new Item[2];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.doors = new Door[1];
        this.doors[0] = new Door(type3);
    }

    //rooms with 1 item (no doors)
    RoomType(ItemType type1) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[0];
    }

    //rooms with 1 item and 1 door
    RoomType(ItemType type1, DoorType type2) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[1];
        this.doors[0] = new Door(type2);
    }

    //rooms with 1 item and 4 doors
    RoomType(ItemType type1, DoorType type2, DoorType type3, DoorType type4, DoorType type5) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
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
