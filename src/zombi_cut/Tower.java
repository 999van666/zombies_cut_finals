package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Tower {

		
		private double x;
	    private double y;
	    
	    
	    Image img = new ImageIcon("animations/b_tower_0/Безымянный.png").getImage();
	    
	public Tower(){
		 x=1100;
		    y=400;
		   
	}


	public void  draw (Graphics2D g){
	    g.drawImage(img,(int)x,(int)y, null);
	}

	}