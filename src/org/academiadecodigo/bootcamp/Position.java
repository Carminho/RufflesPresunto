package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;
import org.academiadecodigo.bootcamp.Room.Room;

public class Position {

    private final int MAX_COL = 9;
    private final int MAX_ROW = 9;
    private final int CELL_SIZE = 60;
    private final int PADDING = 10;

    //Properties
    private int col;
    private int row;
    private Room room;



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

    public int getPADDING() {
        return PADDING;
    }

    public void setCol(int col) {
        this.col = col;
    }


    public void setRow(int row) {
        this.row = row;
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
                if (row >= 0) {
                    row = row - 1;
                    break;
                }
            case DOWN:
                if (row < MAX_ROW - 1) {
                    row = row + 1;
                    break;
                }
            case LEFT:
                if (col >= 0) {
                    col = col - 1;
                    break;
                }
            case RIGHT:
                if (col < MAX_COL - 1) {
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
