package Model;

public class TradeWithdrawals extends Trade{

	public TradeWithdrawals( int sender, double money, Date date,double TransferFees) {
		super(sender, 0, money, date,TransferFees);
	}
	public TradeWithdrawals(int id, int sender, double money, Date date,double TransferFees) {
		super(id, sender, 0, money, date,TransferFees);
	}
	public TradeWithdrawals() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printbill() {
		System.out.println("\t~~~~~ PT Bank ~~~~~");
		System.out.println("\t\tRút Tiền Mặt");
		System.out.println("Số thẻ: " + this.getSender());
		System.out.println("Số giao dịch: " + this.getID());
		System.out.println("Ngày giao dịch: " + this.getDates().getDay() + "/" + this.getDates().getMonth() + "/"
				+ this.getDates().getYear() + " Giờ " + this.getDates().getHour() + ":"
				+ this.getDates().getMinute());
		System.out.println("Số tiền rút: " + DataBank.getInstance().FormatMoneyString(this.getMoney()) + " VNĐ");
		for (User user : DataBank.getInstance().getlstUser()) {
			if (user.getID() == this.getSender()) {
				System.out.println("Số dư tài khoản: " + DataBank.getInstance().FormatMoneyString(user.getMoney()) + " VNĐ");
			}
		}
		System.out.println("Phí rút tiền: " + DataBank.getInstance().FormatMoneyString(this.getTransferFees()) + " VNĐ");
	}
}
