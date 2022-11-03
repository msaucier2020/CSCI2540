/*
 * @author - Madeleine Saucier
 * A class for a Checking Account
 */
package assg3_saucierm20;

public class CheckingAccount extends Account {
	
	double overdraft;
	static double FEE;
	
	/*
	 * 1 parameter constructor, sets overdraft to 0
	 * @param Account number
	 */
	public CheckingAccount(String givenNo) {
		super(givenNo);
		overdraft = 0;
	}
	
	/*
	 * 3 parameter constructor
	 * @param Account number, initial balance, overdraft amount
	 */
	public CheckingAccount(String givenNo, double initBalance, double givenOverdraft) {
		super(givenNo, initBalance);
		overdraft = givenOverdraft;
	}
	
	/*
	 * retrieve overdraft amount
	 * @return Overdraft value as a double
	 */
	public double getOverdraft() {
		return overdraft;
	}
	
	/*
	 * set overdraft amount
	 * @param Overdraft value to be set to
	 */
	public void setOverdraft(double overAmount) {
		overdraft = overAmount;
	}
	
	/*
	 * retrieve fee amount
	 * @return fee value as a double
	 */
	public double getFee() {
		return FEE;
	}
	
	/*
	 * set fee amount
	 * @param value fee is to be set to
	 */
	public void setFee( double feeAmount) {
		FEE = feeAmount;
	}
	
	/*
	 * return a String in format of: "Account number:\n Current balance:\n Overdraft amount:\n"
	 * @return string stating Checking Account info
	 */
	@Override
	public String toString() {
		return "Account Number: " + this.getAcctNo() + "\nCurrent Balance: " + this.getBalance() + "\nOverdraft Amount: " + this.getOverdraft() + "\n";
	}
	
	/*
	 * withdraw money from an account; if value is negative or balance lower than overdraft limit, there is an error
	 * if balance goes into negative, overdraft fee is charged
	 * @param value to withdraw
	 */
	@Override
	public void withdraw(double withdrawAmnt) {
		if(withdrawAmnt <= 0) {
			System.out.println("Error: Invalid withdraw amount.\n");
		}
		else if((this.getBalance() - withdrawAmnt - FEE) < (overdraft * -1)) {
			System.out.println("Error: Not enough money in Account " + this.getAcctNo());
		}
		else {
			this.setBalance(this.getBalance()- withdrawAmnt);
			
			if(this.getBalance() < 0) {
				this.setBalance(this.getBalance()- FEE);		
				System.out.println("Overdraft fee charged to account " + this.getAcctNo());
				}
		}
	}
	
	/*
	 * transfer money from one account to another; 
	 * if the transfer value is negative or if there is not enough money in this account after overdraft fee, there is an error
	 * if value of account goes into negative, fee is charged
	 * @param account to transfer to and amount to be transfered
	 */
	@Override
	public void transfer(Account transferTo, double amount) {
		if(amount <= 0) {
			System.out.println("Error: Invalid transfer amaount.\n");
		}
		else if((this.getBalance() - amount - FEE) < (overdraft*-1)) {
			System.out.println("Error: Not enough money in Account " + this.getAcctNo());
		}
		else {
			transferTo.deposit(amount);
			this.withdraw(amount);
			System.out.println(amount + " transferred from account " + this.getAcctNo() + " to account " + transferTo.getAcctNo());
		}
	}
		
	/*
	 * display account number and current balance in the format "Account Number: \n Current Balance: \n Overdraft Amount: "
	 */
	@Override
	public void displayInfo() {
		System.out.println("Account Number: " + this.getAcctNo());
		System.out.println("Current Balance: " + this.getBalance());
		System.out.println("Overdraft Amount: " + this.getOverdraft()+ "\n");
	}
}
