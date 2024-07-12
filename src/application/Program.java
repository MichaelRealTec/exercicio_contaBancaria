package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
public class Program {

	public static void main(String[] args) {
		// ContaBancaria
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numberAccount;
		String nameAccount;
		double deposit;
		double withdraw;
		char depositInitial;
		
		
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		numberAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		nameAccount = sc.nextLine();
		account.setNumberAccount(numberAccount);
		account.setNameAccount(nameAccount);
		System.out.print("Is there na initial deposit (y/n)? ");
		depositInitial = sc.next().charAt(0);
		while(depositInitial != 'y' && depositInitial != 'n') {
			System.out.print("Is there na initial deposit (y/n)? ");
			depositInitial = sc.next().charAt(0);
		}
		if(depositInitial == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
		} else {
			deposit = 0.00;
		}
		account.setDeposit(deposit);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		account.setDeposit(deposit);
		System.out.print("Update account data: ");
		System.out.println();
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		account.setWithdraw(withdraw);
		System.out.println("Update account data: ");
		System.out.println(account.toString());
		
		
		
		sc.close();
	}

}
