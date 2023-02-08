package GUIComponent;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPasswordField;

public class JPassFieldLimit extends JPasswordField implements KeyListener{
	private int limit;

	public JPassFieldLimit(int limit) {
		this.limit = limit;
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (this.getText().length() >= limit) {
			e.consume();
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
