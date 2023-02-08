package GUIComponent;


import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class SetImagePanel extends JPanel{
	private Image image;

	public SetImagePanel(Image image) {
		this.image = image;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}
