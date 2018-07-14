package zombi_cut;

import java.awt.event.*;


public class Listeners implements MouseListener, KeyListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
        
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == MouseEvent.BUTTON1){
			if (Panel.state==Panel.STATES.MENUE){
				Menue.click=true;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == MouseEvent.BUTTON1){
			if (Panel.state==Panel.STATES.MENUE){
				Menue.click=false;
			}
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Panel.mouseX=e.getX();
		Panel.mouseY=e.getY();
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		int key=e.getKeyCode();

			if(key==Panel.c_menue.button_up.ch_code){
				Player.up=true;
		}
		if(key==Panel.c_menue.button_d.ch_code){
			Player.down=true;
		}
		if(key==Panel.c_menue.button_l.ch_code){
			Player.left=true;
		}
		if(key==Panel.c_menue.button_r.ch_code){
			Player.right=true;
		}
		if(key==KeyEvent.VK_ESCAPE){
			if(Panel.state==Panel.STATES.PLAY) Panel.state = Panel.STATES.MENUE;
		}
		if(Panel.c_menue.button_up.zamen){
				Panel.c_menue.button_up.ch_code=e.getKeyCode();
		}
		if(Panel.c_menue.button_d.zamen){
			Panel.c_menue.button_d.ch_code=e.getKeyCode();
		}

	if(Panel.c_menue.button_l.zamen){
		Panel.c_menue.button_l.ch_code=e.getKeyCode();
	}

if(Panel.c_menue.button_r.zamen){
		Panel.c_menue.button_r.ch_code=e.getKeyCode();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key=e.getKeyCode();
		if(key==Panel.c_menue.button_up.ch_code){
			Player.up=false;
		}
		if(key==Panel.c_menue.button_d.ch_code){
			Player.down=false;
		}
		if(key==Panel.c_menue.button_l.ch_code){
			Player.left=false;
		}
		if(key==Panel.c_menue.button_r.ch_code){
			Player.right=false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
char sim=e.getKeyChar();
if(Panel.c_menue.button_up.zamen){
	Panel.c_menue.button_up.f=String.valueOf(sim);
	Panel.c_menue.button_up.zamen=false;
}
		if(Panel.c_menue.button_d.zamen){
			Panel.c_menue.button_d.f=String.valueOf(sim);
			Panel.c_menue.button_d.zamen=false;
		}
		if(Panel.c_menue.button_l.zamen){
			Panel.c_menue.button_l.f=String.valueOf(sim);
			Panel.c_menue.button_l.zamen=false;
		}
		if(Panel.c_menue.button_r.zamen){
			Panel.c_menue.button_r.f=String.valueOf(sim);
			Panel.c_menue.button_r.zamen=false;
		}
        }

	}

