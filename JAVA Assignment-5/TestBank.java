package Assignment1;

public class TestBank {

	public static void main(String[] args) {

		Bank bank = new BankA();
		Bank bank1 = new BankB();
		Bank bank2 = new BankC();

		System.out.println("Bank A");
		System.out.println("Balance : $" + bank.getBalance());
		System.out.println("Balance is " + bank.applyInterest());
		System.out.println("Bank B");
		System.out.println("Balance : $" + bank1.getBalance());
		System.out.println("Balance is " + bank1.applyInterest());
		System.out.println("Bank C");
		System.out.println("Balance : $" + bank2.getBalance());
		System.out.println("Balance is " + bank2.applyInterest());
	}

}
