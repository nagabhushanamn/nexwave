package com;

class AccountBalanceException extends Exception {
	private double currentBalance;

	public AccountBalanceException(double currentBalance) {
		super();
		this.currentBalance = currentBalance;
	}

	@Override
	public String getMessage() {
		return "your balance " + this.currentBalance + " ! first earn before txr";
	}
}

class TxrService {
	public void doTxr(String from, String to, double amount) throws AccountBalanceException {

		// load from & to accounst from DB

		// if from-account enough balance
		double fromAccBalance = 1000.00;
		if (fromAccBalance < amount) {
			AccountBalanceException abe = new AccountBalanceException(fromAccBalance);
			throw abe;
		}

		// debit & credit

		// update both accounts
		System.out.println("Txr Success");

	}
}

public class Ex {

	public static void main(String[] args) {

		TxrService service = new TxrService();
		try {
			service.doTxr("1", "2", 500.00);
		} catch (AccountBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
