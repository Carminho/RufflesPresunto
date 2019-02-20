package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public enum ItemType {

    DEAD_ET_BED1(6,2,"Note: the code position is somewhere in those drawers."),   // alterar posição para (3,1,...)
    DEAD_ET_BED2(3,2,"Note: the code position is somewhere in those drawers."),
    DEAD_ET_BED3(3,3,"Note: the code position is somewhere in those drawers."),
    DESK1(0,6,"Code number: 7"),
    DESK2(0,7,"Code number: 7"),
    DESK3(1,6,"Code number: 7"),
    DESK4(1,7,"Code number: 7"),
    DRAWER1(7,8,"The code is at 1st position."),
    DRAWER2(7,9,"The code is at 1st position."),
    DRAWER3(8,8,"The code is at 1st position."),
    DRAWER4(8,9,"The code is at 1st position."),
    KEY(1,2,"Hmm... where can I use this key?"),
    SAFE(1,2,"Great. I have de code number, but in which position? Hmmm..."),
    CARPET(1,2,"Code number: 4"),
    TABLE(1,2,"Button opens the door."),
    CEO(1,2,"Code number: 5"),
    DEADBODY(1,2,"You will never find out the code number in 3th position. Only the CEO knew that."),
    COMPUTER(1,2,"The scientist usually uses the number of objects in this room to represent the code number on 4th position."),
    ELVIS(1,2,"Unknown"),
    BIKE(1,2,"bed.png"),
    TLP(1,2,"REBMUN EDOC EHT RETNE"),
    ET_GAME_DISK(1,2,"Finally I'm going to get out of this hole in Alamogordo.");



//PROPERTIES
    private Position pos;
    private String message;



//CONSTRUCTOR
    ItemType (int col, int row, String message){
        pos = new Position(col,row);
        this.message=message;
    }


    public Position getPos() {
        return pos;
    }


    public String getMessage (){
        return message;
    }


}
