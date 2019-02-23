package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;

public enum ItemType {

    DEAD_ET_BED1(3, 1, "notes/deadEtBed.png"),
    DEAD_ET_BED2(3, 2, "notes/deadEtBed.png"),
    DEAD_ET_BED3(3, 3, "notes/deadEtBed.png"),
    DESK1(0, 6, "notes/desk.png"),
    DESK2(0, 7, "notes/desk.png"),
    DESK3(1, 6, "notes/desk.png"),
    DESK4(1, 7, "notes/desk.png"),
    DRAWER1(7, 8, "notes/drawer.png"),
    DRAWER2(7, 9, "notes/drawer.png"),
    DRAWER3(8, 8, "notes/drawer.png"),
    DRAWER4(8, 9, "notes/drawer.png"),
    KEY(5, 2, "notes/key.png"),
    SAFE1(7, 9, "notes/safe.png"),
    SAFE2(8, 9, "notes/safe.png"),
    CARPET1(4, 5, "notes/carpet.png"),
    CARPET2(5, 5, "notes/carpet.png"),
    TABLE(1, 2, "notes/table.png"),
    CEO(1, 2, "notes/CEO.png"),
    DEADBODY(1, 2, "notes/deadBody.png"),
    COMPUTER(1, 2, "notes/computer.png"),
    ELVIS(1, 2, "notes/elvis.png"),
    BIKE(1, 2, "notes/bike.png"),
    TLP(1, 2, "notes/tlp.png"),
    ET_GAME_DISK(1, 2, "notes/etGameDisk.png");


    //PROPERTIES
    private Position pos;
    private String image;


    //CONSTRUCTOR
    ItemType(int col, int row, String imagePath) {
        pos = new Position(col, row);
        this.image = imagePath;
    }


    //METHODS
    public Position getPos() {
        return pos;
    }

    public String getImage() {
        return image;
    }
}