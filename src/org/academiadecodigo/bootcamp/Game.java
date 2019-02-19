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
        et = new ET(0, 0);
        // GIT IS DUMB
        et.show();
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
                currentRoom.interact();
            default:
                System.out.println("Something went wrong here.\n");
                break;
        }
    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
