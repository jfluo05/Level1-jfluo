import java.applet.AudioClip;

import javax.swing.JApplet;

public class SoundEffectsMachine {

	}private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
}
	}