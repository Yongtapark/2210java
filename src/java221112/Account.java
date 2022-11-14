package java221112;

public class Account {

	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsuffIcientException {
		if (balance < money) {
			throw new BalanceInsuffIcientException("잔고부족 :" + (money - balance) + "모자람");
		}
		balance = -money;

	}

}
