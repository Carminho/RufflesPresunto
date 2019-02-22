package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;

public enum ItemType {

    DEAD_ET_BED1(3, 1, "caio.png"),
    DEAD_ET_BED2(3, 2, "Doctor Note: \n Remember to burn the paper with the teleporter code, or at least take it out of my desk."),
    DEAD_ET_BED3(3, 3, "Doctor Note: \n Remember to burn the paper with the teleporter code, or at least take it out of my desk."),
    DESK1(0, 6, "Doctor note: \n Code number: 7 \n Burn after memorizing, same with the paper with the position of this digit on the code."),
    DESK2(0, 7, "Doctor note: \n Code number: 7 \n Burn after memorizing, same with the paper with the position of this digit on the code."),
    DESK3(1, 6, "Doctor note: \n Code number: 7 \n Burn after memorizing, same with the paper with the position of this digit on the code."),
    DESK4(1, 7, "Doctor note: \n Code number: 7 \n Burn after memorizing, same with the paper with the position of this digit on the code."),
    DRAWER1(7, 8, "Doctor note: \n As i'm the most important person on the base, I got the 1st digit of the code!"),
    DRAWER2(7, 9, "Doctor note: \n As i'm the most important person on the base, I got the 1st digit of the code!"),
    DRAWER3(8, 8, "Doctor note: \n As i'm the most important person on the base, I got the 1st digit of the code!"),
    DRAWER4(8, 9, "Doctor note: \n As i'm the most important person on the base, I got the 1st digit of the code!"),
    KEY(1, 2, "Hmm... where can I use this key?"),
    SAFE(1, 2, "Boss Note: \n Security will keep the 3rd position of the code."),
    CARPET(1, 2, "Code number: 5"),
    TABLE(1, 2, "There's a button here! It seems that it opens the locked door!"),
    CEO(1, 2, "Don't forget your code number is 3, pumpkin <3 \n Love, Mommy."),
    DEADBODY(1, 2, "You will never find out the 4th position of the code! \n Only the CEO knew that and they are all dead!"),
    COMPUTER(1, 2, "The scientist usually uses the number of objects in this room to represent the code number on the 2nd position."),
    ELVIS(1, 2, "Strange, Elvis didn't have this tattoo with 9 stars when he was alive... \n That is, if it's really dead this time."),
    BIKE(1, 2, "REBMUN EDOC EHT RETNE"),
    TLP(1, 2, "ENTER THE CODE NUMBER IN THE RIGHT ORDER"),
    ET_GAME_DISK(1, 2, "I can't believe I'm back in this hole in Alamogordo!!!");


    //PROPERTIES

    private Position pos;
    private String image;


    //CONSTRUCTOR
    ItemType(int col, int row, String imagePath) {
        pos = new Position(col, row);
        this.image = imagePath;
    }


    public Position getPos() {
        return pos;
    }


    public String getImage() {
        return image;
    }


}
