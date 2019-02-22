package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {


    //PROPERTIES
    private Room currentRoom;
    private Keyboard kb;



    //METHODS
    public void start() {
        currentRoom = new Room(RoomType.DISSECTION_CELL);
        createControlKeys();
    }


    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }





    public void createControlKeys() {
        kb = new Keyboard(this);

        addEvent(KeyboardEvent.KEY_LEFT, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_RIGHT, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_UP, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_DOWN, KeyboardEventType.KEY_PRESSED);
        addEvent(KeyboardEvent.KEY_SPACE, KeyboardEventType.KEY_PRESSED);
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
                currentRoom.getEt().goLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                currentRoom.getEt().goRight();
                break;
            case KeyboardEvent.KEY_UP:
                currentRoom.getEt().goUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                currentRoom.getEt().goDown();
                break;
            case KeyboardEvent.KEY_SPACE:
                currentRoom.interact();
                System.out.println("Space");
                break;
            case KeyboardEvent.KEY_0:
                break;
            case KeyboardEvent.KEY_1:
                break;
            case KeyboardEvent.KEY_2:
                break;
            case KeyboardEvent.KEY_3:
                break;
            case KeyboardEvent.KEY_4:
                break;
            case KeyboardEvent.KEY_5:
                break;
            case KeyboardEvent.KEY_6:
                break;
            case KeyboardEvent.KEY_7:
                break;
            case KeyboardEvent.KEY_8:
                break;
            case KeyboardEvent.KEY_9:
                break;
            default:
                System.out.println("Something went wrong here.\n");
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
