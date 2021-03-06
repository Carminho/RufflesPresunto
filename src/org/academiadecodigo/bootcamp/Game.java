package org.academiadecodigo.bootcamp;

import javafx.geometry.Pos;
import org.academiadecodigo.bootcamp.GameObjects.Doors.Door;
import org.academiadecodigo.bootcamp.GameObjects.Items.Item;
import org.academiadecodigo.bootcamp.GameObjects.Items.ItemType;
import org.academiadecodigo.bootcamp.GameObjects.Items.Teleporter;
import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.simplegraphics.graphics.Text;


public class Game implements KeyboardHandler {

    private final int INIT_ET_COL = 6;
    private final int INIT_ET_ROW = 2;

    //PROPERTIES
    private Room currentRoom;
    private Keyboard kb;
    private ET et;
    private Teleporter teleporter;
    private Picture options;
    private Rectangle box = new Rectangle(2.5 * Position.CELL_SIZE + Position.PADDING, 4 * Position.CELL_SIZE + Position.PADDING, 300, 120);
    private Text text = new Text(4 * Position.CELL_SIZE + Position.PADDING, 4.8 * Position.CELL_SIZE + Position.PADDING, "The safe is locked!");


    //METHODS
    public void start() {
        currentRoom = new Room(RoomType.START_MENU);
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
        addEvent(KeyboardEvent.KEY_S, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_O, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_O, KeyboardEventType.KEY_RELEASED);
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
                if (currentRoom.getType() != RoomType.START_MENU) {
                    et.goLeft();
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (currentRoom.getType() != RoomType.START_MENU) {
                    et.goRight();
                }
                break;
            case KeyboardEvent.KEY_UP:
                if (currentRoom.getType() != RoomType.START_MENU) {
                    et.goUp();
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                if (currentRoom.getType() != RoomType.START_MENU) {
                    et.goDown();
                }
                break;
            case KeyboardEvent.KEY_SPACE:
                if (currentRoom.getType() != RoomType.START_MENU) {
                    teleporter.deleteAll();
                    interact();
                    if (currentRoom.getType().equals(RoomType.EGGXIT) && et.getPos().getCol() == 5 && et.getPos().getRow() == 4) {
                        Picture free = new Picture(Position.PADDING, Position.PADDING, "credits.jpeg");
                        free.draw();
                        return;
                    }
                    if (teleporter.getWrongCode() != null) {
                        teleporter.getWrongCode().delete();
                    }
                }
                break;
            case KeyboardEvent.KEY_O:
                if (currentRoom.getType() == RoomType.START_MENU && !currentRoom.isShowing()) {
                    options = new Picture(Position.PADDING, Position.PADDING, "menu_options.png");
                    options.translate(Position.CELL_SIZE * 0.5, Position.CELL_SIZE * 0.5);
                    options.draw();
                    currentRoom.setIsShowing(true);
                }
                break;
            case KeyboardEvent.KEY_S:
                if (currentRoom.getType() == RoomType.START_MENU) {
                    currentRoom = new Room(RoomType.DISSECTION_CELL);
                    currentRoom.setPicture(new Picture(1.5 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, currentRoom.getItems()[12].getImage(currentRoom.getItems()[12])));
                    currentRoom.getPicture().draw();
                    currentRoom.setIsShowing(true);
                    et = new ET(INIT_ET_COL, INIT_ET_ROW);
                    et.show();
                }
                break;
            case KeyboardEvent.KEY_E:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    currentRoom.getPicture().delete();
                    if (teleporter.getWrongCode() != null) {
                        teleporter.getWrongCode().delete();
                    }
                    teleporter.verifyCode();

                }
                setEggxitRoom();
                break;
            case KeyboardEvent.KEY_D:
                if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter)) {
                    teleporter.deleteAll();
                }
                break;
            case KeyboardEvent.KEY_0:
                enterNumber("0", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_1:
                enterNumber("1", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_2:
                enterNumber("2", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_3:
                enterNumber("3", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_4:
                enterNumber("4", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_5:
                enterNumber("5", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_6:
                enterNumber("6", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_7:
                enterNumber("7", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_8:
                enterNumber("8", currentRoom.isShowing());
                break;
            case KeyboardEvent.KEY_9:
                enterNumber("9", currentRoom.isShowing());
                break;
            default:
                System.out.println("Something went wrong here.\n");
                break;
        }
    }


    public void enterNumber(String number, Boolean isShowing) {
        if (currentRoom.getType() == RoomType.WAREHOUSE && comparePosition(teleporter) && isShowing) {
            teleporter.enterCode(number, currentRoom.isShowing());
        }
    }


    public void interact() {
        for (int i = 0; i < currentRoom.getItems().length; i++) {

            if (currentRoom.isShowing() && currentRoom.getType() != RoomType.EGGXIT) {                                                          //if message is showing
                if (currentRoom.getPicture() == null) {
                    box.delete();
                    text.delete();
                    currentRoom.setIsShowing(false);
                } else {
                    currentRoom.getPicture().delete();
                    box.delete();
                    text.delete();
                    currentRoom.setIsShowing(false);
                }
                return;
            }
            if (et.getPos().equals(currentRoom.getItems()[i].getPos())) {                           //if message is not showing
                if (currentRoom.getItems()[i].getClass() == Door.class) {                           //if interacting with a door (change room and creates new ET in new position)
                    changeRoom(i);
                    return;
                }
                if (currentRoom.getItems()[i].getClass() == Item.class) {                           //if interacting with an item
                    if (((Item) currentRoom.getItems()[i]).getType().equals(ItemType.KEY)) {       //if item is a key.
                        ((Item) currentRoom.getItems()[i]).getType().setFound();                   //if we interact with key, set key as found.
                        showMessage(i);
                        return;
                    }
                    if ((((Item) currentRoom.getItems()[i]).getType().equals(ItemType.SAFE1) || ((Item) currentRoom.getItems()[i]).getType().equals(ItemType.SAFE2))      //if item is a safe
                            && !ItemType.KEY.isFound()) {
                        box.fill();
                        box.setColor(Color.WHITE);
                        text.draw();
                        currentRoom.setIsShowing(true);
                        return;
                    } else {
                        showMessage(i);                                                                                             //if any other item
                        return;
                    }
                }
            }
        }
    }


    private void setEggxitRoom() {
        if (teleporter.isEggxitON()) {
            currentRoom.setPicture(new Picture(Position.PADDING, Position.PADDING, RoomType.EGGXIT.getPic()));
            currentRoom.getPicture().draw();
            currentRoom = new Room(RoomType.EGGXIT);
            et = new ET(0, 0);
            et.show();
        }

    }

    private void showMessage(int i) {
        currentRoom.setPicture(new Picture(1.5 * Position.CELL_SIZE + Position.PADDING, 3 * Position.CELL_SIZE + Position.PADDING, currentRoom.getItems()[i].getImage(currentRoom.getItems()[i])));
        currentRoom.getPicture().draw();
        currentRoom.setIsShowing(true);
        return;
    }


    private void changeRoom(int i) {
        currentRoom.setPicture(new Picture(Position.PADDING, Position.PADDING, currentRoom.getItems()[i].getImage(currentRoom.getItems()[i])));
        currentRoom.getPicture().draw();
        et.getPic().delete();

        for (int j = 0; j < RoomType.values().length; j++) {
            if (RoomType.values()[j].getPic().equals(currentRoom.getItems()[i].getImage(currentRoom.getItems()[i]))) {
                et = new ET(((Door) currentRoom.getItems()[i]).getType().getEtCol(), ((Door) currentRoom.getItems()[i]).getType().getEtRow());
                currentRoom = new Room(RoomType.values()[j]);
                et.show();
                return;
            }
        }
    }


    private boolean comparePosition(Teleporter teleporter) {
        for (int i = 0; i < teleporter.getPositions().length; i++) {
            if (et.getPos().equals(teleporter.getPositions()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_O:
                if (currentRoom.getType() == RoomType.START_MENU && currentRoom.isShowing()) {
                    options.delete();
                    System.out.println("Is Showing: " + currentRoom.isShowing());
                    currentRoom.setIsShowing(false);
                    System.out.println("Releasing O");
                    System.out.println("Is Showing: " + currentRoom.isShowing());
                }
                break;
            default:
                System.out.println("Something went wrong with the key release");
        }
    }


    @Override
    public String toString() {
        return "Game{" +
                "currentRoom=" + currentRoom +
                '}';
    }
}
