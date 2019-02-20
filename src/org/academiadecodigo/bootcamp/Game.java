package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler {


    //PROPERTIES
    private Room[] rooms;
    private Room currentRoom;
    private ET et;


    //CONSTRUCTOR
    public Game() {
        rooms = new Room[RoomType.values().length];
    }


    //METHODS
    public void start() {
        controlKeys();
        createRooms();
        currentRoom = new Room(RoomType.DISSECTION_CELL);

    }


    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    //este método é para alterar. Deve ser criada apenas a primeira room
    private Room[] createRooms() {
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(RoomType.values()[i]);
            System.out.println("A " + RoomType.values()[i] + " was created");
        }
        return rooms;
    }


    public void controlKeys() {
        Keyboard kb = new Keyboard(this);

        KeyboardEvent leftPressed = new KeyboardEvent();
        leftPressed.setKey(KeyboardEvent.KEY_LEFT);
        leftPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(leftPressed);

        KeyboardEvent rightPressed = new KeyboardEvent();
        rightPressed.setKey(KeyboardEvent.KEY_RIGHT);
        rightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(rightPressed);

        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(upPressed);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(downPressed);

        KeyboardEvent spacePressed = new KeyboardEvent();
        spacePressed.setKey(KeyboardEvent.KEY_SPACE);
        spacePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(spacePressed);

        KeyboardEvent zeroPressed = new KeyboardEvent();
        zeroPressed.setKey(KeyboardEvent.KEY_0);
        zeroPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(zeroPressed);

        KeyboardEvent onePressed = new KeyboardEvent();
        onePressed.setKey(KeyboardEvent.KEY_1);
        onePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(onePressed);

        KeyboardEvent twoPressed = new KeyboardEvent();
        twoPressed.setKey(KeyboardEvent.KEY_2);
        twoPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(twoPressed);

        KeyboardEvent threePressed = new KeyboardEvent();
        threePressed.setKey(KeyboardEvent.KEY_3);
        threePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(threePressed);

        KeyboardEvent fourPressed = new KeyboardEvent();
        fourPressed.setKey(KeyboardEvent.KEY_4);
        fourPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(fourPressed);

        KeyboardEvent fivePressed = new KeyboardEvent();
        fivePressed.setKey(KeyboardEvent.KEY_5);
        fivePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(fivePressed);

        KeyboardEvent sixPressed = new KeyboardEvent();
        sixPressed.setKey(KeyboardEvent.KEY_6);
        sixPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(sixPressed);

        KeyboardEvent sevenPressed = new KeyboardEvent();
        sevenPressed.setKey(KeyboardEvent.KEY_7);
        sevenPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(sevenPressed);

        KeyboardEvent eightPressed = new KeyboardEvent();
        eightPressed.setKey(KeyboardEvent.KEY_8);
        eightPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(eightPressed);

        KeyboardEvent ninePressed = new KeyboardEvent();
        ninePressed.setKey(KeyboardEvent.KEY_9);
        ninePressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kb.addEventListener(ninePressed);

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
