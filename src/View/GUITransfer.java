package View;
/*
 * Created by JFormDesigner on Tue Jun 22 13:34:12 ICT 2021
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.TransferController;
import GUIComponent.JPassFieldLimit;
import Model.User;

/**
 * @author Đinh Ngọc Phú
 */
public class GUITransfer extends JFrame implements ActionListener {
	private TransferController controller;

	public GUITransfer(GUIUser mainGui,User user) {
		controller = new TransferController(mainGui, this,user);
		setTitle("PT Bank - TK : "+ user.getID());
		initComponents();

		// addaction button
		bt1Huy.addActionListener(this);
		bt2Huy.addActionListener(this);
		bt3Huy.addActionListener(this);
		bt4Huy.addActionListener(this);
		bt1Next.addActionListener(this);
		bt2Next.addActionListener(this);
		bt3Next.addActionListener(this);
		bt4Next.addActionListener(this);
		bt3_1.addActionListener(this);
		bt3_2.addActionListener(this);
		
		tabbedPane1.setEnabled(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - �?inh Ng�?c Phú
		tabbedPane1 = new JTabbedPane();
		panel1 = new JPanel();
		bt1Huy = new JButton();
		bt1Next = new JButton();
		label1 = new JLabel();
		tfTK = new JTextField();
		label2 = new JLabel();
		panel2 = new JPanel();
		bt2Huy = new JButton();
		bt2Next = new JButton();
		label3 = new JLabel();
		label4 = new JLabel();
		tfMoney = new JTextField();
		label5 = new JLabel();
		panel3 = new JPanel();
		label6 = new JLabel();
		lb3TK = new JLabel();
		bt3Huy = new JButton();
		bt3Next = new JButton();
		lb3Mney = new JLabel();
		bt3_1 = new JButton();
		bt3_2 = new JButton();
		lb3TK2 = new JLabel();
		lb3Mney2 = new JLabel();
		panel4 = new JPanel();
		label9 = new JLabel();
		label10 = new JLabel();
		tfPIN = new JPassFieldLimit(4);
		bt4Huy = new JButton();
		bt4Next = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== tabbedPane1 ========
		{

			//======== panel1 ========
			{
				
				panel1.setLayout(null);

				//---- bt1Huy ----
				bt1Huy.setText("Hủy Giao Dịch");
				panel1.add(bt1Huy);
				bt1Huy.setBounds(20, 190, 120, 35);

				//---- bt1Next ----
				bt1Next.setText("Bước Kế Tiếp");
				panel1.add(bt1Next);
				bt1Next.setBounds(255, 190, 120, 35);

				//---- label1 ----
				label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label1.setText("Vui Lòng Nhập Số Tài Khoản Chuyển Đến");
				panel1.add(label1);
				label1.setBounds(60, 35, 265, 40);
				panel1.add(tfTK);
				tfTK.setBounds(150, 85, 155, 35);

				//---- label2 ----
				label2.setText("TK Chuyển Đến:");
				label2.setHorizontalAlignment(SwingConstants.CENTER);
				panel1.add(label2);
				label2.setBounds(30, 90, 105, 25);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel1.getComponentCount(); i++) {
						Rectangle bounds = panel1.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel1.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel1.setMinimumSize(preferredSize);
					panel1.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Bước 1", panel1);

			//======== panel2 ========
			{
				panel2.setLayout(null);

				//---- bt2Huy ----
				bt2Huy.setText("Hủy Giao Dịch");
				panel2.add(bt2Huy);
				bt2Huy.setBounds(20, 190, 120, 35);

				//---- bt2Next ----
				bt2Next.setText("Bước Kế Tiếp");
				panel2.add(bt2Next);
				bt2Next.setBounds(255, 190, 120, 35);

				//---- label3 ----
				label3.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label3.setText("Vui Lòng Nhập Số Tiền Chuyển");
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				panel2.add(label3);
				label3.setBounds(60, 35, 265, 40);

				//---- label4 ----
				label4.setText("Số Tiền Chuyển:");
				label4.setHorizontalAlignment(SwingConstants.CENTER);
				panel2.add(label4);
				label4.setBounds(20, 90, 105, 25);
				panel2.add(tfMoney);
				tfMoney.setBounds(130, 85, 155, 35);

				//---- label5 ----
				label5.setText("VNĐ");
				panel2.add(label5);
				label5.setBounds(295, 90, 40, 25);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel2.getComponentCount(); i++) {
						Rectangle bounds = panel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel2.setMinimumSize(preferredSize);
					panel2.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Bước 2", panel2);

			//======== panel3 ========
			{
				panel3.setLayout(null);

				//---- label6 ----
				label6.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label6.setText("Thông Tin Chuyển Khoản");
				label6.setHorizontalAlignment(SwingConstants.CENTER);
				panel3.add(label6);
				label6.setBounds(60, 35, 265, 40);

				//---- lb3TK ----
				lb3TK.setForeground(Color.red);
				panel3.add(lb3TK);
				lb3TK.setBounds(85, 85, 90, 25);

				//---- bt3Huy ----
				bt3Huy.setText("Hủy Giao Dịch");
				panel3.add(bt3Huy);
				bt3Huy.setBounds(20, 190, 120, 35);

				//---- bt3Next ----
				bt3Next.setText("Bước Kế Tiếp");
				panel3.add(bt3Next);
				bt3Next.setBounds(255, 190, 120, 35);

				//---- lb3Mney ----
				lb3Mney.setForeground(new Color(204, 0, 0));
				panel3.add(lb3Mney);
				lb3Mney.setBounds(20, 125, 100, 25);

				//---- bt3_1 ----
				bt3_1.setText("Bước 1");
				panel3.add(bt3_1);
				bt3_1.setBounds(255, 100, 120, 35);

				//---- bt3_2 ----
				bt3_2.setText("Bước 2");
				panel3.add(bt3_2);
				bt3_2.setBounds(255, 145, 120, 35);

				//---- lb3TK2 ----
				lb3TK2.setText("Số TK:");
				panel3.add(lb3TK2);
				lb3TK2.setBounds(20, 85, 55, 25);

				//---- lb3Mney2 ----
				lb3Mney2.setText("VNĐ");
				panel3.add(lb3Mney2);
				lb3Mney2.setBounds(135, 125, 45, 25);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel3.getComponentCount(); i++) {
						Rectangle bounds = panel3.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel3.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel3.setMinimumSize(preferredSize);
					panel3.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Bước 3", panel3);

			//======== panel4 ========
			{
				panel4.setLayout(null);

				//---- label9 ----
				label9.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label9.setText("Vui Lòng Nhập Số PIN");
				label9.setHorizontalAlignment(SwingConstants.CENTER);
				panel4.add(label9);
				label9.setBounds(60, 20, 265, 40);

				//---- label10 ----
				label10.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label10.setText("Khách Hành phải che tay khi nhập số PIN");
				label10.setHorizontalAlignment(SwingConstants.CENTER);
				label10.setForeground(Color.red);
				panel4.add(label10);
				label10.setBounds(65, 60, 280, 40);

				//---- tfPIN ----
				tfPIN.setMargin(new Insets(0, 5, 5, 5));
				panel4.add(tfPIN);
				tfPIN.setBounds(140, 110, 95, 30);

				//---- bt4Huy ----
				bt4Huy.setText("Hủy Giao Dịch");
				panel4.add(bt4Huy);
				bt4Huy.setBounds(20, 190, 120, 35);

				//---- bt4Next ----
				bt4Next.setText("\u0110\u1ed3ng \u00fd");
				panel4.add(bt4Next);
				bt4Next.setBounds(255, 190, 120, 35);

				{
					// compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel4.getComponentCount(); i++) {
						Rectangle bounds = panel4.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel4.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel4.setMinimumSize(preferredSize);
					panel4.setPreferredSize(preferredSize);
				}
			}
			tabbedPane1.addTab("Bước 4", panel4);
		}
		contentPane.add(tabbedPane1);
		tabbedPane1.setBounds(0, 0, 400, 270);

		{
			// compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Đinh Ngọc Phú
	private JTabbedPane tabbedPane1;
	private JPanel panel1;
	private JButton bt1Huy;
	private JButton bt1Next;
	private JLabel label1;
	private JTextField tfTK;
	private JLabel label2;
	private JPanel panel2;
	private JButton bt2Huy;
	private JButton bt2Next;
	private JLabel label3;
	private JLabel label4;
	private JTextField tfMoney;
	private JLabel label5;
	private JPanel panel3;
	private JLabel label6;
	private JLabel lb3TK;
	private JButton bt3Huy;
	private JButton bt3Next;
	private JLabel lb3Mney;
	private JButton bt3_1;
	private JButton bt3_2;
	private JLabel lb3TK2;
	private JLabel lb3Mney2;
	private JPanel panel4;
	private JLabel label9;
	private JLabel label10;
	private JPasswordField tfPIN;
	private JButton bt4Huy;
	private JButton bt4Next;
	// JFormDesigner - End of variables declaration //GEN-END:variables

	public JTabbedPane getTabbedPane1() {
		return tabbedPane1;
	}
	
	
	public JTextField getTfTK() {
		return tfTK;
	}

	public void setTfTK(JTextField tfTK) {
		this.tfTK = tfTK;
	}

	public JTextField getTfMoney() {
		return tfMoney;
	}

	public void setTfMoney(JTextField tfMoney) {
		this.tfMoney = tfMoney;
	}

	public JLabel getLb3TK() {
		return lb3TK;
	}

	public void setLb3TK(JLabel lb3tk) {
		lb3TK = lb3tk;
	}

	public JLabel getLb3Mney() {
		return lb3Mney;
	}

	public void setLb3Mney(JLabel lb3Mney) {
		this.lb3Mney = lb3Mney;
	}

	public JPasswordField getTfPIN() {
		return tfPIN;
	}

	public void setTfPIN(JPasswordField tfPIN) {
		this.tfPIN = tfPIN;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt1Huy || e.getSource() == bt2Huy || e.getSource() == bt3Huy || e.getSource() == bt4Huy) {
			controller.BtHuyAction();
		}
		if (e.getSource() == bt1Next || e.getSource() == bt2Next ||
				e.getSource() == bt3Next || e.getSource() == bt4Next) {
			controller.BtNext();
		}
		if (e.getSource() == bt3_1) {
			tabbedPane1.setSelectedIndex(0);
		}
		if (e.getSource() == bt3_2) {
			tabbedPane1.setSelectedIndex(1);
		}

	}
}
