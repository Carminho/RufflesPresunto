package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;


public class Item extends GameObject {

    //PROPERTIES
    private ItemType type;


    //CONSTRUCTOR
    public Item(ItemType type) {
        super(type.getPos().getCol(), type.getPos().getRow());
        this.type = type;
    }


    //METHODS
    public ItemType getType() {
        return type;
    }


    @Override
    public String getMessage(GameObject type) {
        return null;
    }

    @Override
    public void showInteraction(GameObject type, boolean isShowing) {

        Rectangle r = new Rectangle(2 * getPos().CELL_SIZE,3 * getPos().CELL_SIZE, 6 *getPos().CELL_SIZE, 4 * getPos().CELL_SIZE);
        r.setColor(Color.WHITE);
        if (!isShowing) {
            r.fill();
            //Text t = new Text(type.getMessage());
        }else{
            r.delete();
        }
    }

}


