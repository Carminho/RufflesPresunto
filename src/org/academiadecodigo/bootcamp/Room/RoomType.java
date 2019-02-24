package org.academiadecodigo.bootcamp.Room;

import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.Doors.DoorType;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;



public enum RoomType {

    DISSECTION_CELL(ItemType.DEAD_ET_BED1, ItemType.DEAD_ET_BED2, ItemType.DEAD_ET_BED3, ItemType.DRAWER1, ItemType.DRAWER2, ItemType.DRAWER3, ItemType.DRAWER4, ItemType.DESK1, ItemType.DESK2, ItemType.DESK3, ItemType.DESK4, DoorType.ONE_TWO, "dissection-room.jpeg"),
    SECURITY(ItemType.KEY, ItemType.SAFE1,ItemType.SAFE2, ItemType.CARPET1,ItemType.CARPET2, DoorType.TWO_ONE, DoorType.TWO_THREE, "security.jpeg"),
    LOBBY(ItemType.BUG,DoorType.THREE_TWO, DoorType.THREE_FOUR, DoorType.THREE_FIVE, DoorType.THREE_SIX, "lobby.jpeg"),
    MEETING_ROOM(ItemType.CEO1, ItemType.CEO2, ItemType.CEO3, ItemType.CEO4, ItemType.DEADBODY1, ItemType.DEADBODY2, DoorType.FOUR_THREE, "meeting_room.jpeg"),
    LAB(ItemType.COMPUTER1, ItemType.COMPUTER2, ItemType.COMPUTER3, ItemType.COMPUTER4, DoorType.FIVE_THREE, "lab.jpeg"),
    WAREHOUSE(ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.ELVIS, ItemType.BIKE, ItemType.TLP1, ItemType.TLP2, ItemType.TLP3, ItemType.TLP4, ItemType.TLP5, ItemType.TLP6, DoorType.SIX_THREE, "warehouse.jpeg"),
    EGGXIT(ItemType.ET_GAME_DISK, "eggxit.jpeg");


    //PROPERTIES
    private Item[] items;
    private Door[] doors;
    private String pic;



    //CONSTRUCTOR
    //rooms with 3 items and 1 door
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, ItemType type5, ItemType type6, ItemType type7, ItemType type8, ItemType type9, ItemType type10, ItemType type11, ItemType type12, ItemType type13, ItemType type14, ItemType type15, ItemType type16, DoorType type17, String imagePath) {
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
        this.doors = new Door[1];
        this.doors[0] = new Door(type17);
        this.pic = imagePath;
    }


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
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, ItemType type5, DoorType type6, DoorType type7, String imagePath) {
        this.items = new Item[5];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.items[3] = new Item(type4);
        this.items[4] = new Item(type5);
        this.doors = new Door[2];
        this.doors[0] = new Door(type6);
        this.doors[1] = new Door(type7);
        this.pic = imagePath;
    }

    //rooms with 6 items and 1 door
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, ItemType type5, ItemType type6, DoorType type7, String imagePath) {
        this.items = new Item[6];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.items[3] = new Item(type4);
        this.items[4] = new Item(type5);
        this.items[5] = new Item(type6);
        this.doors = new Door[1];
        this.doors[0] = new Door(type7);
        this.pic = imagePath;
    }

    //rooms with 1 item (no doors)
    RoomType(ItemType type1, String imagePath) {
        this.items = new Item[1];
        this.items[0] = new Item(type1);
        this.doors = new Door[0];
        this.pic = imagePath;
    }

    //rooms with 4 items and 1 door
    RoomType(ItemType type1, ItemType type2, ItemType type3, ItemType type4, DoorType type5, String imagePath) {
        this.items = new Item[4];
        this.items[0] = new Item(type1);
        this.items[1] = new Item(type2);
        this.items[2] = new Item(type3);
        this.items[3] = new Item(type4);
        this.doors = new Door[1];
        this.doors[0] = new Door(type5);
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