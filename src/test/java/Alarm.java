import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Alarm {
    public static void Play() {
        try {
            File ses = new File(".\\sesler\\alarm.wav");
            AudioInputStream stream = AudioSystem.getAudioInputStream(ses);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            stream.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
