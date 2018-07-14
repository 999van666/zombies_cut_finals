package zombi_cut;


import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.swing.*;

import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class Window {

	public static AdvancedPlayer explay;
	public static String muss = "aud/aud.mp3";

		public static void main (String[] args) {
			JFrame f = new JFrame ("Java zombies_cut");
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setLocation(0,0);
			Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
	        f.setSize(screenSize);
	        f.setSize(1280,720);
			f.add(new Panel());
			f.setResizable(false);
			f.setLocationRelativeTo(null);
	        f.setVisible(true);
			try{
				InputStream potok = new FileInputStream(muss);
				AudioDevice auDev = new JavaSoundAudioDevice();
				explay = new AdvancedPlayer(potok,auDev);
				explay.play();
				explay.stop();

			}catch(Exception err){err.printStackTrace();}
		}
}
	       
