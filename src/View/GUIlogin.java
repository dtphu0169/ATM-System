package View;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.nimbus.NimbusStyle;

import Controller.loginController;
import GUIComponent.JPassFieldLimit;
import GUIComponent.SetImagePanel;
import Model.loginModel;

public class GUIlogin extends JFrame {
	private ImageIcon background = new ImageIcon("src/img/ATM-background.jpg");
	private SetImagePanel mainpane = new SetImagePanel(background.getImage());
	private loginModel loginModel;
	private loginController control = new loginController(this);

	private JButton btDN;
	private JTextField tfDN;
	private JPasswordField tfMK;
	private JPanel p1, p2, p3, p4;
	
	public GUIlogin() {
		super("ATM simulate");
		setLayout(null);
		setSize(new Dimension(700, 500));

		mainpane.setLayout(null);
		mainpane.setBounds(0, 0, getWidth(), getHeight());
		
		// size scene
		mainpane.add(p1 = new JPanel(null));
		mainpane.add(p2 = new JPanel(null));
		mainpane.add(p3 = new JPanel(null));
		createItem();

		add(mainpane);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void createItem() {
		p1.add(tfDN = new JTextField());
		tfDN.setBounds(0, 0, getWidth(), getHeight());
		p1.setBounds(mainpane.getWidth() / 2 - 145, mainpane.getHeight() / 3, 300, 30);
		mainpane.add(p1);

		p2.add(tfMK = new JPassFieldLimit(4));
		tfMK.setEchoChar('*');
		tfMK.setBounds(0, 0, getWidth(), getHeight());
		p2.setBounds(mainpane.getWidth() / 2 - 145, mainpane.getHeight() / 3 + 80, 300, 30);
		mainpane.add(p2);

		p3.add(btDN = new JButton("ĐĂNG NHẬP"));
		p3.setBounds(mainpane.getWidth() / 2 - 80, mainpane.getHeight() / 3 + 160, 150, 40);
		btDN.setBounds(0, 0, getWidth(), getHeight());
		btDN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				control.login();
			}
		});
		mainpane.add(p3);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		mainpane.setBounds(0, 0, getWidth(), getHeight());
		p1.setBounds(mainpane.getWidth() / 2 - 145, mainpane.getHeight() / 3, 300, 30);
		tfDN.setBounds(0, 0, p1.getWidth(), p1.getHeight());
		p2.setBounds(mainpane.getWidth() / 2 - 145, mainpane.getHeight() / 3 + 80, 300, 30);
		tfMK.setBounds(0, 0, p2.getWidth(), p2.getHeight());
		p3.setBounds(mainpane.getWidth() / 2 - 80, mainpane.getHeight() / 3 + 160, 150, 40);
		btDN.setBounds(0, 0, p3.getWidth(), p3.getHeight());
		// repaint();
	}

	

	public loginModel getInfo() {
		loginModel = new loginModel(tfDN.getText(), tfMK.getText());
		return loginModel;
	}
}
