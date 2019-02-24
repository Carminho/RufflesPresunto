package org.academiadecodigo.bootcamp;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

/**
 * Created by codecadet on 24/02/2019.
 */
public class Sound extends JFrame{


    public  void sound() {

        try {
            URL soundURL = this.getClass().getClassLoader().getResource("et_soundtrack.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundURL);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }


}
