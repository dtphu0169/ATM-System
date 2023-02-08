package GUIComponent;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SetImageButton extends JButton{
	private Image image;
	private ImageIcon background = new ImageIcon("src/img/ATM-background.jpg");

	public SetImageButton(Image image) {
		this.image = image;
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
		g.drawImage(image, 0, 0, getWidth(), getHeight(),null);
	}
	
}
