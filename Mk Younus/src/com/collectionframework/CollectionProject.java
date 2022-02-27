package com.collectionframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
	String accNo;
	String accName;
	double balance;

	public Account() {

	}

	public Account(String accNo, String accName, double balance) {

		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account No:" + accNo + "\nName :" + accName + "\nBalance :" + balance + "\n";
	}

}

public class CollectionProject {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		Account acc = null;

		HashMap<String, Account> hm = new HashMap<>();

		try {
			FileInputStream fis = new FileInputStream("Accounts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			int count = ois.readInt();
			for (int i = 0; i < count; i++) {
				acc = (Account) ois.readObject();
				System.out.println(acc);
				hm.put(acc.accNo, acc);

			}
			fis.close();
			ois.close();
		} catch (Exception e) {

		}

		FileOutputStream fos = new FileOutputStream("Accounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		System.out.println("Menu");

		int choice;
		String accNo, accName;
		double balance;

		do {
			System.out.println("1. Create Account");
			System.out.println("2. Delete Account");
			System.out.println("3. View Account");
			System.out.println("4. View All Accounts");
			System.out.println("5. Save Account");
			System.out.println("6. Exit");
			System.out.println("Enter your choice");
			choice = in.nextInt();
			in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			switch (choice) {
			case 1:
				System.out.println("Enetr detais account no, name,balance");
				accNo = in.nextLine();
				accName = in.nextLine();
				balance = in.nextDouble();
				acc = new Account(accNo, accName, balance);
				hm.put(acc.accNo, acc);
				System.out.println("Account created for " + accName);
				break;
			case 2:
				System.out.println("Enter accNo");
				in.nextLine();
				accNo = in.nextLine();
				hm.remove(accNo);
				break;
			case 3:
				System.out.println("Enter acNo");
				accNo = in.nextLine();
				hm.get(accNo);
				System.out.println(acc);
				break;
			case 4:
				for (Account a : hm.values())
					System.out.println(a);
				break;
			case 5:
			case 6:
				oos.writeInt(hm.size());
				for (Account a : hm.values())
					oos.writeObject(a);
			}
		} while (choice != 6);
		oos.flush();
		oos.close();

	}

}
