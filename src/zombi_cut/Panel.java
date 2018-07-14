package zombi_cut;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Panel extends JPanel implements ActionListener {
    //размеры панели

	public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	//координаты мыши
	public static int mouseX;
	public static int mouseY;

	//активные страницы меню
	public static boolean buttmenue =true;
	public static boolean settmenue =false;
	public static boolean controlmenue=false;
	
	public static ControlMenue c_menue;
    public static boolean easy=true;
    public static boolean norm=false;
    public static boolean hard=false;
    public static boolean explay=true;
    public static boolean control=true;


	public static enum STATES{MENUE,PLAY}//обЪявляем перечесление
	public static STATES state = STATES.MENUE;//изначальная работа с вкл. меню


	private BufferedImage image;
	private Graphics2D g;

	private ArrayList<SettMenue> buttons;

	Timer mainTimer = new Timer (30, this);
	Back back = new Back();
	Player player=new Player();
	Gryt gryt=new Gryt();
	Menue menue = new Menue();
	Smert smert=new Smert();
	Palm palm= new Palm();
	Sklep sklep=new Sklep();
	Smert2 smert2=new Smert2();
	Smert3 smert3=new Smert3();
	Zombicut zombicut=new Zombicut();
	Oak oak = new Oak();
	Tower tower=new Tower();

		 public Panel() {
			 super();
			 setFocusable(true);
			 requestFocus();
			 mainTimer.start();

             c_menue = new ControlMenue();
			 image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
			 g = (Graphics2D) image.getGraphics();

			 buttons = new ArrayList<SettMenue>();
			 buttons.add(new SettMenue(300,45,100,37,"","легко"));
			 buttons.add(new SettMenue(570,45,100,37,"","средне"));
			 buttons.add(new SettMenue(840,45,100,37,"","Невыносимо"));

			 buttons.add(new SettMenue(300,190,100,37,"","вкл"));
			 buttons.add(new SettMenue(600,190,100,37,"","выкл"));

			 buttons.add(new SettMenue(300,345,100,37,"","стандарт"));
			 buttons.add(new SettMenue(600,345,100,37,"","пользоват"));

			 buttons.add(new SettMenue(970,570,100,37,"","назад"));



			 addMouseListener(new Listeners());
			 addKeyListener(new Listeners());
			 addMouseMotionListener(new Listeners());

		 }
		 public void actionPerformed(ActionEvent e) {
			 if (state.equals(STATES.MENUE)) {
                 back.draw(g);
                 if (buttmenue) {
                     menue.draw(g);
                     menue.moveButt(menue.button1);
                     menue.moveButt(menue.button2);
                     menue.moveButt(menue.button3);
                 }

				 if(settmenue){
                 moveSettButt();
				 }
                 if(controlmenue) {
                	 c_menue.draw(g);
                	 c_menue.moveContr(c_menue.button_up);
                	 c_menue.moveContr(c_menue.button_d);
                	 c_menue.moveContr(c_menue.button_l);
                	 c_menue.moveContr(c_menue.button_r);
                	 c_menue.moveContr(c_menue.button_k);
                 }
                 gameDraw();
			 }

		     if (state.equals(STATES.PLAY)) {
		    	 gameUpdate();
		    	 gameRender();
		    	 gameDraw();
		    
		     }
		 }

	private void moveSettButt() {
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).draw(g);
			if (Panel.mouseX > buttons.get(i).getX() && Panel.mouseX < buttons.get(i).getX() + buttons.get(i).getW() &&
					Panel.mouseY > buttons.get(i).getY() && Panel.mouseY < buttons.get(i).getY() + buttons.get(i).getH()) {
			buttons.get(i).s="c";
			if(i==0){
			    if(Menue.click){
			        easy=true;
			        norm=false;
			        hard=false;
                }
            }
                if(i==1){
                    if(Menue.click){
                        easy=false;
                        norm=true;
                        hard=false;
                    }
                }
                if(i==2){
                    if(Menue.click){
                        easy=false;
                        norm=false;
                        hard=true;
                    }
                }
                if(i==3){
                    if(Menue.click){

						explay=true;

                    }
                }
                if(i==4){
                    if(Menue.click){
						explay=false;


                    }
                }
                if(i==5){
                    if(Menue.click){
                        control=true;
                      c_menue.button_up.f="вверх";
                      c_menue.button_d.f="вниз";
                      c_menue.button_l.f="влево";
                      c_menue.button_r.f="вправо";

						c_menue.button_up.ch_code=38;
						c_menue.button_d.ch_code=40;
						c_menue.button_l.ch_code=37;
						c_menue.button_r.ch_code=32;
                    }
                }
                if(i==6){
                    if(Menue.click){
                    	control=false;
                    	settmenue=false;
                    	controlmenue=true;
                    } }
                if(i==7){
                    if(Menue.click){
                        settmenue=false;
                        buttmenue=true;
                    } }
			}
			else{
				buttons.get(i).s="menu/елоу1.png";
			}

		}
	}
		private void gameRender() {
			 back.draw(g);
			 player.draw(g);
			 gryt.draw(g);
			 smert.draw(g);
			 smert2.draw(g);
			 smert3.draw(g);
			 palm.draw(g);
			 sklep.draw(g);
			 zombicut.draw(g);
			 oak.draw(g);
			 tower.draw(g);
			 
		}
	
		private void gameUpdate() {
			player.update();
			
		
			
			
		}
		private void gameDraw() {
			
			Graphics g2 = this.getGraphics();
			 g2.drawImage(image, 0, 0, null);
			 g2.dispose();
		}
}

