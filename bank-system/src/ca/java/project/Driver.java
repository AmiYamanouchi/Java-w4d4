package ca.java.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public final static String DIVIDER = "---------------------------------------";
	
	public static void printInformation(User usr) {
		System.out.println(usr.toString());
		System.out.println(DIVIDER);
		System.out.println("The Bank Accounts List of "+ 
		usr.getFirstName() + " " + usr.getLastName() );
		System.out.println(DIVIDER);
		for(BankAccount b : usr.getAccounts()) {
			System.out.println(b.toString());
		}

	}
	
	public static User checkPostalCode(ArrayList<User> users, String postalCode) {
		for(User usr : users) {
			if(usr.getPostalCode().equalsIgnoreCase(postalCode)) {
				return usr;
			}
		}
		return null;
	}
	
	public static User getUser(ArrayList<User> users) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your postal code in the format of A1A 1A1");
		String pCode = input.nextLine();
		User returnedUser = checkPostalCode(users, pCode);
		
		while(returnedUser == null) {
			System.out.println("There is no user with this postal code. \nEnter your postal code in the format of A1A 1A1");
			
			pCode = input.nextLine();
			returnedUser = checkPostalCode(users, pCode);
		}
		
		return returnedUser;
		
	}
	
	public static int printInstruction() {
		Scanner input = new Scanner(System.in);
		System.out.println("What can I do for you ? Choose your option :");
		System.out.println("1. deposit \n2. withdraw \n3. quit");
		return input.nextInt();		
	}
	
	public static BankAccount getBankAccountFromUser(User usr) {
		Scanner input = new Scanner(System.in);
		BankAccount account = null;
		while(account == null ) {
			System.out.println("Enter your account number");
			int accNumEntered = input.nextInt();
			for(BankAccount b : usr.getAccounts()) {
				if(b.getAccountNumber() == accNumEntered) {
					account = b;
				}
			}
		}		
		return account;
	}
	
	public static double getAmountFromUser() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount that you want to do the transaction");
		return input.nextDouble();
	}
	
	public static void doTransaction(User usr) {
		int option = printInstruction();
		while(option != 3) {
			switch (option) {
			case 1:
				BankAccount depositAccount = getBankAccountFromUser(usr);
				double depositAmount = getAmountFromUser();
				depositAccount.deposit(depositAmount);
				printInformation(usr);
				break;
			case 2: 
				BankAccount withdrawAccount = getBankAccountFromUser(usr);
				double withdrawAmount = getAmountFromUser();
				withdrawAccount.withdraw(withdrawAmount);
				printInformation(usr);
				break;
			default: 
				System.out.println("Wrong Option");
			}
			System.out.println();
			option = printInstruction();
			
		}
		System.out.println("Thank you\nSee you later!");
		
		
	}

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		Scanner input = new Scanner(System.in);
		BankAccount b1 = new BankAccount(500, 2019, 1);
		BankAccount b2 = new BankAccount(700, 2020, 2);
		BankAccount b3 = new BankAccount(354.98, 2019, 11);
		User user1 = new User("John", "Doe", "V7R 3N4", "608 888 8888");
		user1.addBankAccount(b1);
		user1.addBankAccount(b2);
		user1.addBankAccount(b3);
		
		users.add(user1);
		
		
		User returnedUser = getUser(users);
		
		System.out.println(DIVIDER);
		printInformation(returnedUser);
		System.out.println(DIVIDER);
		
		doTransaction(returnedUser);
		
	}

}
