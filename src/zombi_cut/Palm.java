package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Palm {
	private double x;
    private double y;
    
    Image img = new ImageIcon("animations/t_palm_03_0/t_palm_03_0.png").getImage();
    
public Palm(){
    x=200;
    y=-100;

}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}
}