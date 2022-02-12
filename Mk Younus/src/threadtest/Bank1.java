package threadtest;

class Bank2{
	int accBal = 25000;

	void withdrawn(String name, int withdrawal) {
		if (accBal >= withdrawal) {
			System.out.println(name + " withdrawn " + withdrawal);
			accBal -= withdrawal;
			System.out.println("Balance after withdrwal : " + accBal);
		}

		else {
			System.out.println(name + " you cannot withdraw " + withdrawal);
			System.out.println("Your Balance is: " + accBal);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	void deposit(String name, int deposit) {
		System.out.println(name + " deposited " + deposit);
		accBal += deposit;
		System.out.println("Balance after deposit is : " + accBal);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class Bank1 {

	public static void main(String[] args) {
		Bank2 obj = new Bank2();
		obj.withdrawn("Yunus", 20000);
		obj.withdrawn("rohit", 1000);
		obj.deposit("Yunus", 2000);

	}

}
