package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.Room.Direction;
import org.academiadecodigo.bootcamp.Room.Room;
import org.academiadecodigo.bootcamp.Room.RoomType;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //InputStream in;


        Game game = new Game();
        game.start();

        /*try{

            in = new FileInputStream(new File( "resources/et_soundtrack.wav" ));
            AudioStream audio = new AudioStream(in);
            AudioPlayer.player.start(audio);

        } catch(Exception e){
            e.getMessage();
        }*/

    }

    // GIT IS DUMB

}
