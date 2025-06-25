import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class BackgroundMusic {
    private static Clip clip;

    public static void play(String filepath) {
        try {
            URL url = BackgroundMusic.class.getClassLoader().getResource(filepath);
            if (url == null) throw new RuntimeException("Audio file not found: " + filepath);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);  // loop forever
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
}