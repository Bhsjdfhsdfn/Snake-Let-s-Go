package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;

public class MusicDemo {
	public MusicDemo()
	{
		URL musicURL = null;
		try{
			File f=new File("music/3.wav");
			musicURL=f.toURL();
			musicURL=new URL("myMusic.wmv");
		}catch(Exception e){
			
		}
		AudioClip ac =Applet.newAudioClip(musicURL);
		//ac.play();
		ac.loop();
		//ac.stop;
	}
	}


