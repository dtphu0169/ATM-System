package View;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import GUIComponent.CustomButton;
import GUIComponent.SetImageButton;
import GUIComponent.SetImagePanel;
import Model.AccountType;
import Model.User;

public class GUIUser extends JFrame implements ActionListener{
	private User user;
	private ImageIcon background = new ImageIcon("src/img/ATM-background.jpg");
	private ImageIcon Imagebt1 = new ImageIcon("src/img/bticon2.gif");
	
	private SetImagePanel mainpane = new SetImagePanel(background.getImage());
//	private SetImageButton bt1 = new SetImageButton(Imagebt1.getImage());
//	private SetImageButton bt2 = new SetImageButton(Imagebt1.getImage());
//	private SetImageButton bt3 = new SetImageButton(Imagebt1.getImage());
//	private SetImageButton bt4 = new SetImageButton(Imagebt1.getImage());
//	private SetImageButton bt5 = new SetImageButton(Imagebt1.getImage());
//	private SetImageButton bt6 = new SetImageButton(Imagebt1.getImage());
	private CustomButton bt1 = new CustomButton("Chuyển Tiền");
	private CustomButton bt2 = new CustomButton("Rút Tiền");
	private CustomButton bt3 = new CustomButton("Thông tin Tài khoản");
	private CustomButton bt4 = new CustomButton("Đổi Mã PIN");
	private CustomButton bt5 = new CustomButton("Thoát");
	private CustomButton bt6 = new CustomButton("bt6");
	
	private JPanel p1,p2,p3,p4,p5,p6;
	public GUIUser(User user) {
		super("ATM simulate");
		this.user = user;
		setLayout(null);
		// size scene
		setSize(new Dimension(700,500));
		mainpane.setLayout(null);
		mainpane.setBounds(0, 0, getWidth(), getHeight());
		
		createButton();
		
		//add actionbutton
		bt1.addActionListener(this);bt6.setRadius(15);
		bt2.addActionListener(this);bt6.setRadius(15);
		bt3.addActionListener(this);bt6.setRadius(15);
		bt4.addActionListener(this);bt6.setRadius(15);
		bt5.addActionListener(this);bt6.setRadius(15);
		bt6.addActionListener(this);bt6.setRadius(15);
		
		add(mainpane);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void createButton() {
		p1 = new JPanel(null);
		p1.add(bt1);
		p1.setBounds(25, mainpane.getHeight()/3-30, 250, 75);
		bt1.setBounds(0, 0, p1.getWidth(), p1.getHeight());
		mainpane.add(p1);
		
		p2 = new JPanel(null);
		p2.add(bt2);
		p2.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3-30, 250, 75);
		mainpane.add(p2);
		
		p3 = new JPanel(null);
		p3.add(bt3);
		p3.setBounds(25, mainpane.getHeight()/3+80, 250, 75);
		mainpane.add(p3);
		
		p4 = new JPanel(null);
		p4.add(bt4);
		p4.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3+80, 250, 75);
		mainpane.add(p4);
		
		p5 = new JPanel(null);
		p5.add(bt5);
		p5.setBounds(25, mainpane.getHeight()/3+190, 250, 75);
		mainpane.add(p5);
		
		p6 = new JPanel(null);
		p6.add(bt6);
		p6.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3+190, 250, 75);
		mainpane.add(p6);
		p6.setVisible(false);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		mainpane.setBounds(0, 0, getWidth(), getHeight());
		p1.setBounds(25, mainpane.getHeight()/3-30, 250, 75);
		p2.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3-30, 250, 75);
		p3.setBounds(25, mainpane.getHeight()/3+80, 250, 75);
		p4.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3+80, 250, 75);
		p5.setBounds(25, mainpane.getHeight()/3+190, 250, 75);
		p6.setBounds(mainpane.getWidth()-325, mainpane.getHeight()/3+190, 250, 75);
		bt1.setBounds(0, 0, p1.getWidth(), p1.getHeight());
		bt2.setBounds(0, 0, p2.getWidth(), p2.getHeight());
		bt3.setBounds(0, 0, p3.getWidth(), p3.getHeight());
		bt4.setBounds(0, 0, p4.getWidth(), p4.getHeight());
		bt5.setBounds(0, 0, p5.getWidth(), p5.getHeight());
		bt6.setBounds(0, 0, p6.getWidth(), p6.getHeight());
	}
	
	public static void main(String[] args) {
		new GUIUser(new User(6, "dien", "abcd", 1253000,AccountType.ECONOMY));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == bt1) {
			new GUITransfer(this,user);
			this.setVisible(false);
		}
		if (e.getSource() == bt2) {
			new GUIWithdrawal(this,user);
			this.setVisible(false);
		}
		if (e.getSource() == bt3) {
			new GUIUserInfor(this,user);
			this.setVisible(false);
		}
		if (e.getSource() == bt4) {
			new GUIChangePIN(this,user);
			this.setVisible(false);
		}
		if (e.getSource() == bt5) {
			new GUIlogin();
			this.setVisible(false);
		}
	}
}
