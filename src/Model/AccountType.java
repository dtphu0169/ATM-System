package Model;

public enum AccountType {
	ECONOMY,BUSINESS;
	public static IAccount getAcountType(AccountType type) {
		switch (type) {
		case ECONOMY:
			return new EconomyAcount();
			
		case BUSINESS:
			return new BusinessAcount();

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
}
