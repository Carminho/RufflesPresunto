package org.academiadecodigo.bootcamp.GameObjects.Doors;

import org.academiadecodigo.bootcamp.Position;

public enum DoorType {

    ONE_TWO(9, 5, "resources/security.jpeg", 0, 5),  //ok
    TWO_ONE(0, 5, "resources/dissection-room.jpeg",9 ,5),
    TWO_THREE(9, 5, "resources/lobby.jpeg",0 ,5),
    THREE_TWO(0, 5, "resources/security.jpeg",9 ,5),
    THREE_FOUR(9, 5, "resources/meeting_room.jpeg",0 ,5),
    FOUR_THREE(0, 5, "resources/lobby.jpeg",9 ,5),
    THREE_FIVE(5, 0, "resources/lab.jpeg",5 ,9),
    FIVE_THREE(5, 9, "resources/lobby.jpeg",5 ,0),
    THREE_SIX(4, 9, "resources/warehouse.jpeg",4 ,0),
    SIX_THREE(4, 0, "resources/lobby.jpeg",4 ,9);


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
