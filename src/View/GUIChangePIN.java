package View;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ChangePINController;
import Controller.IController;
import GUIComponent.JPassFieldLimit;
import Model.User;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIChangePIN extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPasswordField pfOld;
	private JPasswordField pfNew;
	private JFrame mainGui;
	private User user;
	private IController controller;
	private JButton btHuy;
	private JButton btNext;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					GUIChangePIN frame = new GUIChangePIN();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public GUIChangePIN(JFrame mainGui , User user) {
		this.mainGui = mainGui;
		this.user = user;
		this.controller = new ChangePINController(mainGui,this,user);
		
		GUIPIN guiPIN = new GUIPIN(this.mainGui, this.user.getPw(), controller);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbPinOld = new JLabel("Nhập mã PIN cũ :");
		lbPinOld.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbPinOld.setBounds(50, 75, 126, 31);
		contentPane.add(lbPinOld);
		
		JLabel lbPINNew = new JLabel("Nhập mã PIN mới :");
		lbPINNew.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbPINNew.setBounds(50, 130, 126, 31);
		contentPane.add(lbPINNew);
		
		pfOld = new JPassFieldLimit(4);
		pfOld.setEchoChar('*');
		pfOld.setBounds(200, 81, 93, 20);
		//pfOld.setDocument(new jtextf);
		contentPane.add(pfOld);
		
		pfNew = new JPassFieldLimit(4);
		pfNew.setEchoChar('*');
		pfNew.setBounds(200, 136, 93, 20);
		contentPane.add(pfNew);
		
		btHuy = new JButton("Quay Lại");
		btHuy.addActionListener(this);
		btHuy.setBounds(20, 200, 120, 35);
		contentPane.add(btHuy);
		
		btNext = new JButton("Thay đôi");
		btNext.addActionListener(this);
		btNext.setBounds(255, 200, 120, 35);
		contentPane.add(btNext);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
		desktopPane.setBounds(0, 0, 410, 271);
		
		setLocationRelativeTo(getOwner());
		//setVisible(true);
	}

	
	public JPasswordField getPfOld() {
		return pfOld;
	}

	public void setPfOld(JPasswordField pfOld) {
		this.pfOld = pfOld;
	}

	public JPasswordField getPfNew() {
		return pfNew;
	}

	public void setPfNew(JPasswordField pfNew) {
		this.pfNew = pfNew;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btHuy) {
			controller.BtHuyAction();
		}
		if (e.getSource() == btNext) {
			controller.DoNext();
		}
	}
}
