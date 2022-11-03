/*
 * @author - Madeleine Saucier
 * A class for a Savings Account
 */

package assg3_saucierm20;

public class SavingsAccount extends Account{

	double interestRate;
	
	/*
	 * 1 parameter constructor, sets interest rate to 0
	 * @param Account number
	 */
	public SavingsAccount(String givenNo) {
		super(givenNo);
		interestRate = 0;
	}
	
	/*
	 * 3 parameter constructor
	 * @param Account number, initial balance, interest rate
	 */
	public SavingsAccount(String givenNo, double initBalance, double givenInterest) {
		super(givenNo, initBalance);
		interestRate = givenInterest;
	}
	
	/*
	 * retrieve interest rate
	 * @return interest value as a double
	 */
	public double getInterestRate() {
		return interestRate;
	}
	
	/*
	 * set interest rate
	 * @param  new interest rate as a double
	 */
	public void setInterestRate(double newInterest) {
		interestRate = newInterest;
	}
	
	/*
	 * add interest to the account balance
	 * balance = (1+interest)*balance
	 */
	public void addInterest() {
		this.setBalance((1+interestRate)*this.getBalance());
	}
	
	/*
	 * return a String in format of: "Account number:\n Current balance:\n Interest rate:\n"
	 * @return string stating Savings Account info
	 */
	@Override
	public String toString() {
		return "Account Number: " + this.getAcctNo() + "\nCurrent Balance: " + this.getBalance() + "\nInterest Rate: " + this.getInterestRate() + "\n";
	}
	
	/*
	 * display account number and current balance in the format "Account Number: \n Current Balance: \n Interest Rate: "
	 */
	@Override
	public void displayInfo() {
		System.out.println("Account Number: " + this.getAcctNo());
		System.out.println("Current Balance: " + this.getBalance());
		System.out.println("Interest Rate: " + this.getInterestRate() + "\n");
	}
}
