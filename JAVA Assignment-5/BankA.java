package Assignment1;

public class BankA extends Bank {
	private double balance;

	public BankA() {
		super();
		balance = 1000;
	}

	public double getBalance() {
		return (balance);
	}

	public double applyInterest() {
		return getBalance() * (1 + rate);
	}

}
