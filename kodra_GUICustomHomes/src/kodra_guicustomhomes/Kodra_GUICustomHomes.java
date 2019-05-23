package kodra_guicustomhomes;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author besian kodra
 */
public class Kodra_GUICustomHomes {

    public static void main(String[] args) {
        File lose = new File("Rolling.wav");

        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(lose));
            clip.start();
        } catch (Exception e) {
        }

        Controller orderManager = new Controller();

        orderManager.createCustomOrderForm();
    }
}