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
			if(key==KeyEvent.VK_W){
				Player.up=true;
		}
		if(key==KeyEvent.VK_S){
			Player.up=true;
		}
		if(key==KeyEvent.VK_A){
			Player.up=true;
		}
		if(key==KeyEvent.VK_D){
			Player.up=true;
		}
		if(key==KeyEvent.VK_ESCAPE){
			if(Panel.state==Panel.STATES.PLAY) Panel.state = Panel.STATES.MENUE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_W){
			Player.up=false;
		}
		if(key==KeyEvent.VK_S){
			Player.up=false;
		}
		if(key==KeyEvent.VK_A){
			Player.up=false;
		}
		if(key==KeyEvent.VK_D){
			Player.up=false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

        }

	}

