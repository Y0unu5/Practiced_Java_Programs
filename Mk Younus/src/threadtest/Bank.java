package threadtest;

class ATM {
	synchronized public void checkBalance(String name) {
		System.out.print(name + " " + "Checking...");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Balance");
	}

	synchronized public void Withdraw(String name, int amount) {
		System.out.print(name + " " + "Withdrawing...");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}
		System.out.println(amount);
	}
}

class Customer extends Thread {
	String name;
	int amount;
	ATM atm;

	public Customer(String name, ATM a, int amount) {

		this.name = name;
		this.amount = amount;
		this.atm = a;
	}

	public void useATM() {
		atm.checkBalance(name);
		atm.Withdraw(name, amount);
	}

	@Override
	public void run() {
		useATM();
	}

}

public class Bank {

	public static void main(String[] args) {
		ATM atm1 = new ATM();
		int atm;
		Customer c1 = new Customer("John", atm1, 3000);
		Customer c2 = new Customer("Smith", atm1, 4000);
		c1.start();
		c2.start();
	}

}
