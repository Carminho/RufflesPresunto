package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;

public class Item extends GameObject {

    //PROPERTIES
    private ItemType type;


    //CONSTRUCTOR
    public Item(ItemType type) {
        super(type.getPos().getCol(), type.getPos().getRow());
        this.type = type;
    }


//METHODS
    @Override
    public String getImage(GameObject item) {
        if (item.getClass() == Item.class) {
            return ((Item) item).type.getImage();
        }
        return "something went wrong!";
    }

}


