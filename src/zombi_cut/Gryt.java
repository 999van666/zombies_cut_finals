package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Gryt {
	private double x;
    private double y;

    
    Image img = new ImageIcon("animations/d_tropic_palm_01_0/d_tropic_palm_01_0.png").getImage();
    
public Gryt(){
    x=500;
    y=100;

}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}
}