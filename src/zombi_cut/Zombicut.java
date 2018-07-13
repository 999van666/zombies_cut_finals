package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Zombicut {
	
	private double x;
    private double y;
    
    
    Image img = new ImageIcon("animations/anim_woodcutter_woodcut/Animation.gif").getImage();
    
public Zombicut(){
	 x=620;
	    y=400;
	   
}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}

}

