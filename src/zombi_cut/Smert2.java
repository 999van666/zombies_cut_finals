package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Smert2 {
	private double x;
    private double y;

    
    Image img = new ImageIcon("animations/anim_woodcutter_stand/Безымянный.png").getImage();
    
public Smert2(){
	 x=700;
	    y=0;

}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}

}
