package Model;

import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JOptionPane;

import common.TradeIO;
import common.UserIO;

public class DataBank {
	private static List<Trade> lstTrade = TradeIO.getInstance().RestoreDataTrade();
	private static List<User> lstUser = UserIO.getInstance().RestoreDateUser();
	private static DataBank instance;
	
	private final int MinMoneyTrade = 50000;
	private final int MaxMoneyTrade = 20000000;
	private final int[] multiplesMoney = { 20000, 50000 };
	
	private DataBank() {

	}

	public static DataBank getInstance() {
		if (instance == null) {
			instance = new DataBank();
		}
		return instance;
	}
	
	public List<Trade> getlstTrade() {
		return TradeIO.getInstance().RestoreDataTrade();
	}

	public List<User> getlstUser() {
		return UserIO.getInstance().RestoreDateUser();
	}

	public void UpdateUser(User subUser) {
		for (int i = 0; i < lstUser.size(); i++) {
			if (lstUser.get(i).getID() == subUser.getID()) {
				lstUser.set(i, subUser);
				break;
			}
		}
		UserIO.getInstance().SaveDataUser(lstUser);
	}

	public void UpdateTrade(Trade trade) {
		lstTrade.add(trade);
		TradeIO.getInstance().SaveDataTrade(lstTrade);
	}

	public User getUserwithId(int id) {
		for (User user : lstUser) {
			if (user.getID() == id) {
				return user;
			}
		}
		return null;
	}

	public void Trade(Trade trade) {
		for (User user : UserIO.getInstance().RestoreDateUser()) {
			if (user.getID() == trade.getSender()) {
				user.UpdateMoney(-(trade.getMoney() + trade.getTransferFees()));
				UpdateUser(user);
				UpdateTrade(trade);
			}
			if (user.getID() == trade.getReceiver()) {
				user.UpdateMoney(trade.getMoney());
				UpdateUser(user);
			}
		}
	}

	public String FormatMoneyString(double money) {
		DecimalFormat df = new DecimalFormat("###,###");
		String str = df.format(money);
		return str;
	}

	public boolean LimitMoneyTrade(int money) {
		if (money >= MinMoneyTrade && money <= MaxMoneyTrade) {
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Số tiền giao dịch phải nằm trong khoảng "
					+ this.FormatMoneyString(MinMoneyTrade) + " đến " + this.FormatMoneyString(MaxMoneyTrade));
			return false;
		}
	}

	public boolean multiplesMoneyTrade(int money) {
		int leftOver = money % multiplesMoney[multiplesMoney.length - 1];
		for (int i = 0; i < multiplesMoney.length; i++) {
			if (leftOver == 0) {
				return true;
			}
			leftOver = leftOver % multiplesMoney[i];
		}
		String multiplesString = this.FormatMoneyString(multiplesMoney[0]) + "";
		for (int j = multiplesMoney.length - 1; j > 0; j--) {
			multiplesString += " - " + this.FormatMoneyString(multiplesMoney[j]);
		}
		JOptionPane.showMessageDialog(null, "Số tiền giao dịch phải là bội số của " + multiplesString);
		return false;
	}
}
