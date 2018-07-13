package zombi_cut;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Smert {
	private double x;
    private double y;

    
    Image img = new ImageIcon("animations/anim_woodcutter_wakeup/Animation.gif").getImage();
    
public Smert(){
    x=300;
    y=80;

}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}
}