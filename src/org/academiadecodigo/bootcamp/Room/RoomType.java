package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.Doors.DoorType;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.Arrays;

public enum RoomType {

    DISSECTION_CELL(ItemType.DEAD_ET_BED1, ItemType.DEAD_ET_BED2, ItemType.DEAD_ET_BED3, ItemType.DRAWER1, ItemType.DRAWER2, ItemType.DRAWER3, ItemType.DRAWER4, ItemType.DESK1, ItemType.DESK2, ItemType.DESK3, ItemType.DESK4, DoorType.ONE_TWO, "dissection-room.jpeg"),
    SECURITY(ItemType.KEY1,ItemType.KEY2, ItemType.SAFE1,ItemType.SAFE2, ItemType.CARPET1,ItemType.CARPET2,ItemType.CARPET3,ItemType.CARPET4,ItemType.CARPET5,ItemType.CARPET6,ItemType.CARPET7,ItemType.CARPET8,ItemType.CARPET9,ItemType.CARPET10,ItemType.CARPET11,ItemType.CARPET12, DoorType.TWO_ONE, DoorType.TWO_THREE, "resources/security.jpeg"),
    LOBBY(ItemType.TABLE, DoorType.THREE_TWO, DoorType.THREE_FOUR, DoorType.THREE_FIVE, DoorType.THREE_SIX, "dissection-room.jpeg"),
    MEETING_ROOM(ItemType.CEO, ItemType.DEADBODY, DoorType.FOUR_THREE, "dissection-room.jpeg"),
    LAB(ItemType.COMPUTER, DoorType.FIVE_THREE, "dissection-room.jpeg"),
    WAREHOUSE(ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.BIKE, ItemType.TLP, DoorType.SIX_THREE, "dissection-room.jpeg"),
    EGGXIT(ItemType.ET_GAME_DISK, "dissection-room.jpeg");


    //PROPERTIES
    private Item[] items;
    private Door[] doors;
    private String pic;
    //private boolean isActive;    //is set as current room or not



    //CONSTRUCTOR
    //rooms with 3 items and 1 door
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, ItemType type5, ItemType type6, ItemType type7, ItemType type8, ItemType type9, ItemType type10, ItemType type11, DoorType type12, String imagePath) {
        this.items = new Item[11];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.items[3] = new Item(type4);
        this.items[4] = new Item(type5);
        this.items[5] = new Item(type6);
        this.items[6] = new Item(type7);
        this.items[7] = new Item(type8);
        this.items[8] = new Item(type9);
        this.items[9] = new Item(type10);
        this.items[10] = new Item(type11);
        this.doors = new Door[1];
        this.doors[0] = new Door(type12);
        this.pic = imagePath;
    }



    //rooms with 3 items and 2 doors
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, ItemType type5, ItemType type6, ItemType type7, ItemType type8, ItemType type9, ItemType type10, ItemType type11, ItemType type12, ItemType type13, ItemType type14, ItemType type15, ItemType type16, DoorType type17, DoorType type18, String imagePath) {
        this.items = new Item[16];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.items[3] = new Item(type4);
        this.items[4] = new Item(type5);
        this.items[5] = new Item(type6);
        this.items[6] = new Item(type7);
        this.items[7] = new Item(type8);
        this.items[8] = new Item(type9);
        this.items[9] = new Item(type10);
        this.items[10] = new Item(type11);
        this.items[11] = new Item(type12);
        this.items[12] = new Item(type13);
        this.items[13] = new Item(type14);
        this.items[14] = new Item(type15);
        this.items[15] = new Item(type16);
        this.doors = new Door[2];
        this.doors[0] = new Door(type17);
        this.doors[1] = new Door(type18);
        this.pic = imagePath;
    }

    //rooms with 2 items and 1 door
    RoomType(ItemType type1, ItemType type2, DoorType type3, String imagePath) {
        this.items = new Item[2];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.doors = new Door[1];
        this.doors[0] = new Door(type3);
        this.pic = imagePath;
    }

    //rooms with 1 item (no doors)
    RoomType(ItemType type1, String imagePath) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[0];
        this.pic = imagePath;
    }

    //rooms with 1 item and 1 door
    RoomType(ItemType type1, DoorType type2, String imagePath) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[1];
        this.doors[0] = new Door(type2);
        this.pic = imagePath;
    }

    //rooms with 1 item and 4 doors
    RoomType(ItemType type1, DoorType type2, DoorType type3, DoorType type4, DoorType type5, String imagePath) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[4];
        this.doors[0] = new Door(type2);
        this.doors[1] = new Door(type3);
        this.doors[2] = new Door(type4);
        this.doors[3] = new Door(type5);
        this.pic = imagePath;
    }

    public Item[] getItems() {
        return items;
    }

    public Door[] getDoors() {
        return doors;
    }


    public String getPic (){
        return pic;
    }


}