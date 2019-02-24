package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Teleporter {

    // PROPERTIES
    private final String RIGHT_CODE = "77539";
    private final String EGGXIT_CODE = "93577";
    private String userCode;
    private Position[] positions;
    private Text code;
    private boolean eggxitON;


    // CONSTRUCTOR
    public Teleporter() {
        userCode = "";
        code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
        positions = new Position[] {ItemType.TLP1.getPos(), ItemType.TLP2.getPos(), ItemType.TLP3.getPos(), ItemType.TLP4.getPos(), ItemType.TLP5.getPos(), ItemType.TLP6.getPos()};
    }

    // METHODS
    public void enterCode(String number) {
        userCode = userCode + number;
        code.delete();
        code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
        code.grow(40,40);
        code.draw();
    }

    public void verifyCode() {
        if (userCode.equals(RIGHT_CODE)) {                               // Win game
            Picture win = new Picture(Position.PADDING, Position.PADDING, "resources/win.png");
            win.draw();
        } else if (userCode.equals(EGGXIT_CODE)) {                       // Go to easter egg
            eggxitON = true;
            System.out.println("Go to easter egg");
        } else {                                                    // Wrong code, try again
            System.out.println("Wrong code, try again");
        }
    }

    public void deleteLastDigit() {
        if (userCode.length() > 0) {
            userCode = userCode.substring(0, userCode.length() - 1);
            code.delete();
            code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
            code.grow(40,40);
            code.draw();
        }
    }

    public Position[] getPositions() {
        return positions;
    }

    public String getUserCode() {
        return userCode;
    }

    public boolean isEggxitON (){
        return eggxitON;
    }
}
