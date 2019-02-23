package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.Teleporter;
import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game implements KeyboardHandler {

    private final int INIT_ET_COL = 6;
    private final int INIT_ET_ROW = 2;

    //PROPERTIES
    private Room currentRoom;
    private Keyboard kb;
    private ET et;
    private Teleporter teleporter;


    //METHODS
    public void start() {
        currentRoom = new Room(RoomType.DISSECTION_CELL);
        et = new ET(INIT_ET_COL, INIT_ET_ROW);
        et.show();
        teleporter = new Teleporter();
        createControlKeys();
    }


    public void createControlKeys() {
        kb = new Keyboard(this);

        addEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_E, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_D, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_0, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_1, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_2, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_3, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_4, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_5, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_6, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_7, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_8, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_9, KeyboardEventType.KEY_PRESSED);
    }


    public void addEvent(int key, KeyboardEventType type) {
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(key);
        event.setKeyboardEventType(type);
        kb.addEventListener(event);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                et.goLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                et.goRight();
                break;
            case KeyboardEvent.KEY_UP:
                et.goUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                et.goDown();
                break;
            case KeyboardEvent.KEY_SPACE:
                interact();
                break;
            case KeyboardEvent.KEY_E:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.verifyCode();
                }
                break;
                case KeyboardEvent.KEY_D:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.deleteLastDigit();
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_0:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("0");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_1:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("1");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_2:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("2");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_3:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("3");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_4:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("4");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_5:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("5");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_6:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("6");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_7:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("7");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_8:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("8");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            case KeyboardEvent.KEY_9:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.enterCode("9");
                    System.out.println(teleporter.getUserCode());
                }
                break;
            default:
                System.out.println("Something went wrong here.\n");
                break;
        }
    }


    public void interact() {
        for (int i = 0; i < currentRoom.getItems().length; i++) {

            if (currentRoom.isShowing()) {
                currentRoom.getPicture().delete();
                currentRoom.setIsShowing(false);
                return;
            }

            if (et.getPos().equals(currentRoom.getItems()[i].getPos())) {

                if (currentRoom.getItems()[i].getClass() == Door.class) {
                    currentRoom.setPicture(new Picture(Position.PADDING, Position.PADDING, currentRoom.getItems()[i].getImage(currentRoom.getItems()[i])));
                    currentRoom.getPicture().draw();
                    et.getPic().delete();
                    System.out.println("teste1");

                    for (int j = 0; j < RoomType.values().length; j++) {
                        if (RoomType.values()[j].getPic().equals(currentRoom.getItems()[i].getImage(currentRoom.getItems()[i]))) {                               //se nome da imagem de Door é = ao nome da imagem de RoomType
                            et = new ET(((Door) currentRoom.getItems()[i]).getType().getEtCol(), ((Door) currentRoom.getItems()[i]).getType().getEtRow());
                            currentRoom = new Room(RoomType.values()[j]);
                            System.out.println("teste2");
                            et.show();
                            return;
                        }
                    }
                    return;
                }

                if (currentRoom.getItems()[i].getClass() == Item.class) {
                    currentRoom.setPicture(new Picture(2 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, currentRoom.getItems()[i].getImage(currentRoom.getItems()[i])));
                    currentRoom.getPicture().draw();
                    currentRoom.setIsShowing(true);
                    return;
                }
            }
        }
    }

    public boolean comparePosition(Teleporter teleporter) {
        for (int i = 0; i < teleporter.getPositions().length; i++) {
            if (et.getPos().equals(teleporter.getPositions()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


    @Override
    public String toString() {
        return "Game{" +
                "currentRoom=" + currentRoom +
                '}';
    }
}
