package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;
import org.academiadecodigo.bootcamp.Room.Room;

public class Position {

    //Properties
    private int col;
    private int row;
    private final int MAX_COL = 5;
    private final int MAX_ROW = 5;
    private Room room;
    private final int CELL_SIZE = 40;


    //CONSTRUCTOR
    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }


    //METHODS
    public int getCol() {
        return col;
    }


    public int getRow() {
        return row;
    }


    public void setCol() {

    }


    public void setRow() {

    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public int getMaxCol() {
        return MAX_COL;
    }

    public int getMaxRow() {
        return MAX_ROW;
    }

    public void moveDirection(Direction direction) {
        switch (direction) {

            case UP:
                if (row > 0) {
                    row = row - 1;
                    break;
                }
            case DOWN:
                if (row < MAX_ROW) {
                    row = row + 1;
                    break;
                }
            case LEFT:
                if (col > 0) {
                    col = col - 1;
                    break;
                }
            case RIGHT:
                if (col < MAX_COL) {
                    col = col + 1;
                    break;
                }
        }
    }

    // Method to compare two positions for interaction.
    public boolean equals(Position pos) {
        return this.col == pos.getCol() && this.row == pos.getRow();
    }
}
