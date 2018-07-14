package zombi_cut;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.ImageIcon;


public class ControlMenue {
	ButtControl button_up = new ButtControl(550,10,100,37,"menu/ser.png","вверх",38);
	ButtControl button_d = new ButtControl(550,110,100,37,"menu/ser.png","вниз",40);
	ButtControl button_l = new ButtControl(550,210,100,37,"menu/ser.png","влево",37);
	ButtControl button_r = new ButtControl(550,310,100,37,"menu/ser.png","вправо",39);
	ButtControl button_k = new ButtControl(100,40,100,37,"menu/ser.png","назад",  8);
    
	public void draw(Graphics2D g) {
		button_up.draw(g);
		button_d.draw(g);
		button_l.draw(g);
		button_r.draw(g);
		button_k.draw(g);
	}

	public void moveContr(ButtControl b) {
		if (  Panel.mouseX>b.getX() && Panel.mouseX<b.getX()+b.getW()  &&
				Panel.mouseY>b.getY() && Panel.mouseY<b.getY()+b.getH()) {
			b.s="menu/ред.png";
				if(b.equals(button_up)){
					editContr(b);
				}
				if(b.equals(button_d)){
					editContr(b);
				}
				if(b.equals(button_l)){
					editContr(b);
				}
				if(b.equals(button_r)){
					editContr(b);
				}
				if(b.equals(button_k)){
					if(Menue.click) {
						
						Panel.buttmenue=false;
						Panel.controlmenue=false;
						Panel.settmenue=true;
						
					}
				}
		}
					else {b.s="menu/черная2.png";
					b.zamen =false;
					}
					
					}
	
		

public void editContr(ButtControl b) {
	if (Menue.click) {
		b.f="";
		b.zamen=true;
	}
}
	class  ButtControl{
		private double x;
		private double y;
		private double w;
		private double h;
		public Color color1;
		public String f;
		public int ch_code;
		public String s;
		public boolean zamen=false;
		
		public ButtControl(int x,int y, int w, int h,String s, String f,int ch_code) {
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
			this.f=f;
			this.s=s;
			this.ch_code=ch_code;
			color1 = Color.GREEN;
			this.zamen = zamen;
		}
		//gets
		public double getX() {return x;}
		public double getY() {return y;}
		public double getW() {return w;}
		public double getH() {return h;}
		
		public void draw(Graphics2D g) {
			g.drawImage(new ImageIcon(s).getImage(), (int) x, (int) y, null );
			g.setColor(color1);
			Font font = new Font ("Arial", Font.ITALIC, 40  );
			g.setFont(font);
			long length = (int) g.getFontMetrics().getStringBounds(f,  g).getWidth();
			 g.setColor(Color.green);
		        Font font1 = new Font("Arial", Font.ITALIC, 40);
		        g.setFont(font1);
			g.drawString(f, (int) (x+w/3) - (int) (length/10), (int) y + (int) (h/2)*2);
			g.drawString("движение вверх",750,40);
			g.drawString("движение вниз",750,140);
			g.drawString("движение влево",750,240);
			g.drawString("движение вправо",750,340);
			
		}
	
	}
}
