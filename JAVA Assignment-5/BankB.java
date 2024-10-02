package Assignment1;

public class BankB extends Bank {

	private double balance;

	public BankB() {

		balance = 1500;
	}

	public double getBalance() {
		return (balance);
	}

	public double applyInterest() {
		return getBalance() * (1 + rate);
	}

}
