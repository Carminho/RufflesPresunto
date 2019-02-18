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
    public String getMessage (){
        return "";
    }

    /*@Override
    public void showInteraction (ItemType type){
        switch (type){
            case ONE_TWO: System.out.println("interact ONE_TWO");
            case TWO_ONE: System.out.println("interact TWO_ONE");
            case TWO_THREE: System.out.println("interact TWO_THREE");
            case THREE_TWO: System.out.println("interact THREE_TWO");
            case THREE_FOUR: System.out.println("interact THREE_FOUR");
            case FOUR_THREE: System.out.println("interact FOUR_THREE");
            case THREE_FIVE: System.out.println("interact THREE_FIVE");
            case FIVE_THREE: System.out.println("interact FIVE_THREE");
            case THREE_SIX: System.out.println("interact THREE_SIX");
            case SIX_THREE: System.out.println("interact SIX_THREE");
        }
    }*/

}
