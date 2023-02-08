package View;
/*
 * Created by JFormDesigner on Thu Jun 24 14:19:12 ICT 2021
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.WithDrawalController;
import Model.User;

/**
 * @author Đinh Ngọc Phú
 */
public class GUIWithdrawal extends JFrame implements ActionListener {
	private WithDrawalController controller;
	private GUIUser mainGui;
	private User user;

	public GUIWithdrawal(GUIUser mainGui, User user) {
		this.mainGui = mainGui;
		this.user = user;
		controller = new WithDrawalController(mainGui, this, user);
		initComponents();

		bt10M.addActionListener(this);
		bt5M.addActionListener(this);
		bt3M.addActionListener(this);
		bt2M.addActionListener(this);
		bt1M.addActionListener(this);
		bt5k.addActionListener(this);
		bt1Huy.addActionListener(this);
		btOtherValue.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Đinh Ngọc Phú
		panel1 = new JPanel();
		bt1Huy = new JButton();
		btOtherValue = new JButton();
		bt10M = new JButton();
		bt5M = new JButton();
		bt3M = new JButton();
		label7 = new JLabel();
		bt2M = new JButton();
		bt1M = new JButton();
		bt5k = new JButton();
		desktopPane1 = new JDesktopPane();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== panel1 ========
		{
			panel1.setLayout(null);

			//---- bt1Huy ----
			bt1Huy.setText("Hủy Giao Dịch");
			panel1.add(bt1Huy);
			bt1Huy.setBounds(20, 200, 120, 35);

			//---- btOtherValue ----
			btOtherValue.setText("Số Khác");
			panel1.add(btOtherValue);
			btOtherValue.setBounds(255, 200, 120, 35);

			//---- bt10M ----
			bt10M.setText("10,000,000");
			bt10M.setActionCommand("10,000,000");
			panel1.add(bt10M);
			bt10M.setBounds(-10, 55, 135, 30);

			//---- bt5M ----
			bt5M.setText("5,000,000");
			bt5M.setActionCommand("5,000,000");
			panel1.add(bt5M);
			bt5M.setBounds(-10, 100, 135, 30);

			//---- bt3M ----
			bt3M.setText("3,000,000");
			bt3M.setActionCommand("3,000,000");
			panel1.add(bt3M);
			bt3M.setBounds(-10, 145, 135, 30);

			//---- label7 ----
			label7.setFont(new Font("Times New Roman", Font.BOLD, 14));
			label7.setText("Vui Lòng Lựa Chọn Số Tiền");
			label7.setHorizontalAlignment(SwingConstants.CENTER);
			panel1.add(label7);
			label7.setBounds(55, 10, 265, 40);

			//---- bt2M ----
			bt2M.setText("2,000,000");
			bt2M.setActionCommand("2,000,000");
			panel1.add(bt2M);
			bt2M.setBounds(270, 55, 135, 30);

			//---- bt1M ----
			bt1M.setText("1,000,000");
			bt1M.setActionCommand("1,000,000");
			panel1.add(bt1M);
			bt1M.setBounds(270, 100, 135, 30);

			//---- bt5k ----
			bt5k.setText("500,000");
			bt5k.setActionCommand("500,000");
			panel1.add(bt5k);
			bt5k.setBounds(270, 145, 135, 30);
			panel1.add(desktopPane1);
			desktopPane1.setBounds(0, 0, 400, 260);

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
		contentPane.add(panel1);
		panel1.setBounds(0, 0, 400, 260);

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
	private JPanel panel1;
	private JButton bt1Huy;
	private JButton btOtherValue;
	private JButton bt10M;
	private JButton bt5M;
	private JButton bt3M;
	private JLabel label7;
	private JButton bt2M;
	private JButton bt1M;
	private JButton bt5k;
	private JDesktopPane desktopPane1;
	// JFormDesigner - End of variables declaration //GEN-END:variables

	class OtherMoneyValue extends JFrame implements ActionListener {

		public OtherMoneyValue() {
			controller = new WithDrawalController(mainGui, this, user);
			initComponent();

			bt2Huy.addActionListener(this);
			bt2Next.addActionListener(this);

			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
		}

		private void initComponent() {
			panel2 = new JPanel();
			bt2Huy = new JButton();
			bt2Next = new JButton();
			label3 = new JLabel();
			desktopPane1 = new JDesktopPane();
			label1 = new JLabel();
			label4 = new JLabel();
			tfMoney = new JTextField();
			label5 = new JLabel();
			label2 = new JLabel();

			//======== this ========
			var contentPane = getContentPane();
			contentPane.setLayout(null);

			//======== panel2 ========
			{
				panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
				. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing
				. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
				Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
				) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
				public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName (
				) )) throw new RuntimeException( ); }} );
				panel2.setLayout(null);

				//---- bt2Huy ----
				bt2Huy.setText("Hủy Giao Dịch");
				panel2.add(bt2Huy);
				bt2Huy.setBounds(20, 190, 120, 35);

				//---- bt2Next ----
				bt2Next.setText("Rút Tiền");
				panel2.add(bt2Next);
				bt2Next.setBounds(255, 190, 120, 35);

				//---- label3 ----
				label3.setFont(new Font("Times New Roman", Font.BOLD, 14));
				label3.setText("Vui Lòng Nhập Số Tiền Rút");
				label3.setHorizontalAlignment(SwingConstants.CENTER);
				panel2.add(label3);
				label3.setBounds(60, 20, 265, 40);

				//======== desktopPane1 ========
				{

					//---- label1 ----
					label1.setText("Số tiền phải là bội số của ");
					label1.setForeground(Color.cyan);
					label1.setHorizontalAlignment(SwingConstants.CENTER);
					desktopPane1.add(label1, JLayeredPane.DEFAULT_LAYER);
					label1.setBounds(50, 65, 170, 21);

					//---- label4 ----
					label4.setText("Số tiền rút:");
					label4.setHorizontalAlignment(SwingConstants.CENTER);
					desktopPane1.add(label4, JLayeredPane.DEFAULT_LAYER);
					label4.setBounds(20, 125, 105, 25);
					desktopPane1.add(tfMoney, JLayeredPane.DEFAULT_LAYER);
					tfMoney.setBounds(135, 120, 155, 35);

					//---- label5 ----
					label5.setText("VNĐ");
					desktopPane1.add(label5, JLayeredPane.DEFAULT_LAYER);
					label5.setBounds(295, 125, 40, 25);

					//---- label2 ----
					label2.setText("20,000 - 50,000");
					label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 6f));
					label2.setForeground(Color.cyan);
					desktopPane1.add(label2, JLayeredPane.DEFAULT_LAYER);
					label2.setBounds(225, 55, 155, 35);
				}
				panel2.add(desktopPane1);
				desktopPane1.setBounds(0, 0, 400, 255);

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
			contentPane.add(panel2);
			panel2.setBounds(0, 0, 400, 250);

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
			// JFormDesigner - End of component initialization  //GEN-END:initComponents
		}

		private JPanel panel2;
		private JButton bt2Huy;
		private JButton bt2Next;
		private JLabel label3;
		private JDesktopPane desktopPane1;
		private JLabel label1;
		private JLabel label4;
		private JTextField tfMoney;
		private JLabel label5;
		private JLabel label2;

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == bt2Huy) {
				controller.BtHuyAction();
			}
			if (e.getSource() == bt2Next) {
				controller.getMoney(tfMoney.getText());
			}
		}

	}

// Action class Withdrawal
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt10M || e.getSource() == bt5M || e.getSource() == bt3M || e.getSource() == bt2M
				|| e.getSource() == bt1M || e.getSource() == bt5k) {
			controller.getMoney(((JButton) e.getSource()).getText());
		}
		if (e.getSource() == bt1Huy) {
			controller.BtHuyAction();
		}
		if (e.getSource() == btOtherValue) {
			new OtherMoneyValue();
			this.setVisible(false);
		}
	}
}
