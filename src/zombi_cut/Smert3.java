package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Smert3 {
	private double x;
    private double y;
    
    Image img = new ImageIcon("animations/anim_woodcutter_stand/Безымянный2.png").getImage();
    
public Smert3(){
	 x=1000;
	    y=30;
	 
}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}

}