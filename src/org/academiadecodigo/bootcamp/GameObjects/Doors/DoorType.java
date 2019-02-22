package org.academiadecodigo.bootcamp.GameObjects.Doors;

import org.academiadecodigo.bootcamp.Position;

public enum DoorType {

    ONE_TWO(9, 5, "resources/security.jpeg", 0, 5 ),
    TWO_ONE(1, 1, "Entering Dissection Cell...",9 ,5 ),
    TWO_THREE(1, 1, "Entering Lobby...",0 ,0 ),
    THREE_TWO(1, 1, "Entering Security Room...",0 ,0 ),
    THREE_FOUR(1, 1, "Entering Meeting Room...",0 ,0 ),
    FOUR_THREE(1, 1, "Entering Lobby...",0 ,0 ),
    THREE_FIVE(1, 1, "Entering Lab...",0 ,0 ),
    FIVE_THREE(1, 1, "Entering Lobby...",0 ,0),
    THREE_SIX(1, 1, "Entering Warehouse...",0 ,0 ),
    SIX_THREE(1, 1, "Entering Lobby...",0 ,0 );


    //PROPERTIES
    private Position pos;
    private String image;
    private int etCol;
    private int etRow;


    //CONSTRUCTOR
    DoorType(int col, int row, String imagePath, int etCol, int etRow) {
        pos = new Position(col, row);
        this.etCol = etCol;
        this.etRow = etRow;
        this.image = imagePath;
    }


    public Position getPos() {
        return pos;
    }


    public String getImage() {
        return image;
    }

    public int getEtCol() {
        return etCol;
    }

    public int getEtRow() {
        return etRow;
    }
}
