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
            moveInDirection(Direction.LEFT,-pos.CELL_SIZE,0,60,0);
        }
    }


    public void goRight() {
        if (pos.getCol() < pos.getMaxCol()) {
            moveInDirection(Direction.RIGHT,pos.CELL_SIZE,0,-60,0);
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


    private void moveInDirection (Direction direction, int translateCol, int translateRow, int growCol, int growRow){
        if (currentDirection == direction) {
            pos.moveDirection(direction);
            pic.translate(translateCol, translateRow);
        } else {
            pos.moveDirection(direction);
            currentDirection = direction;
            pic.grow(growCol, growRow);
            pic.translate(translateCol, translateRow);
        }
    }


    public void show() {
        pic.translate(pos.getCol() * Position.CELL_SIZE, pos.getRow() * Position.CELL_SIZE);
        pic.draw();
    }


    @Override
    public String toString() {
        return "ET{" +
                "pos=" + pos +
                ", pic=" + pic +
                ", currentDirection=" + currentDirection +
                '}';
    }
}
