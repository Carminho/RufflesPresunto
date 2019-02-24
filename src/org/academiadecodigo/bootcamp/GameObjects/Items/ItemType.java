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
    TV1(8, 0, "notes/tv.png"),
    TV2(9, 1, "notes/tv.png"),
    FURNITURE1(2, 9, "notes/tv.png"),
    FURNITURE2(3, 9, "notes/tv.png"),
    FURNITURE3(4, 9, "notes/tv.png"),
    SAFE1(7, 9, "notes/safe.png"),
    SAFE2(8, 9, "notes/safe.png"),
    CARPET1(4, 5, "notes/carpet.png"),
    CARPET2(5, 5, "notes/carpet.png"),
    BUG(0, 0, "bug.png"),
    CEO1(7, 4, "notes/CEO.png"),
    CEO2(7, 5, "notes/CEO.png"),
    CEO3(8, 4, "notes/CEO.png"),
    CEO4(8, 5, "notes/CEO.png"),
    DEADBODY1(4, 1, "notes/baloonText.png"),
    DEADBODY2(5, 1, "notes/baloonText.png"),
    COMPUTER1(0, 8, "notes/computer.png"),
    COMPUTER2(1, 8, "notes/computer.png"),
    COMPUTER3(0, 9, "notes/computer.png"),
    COMPUTER4(1, 9, "notes/computer.png"),
    ELVIS(7, 2, "notes/elvis.png"),
    BIKE(1, 1, "notes/bike.png"),
    TLP1(4, 4, "notes/access-code.png"),
    TLP2(4, 5, "notes/access-code.png"),
    TLP3(4, 6, "notes/access-code.png"),
    TLP4(5, 4, "notes/access-code.png"),
    TLP5(5, 5, "notes/access-code.png"),
    TLP6(5, 6, "notes/access-code.png"),
    ET_GAME_DISK(1, 2, "notes/etGameDisk.png");


    //PROPERTIES
    private Position pos;
    private String image;
    private boolean found;


    //CONSTRUCTOR
    ItemType(int col, int row, String imagePath) {
        pos = new Position(col, row);
        this.image = imagePath;
        found = false;
    }


    //METHODS
    public Position getPos() {
        return pos;
    }

    public String getImage() {
        return image;
    }

    public boolean isFound (){
        return found;
    }

    public void setFound (){
        found = true;
    }


    @Override
    public String toString() {
        return "ItemType{" +
                "found=" + found +
                '}';
    }
}