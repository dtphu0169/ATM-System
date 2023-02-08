package Model;


public class User {
	private int ID;
	private String name;
	private String pw;
	private double money;
	private int limitMoneyTrans;
	private int limitMoneyRemain;
	private int countWrongLogin;
	private int LimitNTimeLogin ;
	private AccountType accountType;

	public User(int iD, String name, String pw, double money, AccountType type) {
		ID = iD;
		this.name = name;
		this.pw = pw;
		this.money = money;
		this.limitMoneyTrans = 50000000;
		this.limitMoneyRemain = 50000;
		this.countWrongLogin = 0;
		this.LimitNTimeLogin = 3;
		this.accountType = type;
	}

	public double getTransferFees() {
		return AccountType.getAcountType(accountType).getTransferFees();
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getPw() {
		return pw;
	}

	public double getMoney() {
		return money;
	}

	public int getLimitMoneyTrans() {
		return limitMoneyTrans;
	}

	public int getLimitMoneyRemain() {
		return limitMoneyRemain;
	}
	
	public int getCountWrongLogin() {
		return countWrongLogin;
	}

	public void setCountWrongLogin(int countWrongLogin) {
		this.countWrongLogin = countWrongLogin;
	}

	public int getLimitNTimeLogin() {
		return LimitNTimeLogin;
	}

	public void ChangePw(String pw) {
		this.pw = pw;
	}

	private double TotalMoneyDay(Date date, double extraMoney) {
		double result = extraMoney;
		for (Trade trade : DataBank.getInstance().getlstTrade()) {
			if (trade.getDates().getDay().equals(date.getDay()) && trade.getDates().getMonth().equals(date.getMonth())
					&& trade.getDates().getYear().equals(date.getYear()) && trade.getSender() == this.ID) {
				result += trade.getMoney();
			}
		}
		return result;
	}

	public boolean ckLimitMoneyTrans(double extraMoney) {
		Date current = Date.getCurrentTime();
		if (TotalMoneyDay(current, extraMoney) <= this.limitMoneyTrans) {
			return true;
		}
		return false;
	}

	public boolean ckLimitMoneyRemain(double extraMoney) {
		if (this.money - extraMoney < this.limitMoneyRemain) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + ", pw=" + pw + ", money=" + money;
	}

	public void UpdateMoney(double money) {
		this.money += money;
	}


}
