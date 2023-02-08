package Controller;



import javax.swing.JOptionPane;

import Model.DataBank;
import Model.User;
import Model.loginModel;
import View.GUIUser;
import View.GUIlogin;
import common.UserIO;

public class loginController {
	private GUIlogin view;
	
	public loginController(GUIlogin view) {
		this.view = view;
	}

	public void login() {
		User user = cklogin();
		if (user != null) {
			user.setCountWrongLogin(0);
			new GUIUser(user);
			view.setVisible(false);
		}
		UserIO.getInstance().SaveDataUser(DataBank.getInstance().getlstUser());
	}

	private User cklogin() {
		loginModel model = view.getInfo();
		if (model.getUser().equals("") || model.getUser() == null) {
			JOptionPane.showMessageDialog(null, "Bạn chưa đưa thẻ vào máy");
			return null;
		}
		for (User user : DataBank.getInstance().getlstUser()) {
			if (Integer.toString(user.getID()).equals(model.getUser())) {
				if (user.getCountWrongLogin() < user.getLimitNTimeLogin()) {
					if (user.getPw().equals(model.getPw())) {
						return user;
					} else {
						JOptionPane.showMessageDialog(null, "Mã PIN không chính xác");
						user.setCountWrongLogin(user.getCountWrongLogin() + 1);
						return null;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Tài Khoản đã bị khóa !!");
					return null;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Thẻ của bạn không thể xác định !!");
		return null;
	}
}
