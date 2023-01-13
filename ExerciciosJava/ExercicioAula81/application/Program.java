package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountBank;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBank accountBank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		

		double firstDepositValue = 0.0;

		System.out.print("Is there an inicitial deposit (y/n) ? ");
		String validateFirstDeposit = sc.nextLine();

		if (validateFirstDeposit.equals("y")) {

			System.out.print("Enter initial deposit value: ");
			firstDepositValue = sc.nextDouble();

			accountBank = new AccountBank(accountNumber, name, firstDepositValue);
		}
		else {
			
			accountBank = new AccountBank(accountNumber, name);
		}
		

		System.out.println("\nAccount Data: \n" + accountBank);

		System.out.print("\nEnter a Deposit value: ");
		double depositValue = sc.nextDouble();
		sc.nextLine();
		accountBank.deposit(depositValue);

		System.out.println("\nUpdate Account Data: \n" + accountBank);

		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		sc.nextLine();
		accountBank.withdraw(withdrawValue);

		System.out.println("\nUpdate Account Data: \n" + accountBank);
		
		System.out.println("fazendo um test");

		sc.close();
	}

}
