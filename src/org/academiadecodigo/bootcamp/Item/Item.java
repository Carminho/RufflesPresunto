package org.academiadecodigo.bootcamp.Item;

import org.academiadecodigo.bootcamp.Position;

public class Item extends ItemAbstract {

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
    public String getMessage (){
        return "";
    }

    @Override
    public abstract void showInteraction();

}
