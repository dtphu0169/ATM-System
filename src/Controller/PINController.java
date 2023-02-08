package Controller;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import View.GUIPIN;

public class PINController implements IController {
	private JFrame mainGui;
	private GUIPIN gui;
	private String userPw;
	private IController controller;

	public PINController(JFrame mainGui2, GUIPIN gui, String userPw, IController controller) {
		this.mainGui = mainGui2;
		this.gui = gui;
		this.userPw = userPw;
		this.controller = controller;
	}

	@Override
	public void BtHuyAction() {
		gui.setVisible(false);
		mainGui.setVisible(true);
	}

	@Override
	public void DoNext() {
		if (gui.getTfPIN().getText().equals(userPw)) {
			controller.DoNext();
			gui.setVisible(false);
		} else {
			gui.getTfPIN().setText("");
			JOptionPane.showMessageDialog(null, "Mã PIN không chính xác!!\n Quý khách vui lòng nhập lại");
		}
	}

}
