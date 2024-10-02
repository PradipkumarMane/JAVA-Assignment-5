package Assignment1;

public class Bank {
	protected String name;
	protected static double rate = 0.05;
	protected double balance;
	//protected double result;

	public Bank() {
		name = "Bob";
		balance = 0;
	}

	public double getBalance() {
		return 0;
	}

	public double applyInterest() {
		return getBalance()*(1+rate); 
	}

	

}
