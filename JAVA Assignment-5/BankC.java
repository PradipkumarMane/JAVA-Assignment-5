package Assignment1;

public class BankC extends Bank {
	private double balance;

	public BankC() {

		balance = 2000;
	}

	public double getBalance() {
		return (balance);
	}

	public double applyInterest() {
		return getBalance() * (1 + rate);
	}
}
