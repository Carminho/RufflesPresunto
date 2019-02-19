package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
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
    public void showInteraction(GameObject type) {

        Rectangle r = new Rectangle(2 * 60,3 * 60, 6 *60, 4 * 60);
        r.fill();
        //Text t = new Text(type.getMessage());

    }

}


