package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ET {

    //PROPERTIES
    private Position pos;
    private Picture pic = new Picture((pos.getCol() * pos.getCELL_SIZE()) + 10,(pos.getRow() * pos.getCELL_SIZE()) + 10,"ET.png");


    //CONSTRUCTOR
    public ET(int col, int row) {
        pos = new Position(col, row);
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
        pos.moveDirection(Direction.LEFT);
        pic.translate(-(pos.getCELL_SIZE()), 0);
    }


    public void goRight() {
        pos.moveDirection(Direction.RIGHT);
        pic.translate(pos.getCELL_SIZE(), 0);
    }


    public void goUp() {
        pos.moveDirection(Direction.UP);
        pic.translate(0, -(pos.getCELL_SIZE()));
    }


    public void goDown() {
        pos.moveDirection(Direction.DOWN);
        pic.translate(0, pos.getCELL_SIZE());
    }

    public void show() {
        pic.draw();
    }

}
