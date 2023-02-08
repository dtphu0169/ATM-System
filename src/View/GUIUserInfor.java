package View;
/*
 * Created by JFormDesigner on Mon Jun 28 20:12:13 ICT 2021
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Model.DataBank;
import Model.User;

/**
 * @author Đinh Ngọc Phú
 */
public class GUIUserInfor extends JFrame {
	private JDesktopPane desktopPane = new JDesktopPane();
	
	public GUIUserInfor(JFrame mainGui, User user) {
		initComponents();
		
		panel1.add(desktopPane);
		desktopPane.setBounds(0, 0, this.getWidth(), this.getHeight());
		
		lbSTK.setText(user.getID()+"");
		lbName.setText(user.getName());
		lbMoney.setText(DataBank.getInstance().FormatMoneyString(user.getMoney()));
		
		btHuy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIUserInfor.this.setVisible(false);
				mainGui.setVisible(true);
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Đinh Ngọc Phú
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		lbSTK = new JLabel();
		lbName = new JLabel();
		lbMoney = new JLabel();
		lbMoney2 = new JLabel();
		btHuy = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== panel1 ========
		{
			panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
			swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border
			.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog"
			,java.awt.Font.BOLD,12),java.awt.Color.red),panel1. getBorder
			()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
			.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))throw new RuntimeException
			();}});
			panel1.setLayout(null);

			//---- label1 ----
			label1.setText("S\u1ed1 T\u00e0i Kho\u1ea3n :");
			label1.setHorizontalAlignment(SwingConstants.RIGHT);
			panel1.add(label1);
			label1.setBounds(45, 75, 110, 25);

			//---- label2 ----
			label2.setText("T\u00ean Ch\u1ee7 T\u00e0i Kho\u1ea3n :");
			label2.setHorizontalAlignment(SwingConstants.RIGHT);
			panel1.add(label2);
			label2.setBounds(30, 115, 125, 25);

			//---- label3 ----
			label3.setText("S\u1ed1 D\u01b0 T\u00e0i Kho\u1ea3n :");
			label3.setHorizontalAlignment(SwingConstants.RIGHT);
			panel1.add(label3);
			label3.setBounds(45, 165, 110, 25);

			//---- lbSTK ----
			lbSTK.setText("STK");
			lbSTK.setForeground(Color.green);
			lbSTK.setFont(lbSTK.getFont().deriveFont(lbSTK.getFont().getStyle() | Font.BOLD));
			panel1.add(lbSTK);
			lbSTK.setBounds(195, 75, 70, 25);

			//---- lbName ----
			lbName.setText("Name");
			lbName.setForeground(Color.green);
			lbName.setFont(lbName.getFont().deriveFont(lbName.getFont().getStyle() | Font.BOLD));
			panel1.add(lbName);
			lbName.setBounds(195, 115, 70, 25);

			//---- lbMoney ----
			lbMoney.setText("Money");
			lbMoney.setForeground(Color.green);
			lbMoney.setFont(lbMoney.getFont().deriveFont(lbMoney.getFont().getStyle() | Font.BOLD));
			panel1.add(lbMoney);
			lbMoney.setBounds(195, 165, 120, 25);

			//---- lbMoney2 ----
			lbMoney2.setText("VN\u0110");
			lbMoney2.setForeground(Color.black);
			panel1.add(lbMoney2);
			lbMoney2.setBounds(300, 165, 70, 25);

			//---- btHuy ----
			btHuy.setText("Quay L\u1ea1i");
			panel1.add(btHuy);
			btHuy.setBounds(30, 215, 120, 35);

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
		panel1.setBounds(0, 0, 400, 270);

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

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Đinh Ngọc Phú
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel lbSTK;
	private JLabel lbName;
	private JLabel lbMoney;
	private JLabel lbMoney2;
	private JButton btHuy;
	// JFormDesigner - End of variables declaration  //GEN-END:variables


}
