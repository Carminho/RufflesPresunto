package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;

public enum ItemType {

    DEAD_ET_BED1(3, 1, "resources/notes/deadEtBed.png"),
    DEAD_ET_BED2(3, 2, "resources/notes/deadEtBed.png"),
    DEAD_ET_BED3(3, 3, "resources/notes/deadEtBed.png"),
    DESK1(0, 6, "resources/notes/desk.png"),
    DESK2(0, 7, "resources/notes/desk.png"),
    DESK3(1, 6, "resources/notes/desk.png"),
    DESK4(1, 7, "resources/notes/desk.png"),
    DRAWER1(7, 8, "resources/notes/drawer.png"),
    DRAWER2(7, 9, "resources/notes/drawer.png"),
    DRAWER3(8, 8, "resources/notes/drawer.png"),
    DRAWER4(8, 9, "resources/notes/drawer.png"),
    KEY(5, 2, "resources/notes/key.png"),
    SAFE1(7, 9, "resources/notes/safe.png"),
    SAFE2(8, 9, "resources/notes/safe.png"),
    CARPET1(4, 5, "resources/notes/carpet.png"),
    CARPET2(5, 5, "resources/notes/carpet.png"),
    BUG(0, 0, "resources/bug.png"),
    CEO1(7, 4, "resources/notes/CEO.png"),
    CEO2(7, 5, "resources/notes/CEO.png"),
    CEO3(8, 4, "resources/notes/CEO.png"),
    CEO4(8, 5, "resources/notes/CEO.png"),
    DEADBODY1(4, 1, "resources/notes/deadBody.png"),
    DEADBODY2(5, 1, "resources/notes/deadBody.png"),
    COMPUTER1(0, 8, "resources/notes/computer.png"),
    COMPUTER2(1, 8, "resources/notes/computer.png"),
    COMPUTER3(0, 9, "resources/notes/computer.png"),
    COMPUTER4(1, 9, "resources/notes/computer.png"),
    ELVIS(7, 2, "resources/notes/elvis.png"),
    BIKE(1, 1, "resources/notes/bike.png"),
    TLP1(4, 4, "resources/notes/tlp.png"),
    TLP2(4, 5, "resources/notes/tlp.png"),
    TLP3(4, 6, "resources/notes/tlp.png"),
    TLP4(5, 4, "resources/notes/tlp.png"),
    TLP5(5, 5, "resources/notes/tlp.png"),
    TLP6(5, 6, "resources/notes/tlp.png"),
    ET_GAME_DISK(1, 2, "resources/notes/etGameDisk.png");


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