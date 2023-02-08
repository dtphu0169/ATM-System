package Controller;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.*;
import View.GUIChangePIN;
import View.GUIlogin;


public class ChangePINController implements IController {
	private JFrame maingui;
	private User user;
	private GUIChangePIN gui;
	
	public ChangePINController(JFrame maingui, GUIChangePIN gui, User user) {
		this.gui = gui;
		this.user = user;
		this.maingui = maingui;
	}

	@Override
	public void BtHuyAction() {
		maingui.setVisible(true);
		gui.setVisible(false);
	}

	@Override
	public void DoNext() {
		if (gui.isVisible()) {
			String oldPass = gui.getPfOld().getText();
			String newPass = gui.getPfNew().getText();
			if (user.getPw().equals(oldPass)) {
				user.ChangePw(newPass);
				DataBank.getInstance().UpdateUser(user);
				JOptionPane.showMessageDialog(null, "Mã PIN đã được thay đổi!!");
				gui.setVisible(false);
				new GUIlogin();
			}else {
				gui.getPfOld().setText("");
				gui.getPfNew().setText("");
				JOptionPane.showMessageDialog(null, "Mã PIN không chính xác!!\n Quý khách vui lòng nhập lại");
			}
		} else {// Do from PIN controller
			gui.setVisible(true);
		}
	}

}
