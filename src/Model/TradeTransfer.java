package Model;

public class TradeTransfer extends Trade{

	public TradeTransfer(int sender, int receiver, double money, Date date,double TransferFees) {
		super(sender, receiver, money, date,TransferFees);
		// TODO Auto-generated constructor stub
	}

	public TradeTransfer(int id, int sender, int receiver, double money, Date date,double TransferFees) {
		super(id,sender, receiver, money, date,TransferFees);
		// TODO Auto-generated constructor stub
	}
	public TradeTransfer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printbill() {
		System.out.println("\t~~~~~ PT Bank ~~~~~");
		System.out.println("\t\tChuyển tiền");
		System.out.println("Số thẻ ngườii gửi: " + this.getSender());
		System.out.println("Số thẻ ngườii nhận: " + this.getReceiver());
		System.out.println("Số giao dịch: " + this.getID());
		System.out.println("Ngày giao dịch: " + this.getDates().getDay() + "/" + this.getDates().getMonth() + "/"
				+ this.getDates().getYear() + " Giờ " + this.getDates().getHour() + ":"
				+ this.getDates().getMinute());
		System.out.println("Số tiền chuyển: " + DataBank.getInstance().FormatMoneyString(this.getMoney()) + " VNĐ");
		System.out.println("Phí chuyển: " + DataBank.getInstance().FormatMoneyString(this.getTransferFees()) + " VNĐ");
	}
}
