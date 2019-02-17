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
    @Override
    public String getMessage (){
        return "";
    }

}
