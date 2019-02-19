package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;

public class Item extends GameObject {

//PROPERTIES
    private ItemType type;



//CONSTRUCTOR
    public Item (ItemType type, int col, int row){
        super(col, row);
        this.type = type;
    }



//METHODS
    public ItemType getType(){
        return type;
    }


    @Override
    public String getMessage (GameObject type){
        if(type.getClass() == Item.class) {
            return ((Item)type).type.getMessage();
        }
        return "something went wrong! - Door";
    }

    /*@Override
    public abstract void showInteraction();*/

}
