package View;
/*
 * Created by JFormDesigner on Sun Jun 27 19:10:32 ICT 2021
 */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Controller.IController;
import Controller.PINController;
import GUIComponent.JPassFieldLimit;

/**
 * @author Đinh Ngọc Phú
 */
public class GUIPIN extends JFrame implements ActionListener{
	private PINController control;
	
	public GUIPIN(JFrame mainGui, String userPw, IController controller) {
		control = new PINController(mainGui, this, userPw, controller);
		initComponents();
		
		btHuy.addActionListener(this);
		btNext.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - �?inh Ng�?c Phú
		panel = new JPanel();
		label9 = new JLabel();
		label10 = new JLabel();
		tfPIN = new JPassFieldLimit(4);
		btHuy = new JButton();
		btNext = new JButton();
		desktopPane1 = new JDesktopPane();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== panel ========
		{
			panel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
			EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
			. border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
			java. awt. Color. red) ,panel. getBorder( )) ); panel. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
			{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
			throw new RuntimeException( ); }} );
			panel.setLayout(null);

			//---- label9 ----
			label9.setFont(new Font("Times New Roman", Font.BOLD, 14));
			label9.setText("Vui L\u00f2ng Nh\u1eadp S\u1ed1 PIN");
			label9.setHorizontalAlignment(SwingConstants.CENTER);
			panel.add(label9);
			label9.setBounds(60, 20, 265, 40);

			//---- label10 ----
			label10.setFont(new Font("Times New Roman", Font.BOLD, 14));
			label10.setText("Kh\u00e1ch H\u00e0ng ph\u1ea3i che tay khi nh\u1eadp s\u1ed1 PIN");
			label10.setHorizontalAlignment(SwingConstants.CENTER);
			label10.setForeground(Color.red);
			panel.add(label10);
			label10.setBounds(65, 60, 280, 40);

			//---- tfPIN ----
			tfPIN.setMargin(new Insets(0, 5, 5, 5));
			panel.add(tfPIN);
			tfPIN.setBounds(140, 110, 95, 30);

			//---- btHuy ----
			btHuy.setText("H\u1ee7y Giao D\u1ecbch");
			panel.add(btHuy);
			btHuy.setBounds(20, 190, 120, 35);

			//---- btNext ----
			btNext.setText("\u0110\u1ed3ng \u00fd");
			panel.add(btNext);
			btNext.setBounds(255, 190, 120, 35);
			panel.add(desktopPane1);
			desktopPane1.setBounds(0, 0, 400, 265);

			{
				// compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel.getComponentCount(); i++) {
					Rectangle bounds = panel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel.setMinimumSize(preferredSize);
				panel.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(panel);
		panel.setBounds(0, 0, 400, 265);

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
	// Generated using JFormDesigner Evaluation license - �?inh Ng�?c Phú
	private JPanel panel;
	private JLabel label9;
	private JLabel label10;
	private JPasswordField tfPIN;
	private JButton btHuy;
	private JButton btNext;
	private JDesktopPane desktopPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables


	public JPasswordField getTfPIN() {
		return tfPIN;
	}
	
@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == btHuy) {
		control.BtHuyAction();
	}
	if (e.getSource() == btNext) {
		control.DoNext();
	}
}
}
