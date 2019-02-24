package org.academiadecodigo.bootcamp.GameObjects.Items;

import org.academiadecodigo.bootcamp.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Teleporter {

    // PROPERTIES
    private final String RIGHT_CODE = "77539";
    private final String EGGXIT_CODE = "93577";
    private String userCode;
    private Position[] positions;
    private Picture[] code;
    private boolean eggxitON;


    // CONSTRUCTOR
    public Teleporter() {
        userCode = "";
        code = new Picture[5];
        positions = new Position[]{ItemType.TLP1.getPos(), ItemType.TLP2.getPos(), ItemType.TLP3.getPos(), ItemType.TLP4.getPos(), ItemType.TLP5.getPos(), ItemType.TLP6.getPos()};
    }

    // METHODS
    public void enterCode(String number) {
        if (userCode.length() < 5) {
            userCode = userCode + number;

            if (userCode.length() == 1) {
                usercodePosition(0, 2);
            }
            if (userCode.length() == 2) {
                usercodePosition(1, 3.4);
            }
            if (userCode.length() == 3) {
                usercodePosition(2, 4.75);
            }
            if (userCode.length() == 4) {
                usercodePosition(3, 6.2);
            }
            if (userCode.length() == 5) {
                usercodePosition(4, 7.5);
            }
        }

    }


    private void usercodePosition(int number, double col) {
        switch (userCode.charAt(number)) {
            case '0':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/0.png");
                code[number].draw();
                break;
            case '1':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/1.png");
                code[number].draw();
                break;
            case '2':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/2.png");
                code[number].draw();
                break;
            case '3':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/3.png");
                code[number].draw();
                break;
            case '4':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/4.png");
                code[number].draw();
                break;
            case '5':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/5.png");
                code[number].draw();
                break;
            case '6':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/6.png");
                code[number].draw();
                break;
            case '7':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/7.png");
                code[number].draw();
                break;
            case '8':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/8.png");
                code[number].draw();
                break;
            case '9':
                code[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/9.png");
                code[number].draw();
                break;
            default:
                System.out.println("You must insert a number!");
        }
    }


    public void verifyCode() {
        if (userCode.equals(RIGHT_CODE)) {                               // Win game
            Picture win = new Picture(Position.PADDING, Position.PADDING, "resources/win.png");
            win.draw();
        } else if (userCode.equals(EGGXIT_CODE)) {                       // Go to easter egg
            eggxitON = true;
        } else {                                                        // Wrong code, try again
            Picture wrong = new Picture(1.5 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING,"resources/notes/access-code-wrong.png");
            wrong.draw();
            deleteAll();
        }
    }


    public void deleteAll() {
        userCode = "";
        int j = 0;
        for (Picture pic : code) {
            if (pic != null) {
                code[j].delete();
                j++;
            }
        }
    }


    public Position[] getPositions() {
        return positions;
    }

    public String getUserCode() {
        return userCode;
    }

    public boolean isEggxitON() {
        return eggxitON;
    }
}
