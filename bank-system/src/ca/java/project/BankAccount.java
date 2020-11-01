package ca.java.project;

public class BankAccount {
	
	private double balance;
	private int accountNumber;
	private int createdYear;
	private int createdMonth;
	
	public BankAccount(double balance, int createdYear,int createdMonth) {
		setBalance(balance);
		setAccountNumber();
		setCreatedYear(createdYear);
		setCreatedMonth(createdMonth);
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param deposit the deposit to set
	 */
	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			this.balance = 0;
		}
		
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber() {
		this.accountNumber = (int) (Math.floor((Math.random()*9001) + 1000));
	}

	/**
	 * @return the createdYear
	 */
	public int getCreatedYear() {
		return createdYear;
	}

	/**
	 * @param createdYear the createdYear to set
	 */
	public void setCreatedYear(int createdYear) {
		if (createdYear > 1900) {
			this.createdYear = createdYear;
		} else {
			this.createdYear = 1900;
		}
		
	}

	/**
	 * @return the createdMonth
	 */
	public int getCreatedMonth() {
		return createdMonth;
	}

	/**
	 * @param createdMonth the createdMonth to set
	 */
	public void setCreatedMonth(int createdMonth) {
		if(createdMonth<=12 && createdMonth>=1) {
			this.createdMonth = createdMonth;
		}else {
			this.createdMonth = 0;
		}
	}

	/*
	 * @param amount deposit amount
	 */
 	public void deposit(double amount) {
 		if (amount > 0) {
 			balance += amount;
 		} else {
 			System.err.println("The Amount should be greater than zero");
 		}
 		
 	}
	
 	/*
 	 * @param amount withdraw amount
 	 */
 	public void withdraw(double amount) {
 		if (amount < 0) {
 			System.err.println("The Amount should be greater than zero");
 		} else if (amount > balance) {
 			System.err.println("The Amount should be less than your balance");
 		} else {
 			balance -= amount;
 		}
 	}
	
	@Override
	public String toString() {			
		return "Account Number : " + accountNumber + 
				"  Balance : " + balance +
				"  Created Year : " + createdYear + 
				"  Created Month : " + createdMonth;
	}
	
	
	
}
