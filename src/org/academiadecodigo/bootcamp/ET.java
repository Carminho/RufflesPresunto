package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ET {

    //PROPERTIES
    private Position pos;
    private Picture pic;
    private Direction currentDirection;


    //CONSTRUCTOR
    public ET(int col, int row) {
        pos = new Position(0, 0);
        pic = new Picture(pos.PADDING, pos.PADDING, "et.png");
        currentDirection = Direction.LEFT;
    }


    //METHODS
    public Position getPos() {
        return pos;
    }

    public void move(int col, int row) {
        pos.setRow(pos.getRow() + row);
        pos.setCol(pos.getCol() + col);
        pic.translate(col * pos.CELL_SIZE, row * pos.CELL_SIZE);

    }


    public void goLeft() {
        if (pos.getCol() > 0) {
            if (currentDirection == Direction.LEFT) {
                pos.moveDirection(Direction.LEFT);
                pic.translate(-(pos.CELL_SIZE), 0);
            } else {
                pos.moveDirection(Direction.LEFT);
                currentDirection = Direction.LEFT;
                pic.grow(60, 0);
                pic.translate(-(pos.CELL_SIZE), 0);
            }
        }
    }


    public void goRight() {
        if (pos.getCol() < pos.getMaxCol()) {
            if (currentDirection == Direction.RIGHT) {
                pos.moveDirection(Direction.RIGHT);
                pic.translate(pos.CELL_SIZE, 0);
            } else {
                pos.moveDirection(Direction.RIGHT);
                currentDirection = Direction.RIGHT;
                pic.grow(-60, 0);
                pic.translate(pos.CELL_SIZE, 0);
            }
        }
    }


    public void goUp() {
        if (pos.getRow() > 0) {
            pos.moveDirection(Direction.UP);
            pic.translate(0, -(pos.CELL_SIZE));
        }
    }

    public void goDown() {
        if (pos.getRow() < pos.getMaxRow()) {
            pos.moveDirection(Direction.DOWN);
            pic.translate(0, pos.CELL_SIZE);
        }
    }

    public void show() {
        pic.draw();
    }

}
