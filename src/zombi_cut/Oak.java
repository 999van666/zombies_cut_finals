package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Oak {
	
	private double x;
    private double y;
    
    
    Image img = new ImageIcon("animations/t_oak3_0/t_oak3_0.png").getImage();
    
public Oak(){
	 x=900;
	    y=200;
	   
}


public void  draw (Graphics2D g){
    g.drawImage(img,(int)x,(int)y, null);
}

}