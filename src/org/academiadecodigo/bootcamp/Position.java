package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;

public class Position {

    public final int MAX_COL = 9;
    public final int MAX_ROW = 9;
    public static final int CELL_SIZE = 60;
    public static final int PADDING = 10;

    //PROPERTIES
    private int col;
    private int row;



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


    public void setCol(int col) {
        this.col = col;
    }


    public void setRow(int row) {
        this.row = row;
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


    @Override
    public String toString() {
        return "Position{" +
                "MAX_COL=" + MAX_COL +
                ", MAX_ROW=" + MAX_ROW +
                ", CELL_SIZE=" + CELL_SIZE +
                ", PADDING=" + PADDING +
                ", col=" + col +
                ", row=" + row +
                '}';
    }
}
