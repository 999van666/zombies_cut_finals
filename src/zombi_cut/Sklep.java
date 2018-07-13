package zombi_cut;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Sklep {
		private double x;
	    private double y;

	    
	    Image img = new ImageIcon("animations/b_sklep_0/Безымянный.png").getImage();
	    
	public Sklep (){
	    x=800;
	    y=-50;

	}


	public void  draw (Graphics2D g){
	    g.drawImage(img,(int)x,(int)y, null);
	}
	}
