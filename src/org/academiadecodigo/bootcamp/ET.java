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
        pos = new Position(col, row);
        pic = new Picture(pos.getCELL_SIZE() + pos.getPADDING(), pos.getCELL_SIZE() + pos.getPADDING(), "et.png");
        currentDirection = Direction.LEFT;
    }


    //METHODS
    public Position getPos() {
        return pos;
    }


    public void setPosition(int col, int row) {
        pos.setCol(col);
        pos.setRow(row);
    }


    public void goLeft() {
        if (pos.getCol() >= 0) {
            if (currentDirection == Direction.LEFT) {
                pos.moveDirection(Direction.LEFT);
                pic.translate(-(pos.getCELL_SIZE()), 0);
            } else {
                pos.moveDirection(Direction.LEFT);
                currentDirection = Direction.LEFT;
                pic.grow(60, 0);
                pic.translate(-(pos.getCELL_SIZE()), 0);
            }
        }
    }


    public void goRight() {
        if (pos.getCol() < pos.getMaxCol() - 1) {
            if (currentDirection == Direction.RIGHT) {
                pos.moveDirection(Direction.RIGHT);
                pic.translate(pos.getCELL_SIZE(), 0);
            } else {
                pos.moveDirection(Direction.RIGHT);
                currentDirection = Direction.RIGHT;
                pic.grow(-60, 0);
                pic.translate(pos.getCELL_SIZE(), 0);
            }
        }
    }


    public void goUp() {
        if (pos.getRow() >= 0) {
            pos.moveDirection(Direction.UP);
            pic.translate(0, -(pos.getCELL_SIZE()));
        }
    }

    public void goDown() {
        if (pos.getRow() < pos.getMaxRow() - 1) {
            pos.moveDirection(Direction.DOWN);
            pic.translate(0, pos.getCELL_SIZE());
        }
    }

    public void show() {
        pic.draw();
    }

}
