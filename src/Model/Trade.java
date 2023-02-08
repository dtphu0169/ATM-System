package Model;


public abstract class Trade {
	private int ID;
	private int sender;
	private int receiver;
	private double money;
	private double TransferFees;
	private Date date;
	
	public Trade() {
		// TODO Auto-generated constructor stub
	}
	public Trade(int iD, int sender, int receiver, double money, Date date,double TransferFees) {
		ID = iD;
		this.sender = sender;
		this.receiver = receiver;
		this.money = money;
		this.date = date;
		this.TransferFees = TransferFees;
	}
	public Trade(int sender, int receiver, double money, Date date,double TransferFees) {
		this.ID = getIdLastTrade() + 1;
		this.sender = sender;
		this.receiver = receiver;
		this.money = money;
		this.date = date;
		this.TransferFees = TransferFees;
	}
	public int getID() {
		return ID;
	}
	public int getSender() {
		return sender;
	}
	public int getReceiver() {
		return receiver;
	}
	public double getMoney() {
		return money;
	}
	public String getDate() {
		return date.toString();
	}
	public Date getDates() {
		return date;
	}
	public double getTransferFees() {
		return TransferFees;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	public void setSender(int sender) {
		this.sender = sender;
	}
	public void setReceiver(int receiver) {
		this.receiver = receiver;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setTransferFees(double transferFees) {
		TransferFees = transferFees;
	}
	public String toString() {
		return "Trade [ID=" + ID + ", sender=" + sender + ", receiver=" + receiver + ", money=" + money + ", date="
				+ date + "]";
	}
	public int getIdLastTrade() {
		int result =0 ;
		for(Trade trade : DataBank.getInstance().getlstTrade()) {
			if (trade.getID() > result) {
				result = trade.getID();
			}
		}
		return result;
	}

	public abstract void printbill() ;
	
	
}
