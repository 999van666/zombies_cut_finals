package zombi_cut;

import java.io.*;
import javazoom.jl.player.advanced.*;
import javazoom.jl.player.*;
 
public class Mp3 {
    
public static AdvancedPlayer explay;
public static String muss = "aud/aud.mp3";
 
    public static void main(String[] args) {
 
   	try{
 InputStream potok = new FileInputStream(muss);
 AudioDevice auDev = new JavaSoundAudioDevice();
 explay = new AdvancedPlayer(potok,auDev);
 explay.play(); 
 
 }catch(Exception err){err.printStackTrace();}										
}
    }