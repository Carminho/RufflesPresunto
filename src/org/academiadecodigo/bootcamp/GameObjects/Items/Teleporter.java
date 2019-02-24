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
    //private Text code;
    private Picture[] codeAna;
    private boolean eggxitON;


    // CONSTRUCTOR
    public Teleporter() {
        userCode = "";
        codeAna = new Picture[5];
        //code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
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

        /*code.delete();
        code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
        code.grow(40, 40);
        code.draw();*/

        }


        private void usercodePosition ( int number, double col){
            switch (userCode.charAt(number)) {
                case '0':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/0.png");
                    codeAna[number].draw();
                    break;
                case '1':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/1.png");
                    codeAna[number].draw();
                    break;
                case '2':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/2.png");
                    codeAna[number].draw();
                    break;
                case '3':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/3.png");
                    codeAna[number].draw();
                    break;
                case '4':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/4.png");
                    codeAna[number].draw();
                    break;
                case '5':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/5.png");
                    codeAna[number].draw();
                    break;
                case '6':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/6.png");
                    codeAna[number].draw();
                    break;
                case '7':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/7.png");
                    codeAna[number].draw();
                    break;
                case '8':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/8.png");
                    codeAna[number].draw();
                    break;
                case '9':
                    codeAna[number] = new Picture(col * Position.CELL_SIZE, 4.9 * Position.CELL_SIZE, "resources/numbers/9.png");
                    codeAna[number].draw();
                    break;
                default:
                    System.out.println("You must insert a number!");
            }
        }


        public void verifyCode () {
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


        public void deleteAll () {
            userCode = "";
            int j = 0;
            for (Picture pic : codeAna) {
                if (pic != null) {
                    codeAna[j].delete();
                    j++;
                }
            }
        }

        /*public void deleteLastDigit () {
            if (userCode.length() > 0) {
                userCode = userCode.substring(0, userCode.length() - 1);
                code.delete();
                code = new Text(5 * Position.CELL_SIZE, 4 * Position.CELL_SIZE, userCode);
                code.grow(40, 40);
                code.draw();
            }
        }*/


        public Position[] getPositions () {
            return positions;
        }

        public String getUserCode () {
            return userCode;
        }

        public boolean isEggxitON () {
            return eggxitON;
        }
    }
