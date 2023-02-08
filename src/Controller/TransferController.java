package Controller;


import javax.swing.JOptionPane;

import Model.DataBank;
import Model.Date;
import Model.Trade;
import Model.TradeTransfer;
import Model.User;
import View.GUITransfer;
import View.GUIUser;
import View.GUIlogin;

public class TransferController implements IController {
	private GUIUser mainGui;
	private GUITransfer transGui;
	private User sender;
	private User receiver;
	private int money;

	public TransferController(GUIUser mainGui, GUITransfer transGui, User sender) {
		this.mainGui = mainGui;
		this.transGui = transGui;
		this.sender = sender;
	}

	public void BtHuyAction() {
		transGui.setVisible(false);
		mainGui.setVisible(true);
	}

	public void BtNext() {
		int i = transGui.getTabbedPane1().getSelectedIndex();
		switch (i) {
		case 0:
			try {
				int TK = Integer.parseInt(transGui.getTfTK().getText());
				receiver = DataBank.getInstance().getUserwithId(TK);
				if (receiver == null || receiver.getID() == sender.getID()) {
					JOptionPane.showMessageDialog(null, "Số Tài Khoản Không Hợp Lệ");
					break;
				} else {
					transGui.getLb3TK().setText(transGui.getTfTK().getText());
					transGui.getTabbedPane1().setSelectedIndex(i + 1);
				}
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Số Tài Khoản Không Hợp Lệ");
				break;
			}
		case 1:
			try {
				money = Integer.parseInt(transGui.getTfMoney().getText());
				if (DataBank.getInstance().LimitMoneyTrade(money)) {
					transGui.getLb3Mney().setText(DataBank.getInstance().FormatMoneyString(money));
					transGui.getTabbedPane1().setSelectedIndex(i + 1);
				}
				break;
			} catch (Exception e) {
				transGui.getTfMoney().setText("");
				JOptionPane.showMessageDialog(null, "Số Tiền Không Hợp Lệ");
				break;
			}

		case 2:
			if (sender.ckLimitMoneyTrans(money)) {
				if (sender.ckLimitMoneyRemain(money)) {
					transGui.getTabbedPane1().setSelectedIndex(i + 1);
				} else {
					JOptionPane.showMessageDialog(null,
							"Số tiền trong tài khoản phải còn tối thiểu " + DataBank.getInstance().FormatMoneyString(sender.getLimitMoneyRemain()) + " VN�?");
				}
			} else {
				JOptionPane.showMessageDialog(null,
						"Số tiền giao dịch mỗi ngày phải dưới " + DataBank.getInstance().FormatMoneyString(sender.getLimitMoneyTrans()));
			}
			break;
		case 3:
			DoNext();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + i);
		}
	}

	public void DoNext() {
		if (transGui.getTfPIN().getText().equals(sender.getPw())) {
			Trade trade = new TradeTransfer(sender.getID(), receiver.getID(), money, Date.getCurrentTime(),sender.getTransferFees());
			DataBank.getInstance().Trade(trade);
			int output = JOptionPane.showConfirmDialog(null,
					"\tGiao dịch hoàn tất!\n Quý khách có muốn in hóa đơn hay không ?", "PT Bank",
					JOptionPane.YES_NO_OPTION);
			if (output == JOptionPane.YES_OPTION) {
				trade.printbill();
			}
			transGui.setVisible(false);
			new GUIlogin();
			//mainGui.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(null, "Mã PIN không chính xác");
		}
	}
}
