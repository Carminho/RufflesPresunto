package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.GameObjects.GameObject;

public class Item extends GameObject {

//PROPERTIES
    private ItemType type;



//CONSTRUCTOR
    public Item (ItemType type){
        super(type.getPos().getCol(), type.getPos().getRow());
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
        return "something went wrong! - Item";
    }


    /*public void showInteraction (GameObject type){

        }
    */
}


