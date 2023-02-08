package Controller;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Model.DataBank;
import Model.Date;
import Model.Trade;
import Model.TradeWithdrawals;
import Model.User;
import View.GUIPIN;
import View.GUIUser;
import View.GUIlogin;

public class WithDrawalController implements IController {
	private User user;
	private GUIUser mainGui;
	private JFrame DrawalGui;

	private int money;

	public WithDrawalController(GUIUser mainGui, JFrame DrawalGui, User user) {
		this.user = user;
		this.mainGui = mainGui;
		this.DrawalGui = DrawalGui;
	}

	public void BtHuyAction() {
		DrawalGui.setVisible(false);
		mainGui.setVisible(true);
	}

	public void getMoney(String Buttonmoney) {
		switch (Buttonmoney) {
		case "10,000,000":
			money = 10000000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		case "5,000,000":
			money = 5000000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		case "3,000,000":
			money = 3000000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		case "2,000,000":
			money = 2000000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		case "1,000,000":
			money = 1000000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		case "500,000":
			money = 500000;
//			DrawalGui.setVisible(false);
//			new GUIPIN(mainGui, user.getPw(), this);
			break;
		default:
			try {
				money = Integer.parseInt(Buttonmoney);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Dữ liệu nhập không chính xác!!\n Quý khách vui lòng nhập lại");
			}
		}
		if (user.ckLimitMoneyTrans(money)) {
			if (DataBank.getInstance().LimitMoneyTrade(money)) {
				if (user.ckLimitMoneyRemain(money)) {
					if (DataBank.getInstance().multiplesMoneyTrade(money)) {
						DrawalGui.setVisible(false);
						new GUIPIN(mainGui, user.getPw(), this);
					}
				}else {
					JOptionPane.showMessageDialog(null,
							"Số tiền trong tài khoản phải còn tối thiểu " + DataBank.getInstance().FormatMoneyString(user.getLimitMoneyRemain()) + " VNĐ?");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null,
					"Số tiềnn giao dịch mỗi ngày phải dưới " + DataBank.getInstance().FormatMoneyString(user.getLimitMoneyTrans()) + " VNĐ?");
		}
	}

	public void DoNext() {
		Trade trade = new TradeWithdrawals(user.getID(), money, Date.getCurrentTime(), 0);
		DataBank.getInstance().Trade(trade);
		int output = JOptionPane.showConfirmDialog(null,
				"\tGiao dịch hoàn tất!\n Quý khách có muốn in hóa đơn hay không ?", "PT Bank",
				JOptionPane.YES_NO_OPTION);
		if (output == JOptionPane.YES_OPTION) {
			trade.printbill();
		}
		DrawalGui.setVisible(false);
		new GUIlogin();
	}

}
