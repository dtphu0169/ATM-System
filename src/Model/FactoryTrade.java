package Model;

public class FactoryTrade {
	
	public static Trade createTrade(TradeType type) {
		switch (type) {
		case TRANSFER:
			return new TradeTransfer();
		case WITHDRAWALS:
			return new TradeWithdrawals();

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
