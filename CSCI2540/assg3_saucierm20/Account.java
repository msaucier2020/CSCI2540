/*
 * @author - Madeleine Saucier
 * A class for a banking Account
 */
package assg3_saucierm20;

public class Account {

	private String acctNo;
	private double balance;
	
	/*
	 * constructor
	 * @param Account number
	 * sets balance to 0
	 */
	public Account(String givenNo) {
		acctNo = givenNo;
		balance = 0;
	}
	
	/*
	 * 2-parameter constructor
	 * @param Account number, Initial Account balance
	 * sets balance and Account number to given values
	 */
	public Account(String givenNo, double initBalance) {
		acctNo = givenNo;
		if(initBalance >= 0) {
			balance = initBalance;
		}
		else {
			System.out.println("Error: Invalid balance.\n");
		}
	}
	
	/*
	 * retrieve Account Number
	 * @return String with Account Number
	 */
	public String getAcctNo() {
		return acctNo;
	}
	
	/*
	 * retrieve Account Balance
	 * @return double value of Account Balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/*
	 * set the balance of an account
	 * @param value to set the balance to
	 */
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	/*
	 * deposit money into an account; if deposit value is negative, there is an error
	 * @param value to deposit
	 */
	public void deposit(double deposit) {
		if(deposit >=0) {
			balance += deposit;
		}
		else {
			System.out.println("Error: Invalid depost amount.\n");
		}
	}
	
	/*
	 * withdraw money from an account; if value is negative or if there is not enough money in account, there is an error
	 * @param value to withdraw
	 */
	public void withdraw(double withdraw) {
		if(withdraw <= 0) {
			System.out.println("Error: Invalid withdraw amount.\n");
		}
		else if(withdraw > balance) {
			System.out.println("Error: Not enough money in Account " + this.getAcctNo());
		}
		else {
			balance -= withdraw;
		}
	}
	
	/*
	 * transfer money from one account to another; if the transfer value is negative or if there is not enough money in this account, there is an error
	 * @param account to transfer to and amount to be transfered
	 */
	public void transfer(Account transferTo, double amount) {
		if(amount <= 0) {
			System.out.println("Error: Invalid transfer amaount.\n");
		}
		else if(amount > this.balance) {
			System.out.println("Error: Not enough money in Account " + this.getAcctNo());
		}
		else {
			this.withdraw(amount);
			transferTo.deposit(amount);
			System.out.println(amount + " transferred from account " + this.getAcctNo() + " to account " + transferTo.getAcctNo());

		}
	}
	
	/*
	 * display account number and current balance in the format "Account Number: \n Current Balance: "
	 */
	public void displayInfo() {
		System.out.println("Account Number: " + this.getAcctNo());
		System.out.println("Current Balance: " + this.getBalance()+ "\n");
	}

	/*
	 * return a string in the format "Account Number: \n Current Balance: "
	 * @return a string with the account info
	 */
	@Override
	public String toString() {
		return "Account Number: " + this.getAcctNo() + "\nCurrent Balance: " + this.getBalance() + "\n";
	}
	
	/*
	 * check to see if two accounts are equal
	 * @param Object to be compared with this account
	 * @return true if the accounts have same AcctNo
	 */
	@Override
	public boolean equals(Object a2) {
		if(a2 instanceof Account) {
			Account temp = (Account)a2;
			if(this.getAcctNo().equals(temp.getAcctNo())) {
				return true;
			}
		}
		return false;
	}
}
