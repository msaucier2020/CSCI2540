/*
 * @author - Madeleine Saucier
 * Test Account, CheckingAccount, and SavingsAccount classes
 */
package assg3_saucierm20;

public class AccountTest {

	public static void main(String[] args) {
		
		System.out.println("******Test Account Classes******\n");
		
		Account a1 = new Account("A1001");
		Account a2 = new Account("A1002", 2070.65);
		Account a3 = new Account("A1003", 2500.76);
		
		
		CheckingAccount ca1 = new CheckingAccount("A2001");
		CheckingAccount ca2 = new CheckingAccount("A2002", 800.76, 200);
		CheckingAccount ca3 = new CheckingAccount("A2003");
		CheckingAccount ca4 = new CheckingAccount("A1001");
		
		SavingsAccount sa1 = new SavingsAccount("A3001");
		SavingsAccount sa2 = new SavingsAccount("A3002", 9107.83, 0.03);
		
		//constructors and display Info
		System.out.println("*Test constructors and displayInfo method:");
		a1.displayInfo();
		a2.displayInfo();
		ca1.displayInfo();
		ca2.displayInfo();
		ca3.displayInfo();
		sa1.displayInfo();
		sa2.displayInfo();
		
		
		//overdraft amount and fee
		System.out.println("\n*Test get/set overdraft fee: ");
		//use set for one and get for the other to make sure static is working correctly
		ca1.setFee(30);
		System.out.println("Overdraft fee: " + ca2.getFee());
		
		
		System.out.println("\n*Test get/set overdraft: ");
		System.out.println("Current overdraft for account " + ca3.getAcctNo() + ": " + ca3.getOverdraft());
		ca3.setOverdraft(100);
		System.out.println("New overdraft for account " + ca3.getAcctNo() + ": " + ca3.getOverdraft());
		
		
		//deposit
		System.out.println("\n*Test deposit method:");
		a1.deposit(350.98);
		ca1.deposit(760.55);
		sa1.deposit(4072.88);
		
		System.out.println("New balance for account " + a1.getAcctNo() +": " + a1.getBalance());
		System.out.println("New balance for account " + ca1.getAcctNo() +": " + ca1.getBalance());
		System.out.println("New balance for account " + sa1.getAcctNo() +": " + sa1.getBalance());
		
		
		//withdraw
		System.out.println("\n*Test withdraw methods:");
		a1.withdraw(360);
		a2.withdraw(300);
		ca1.withdraw(50);
		ca2.withdraw(810);
		ca3.withdraw(200);
		
		System.out.println("\nBalance for account " + a1.getAcctNo() +": " + a1.getBalance());
		System.out.println("Balance for account " + a2.getAcctNo() +": " + a2.getBalance());
		System.out.println("Balance for account " + ca1.getAcctNo() +": " + ca1.getBalance());
		System.out.println("Balance for account " + ca2.getAcctNo() +": " + ca2.getBalance());
		System.out.println("Balance for account " + ca3.getAcctNo() +": " + ca3.getBalance());
		
		//interest
		System.out.println("\n*Test get/set interest:");
		System.out.println("Current interest for account " + sa1.getAcctNo() + ": " + sa1.getInterestRate());
		sa1.setInterestRate(0.05);
		System.out.println("New interest for account " + sa1.getAcctNo() + ": " + sa1.getInterestRate());
		
		System.out.println("\n*Test add interest:");
		System.out.println("Current balance for account " + sa2.getAcctNo() + ": " + sa2.getBalance());
		sa2.addInterest();
		System.out.println("Balance after adding interest: " + sa2.getBalance());
		
		//transfer and toString
		System.out.println("\n*Test transfer methods: ");
		
		//both cases for account class
		a1.transfer(a2, 400);
		System.out.println(a1.toString());
		System.out.println(a2.toString());		
		
		a3.transfer(a1, 100);
		System.out.println(a3.toString());		
		System.out.println(a1.toString());	
	
		//all cases for checking class
		ca2.transfer(ca1, 90);
		System.out.println(ca2.toString());	
		System.out.println(ca1.toString());		
		
		ca3.transfer(ca2, 250);
		System.out.println(ca3.toString());
		System.out.println(ca2.toString());
		
		ca1.transfer(ca2, 500);
		System.out.println(ca1.toString());
		System.out.println(ca2.toString());
		
		//cases between savings and checking accounts
		sa1.transfer(ca3, 100);
		System.out.println(sa1.toString());
		System.out.println(ca3.toString());
		
		ca2.transfer(sa2, 67);
		System.out.println(ca2.toString());
		System.out.println(sa2.toString());
		
		ca3.transfer(sa2, 150);
		System.out.println(ca3.toString());
		System.out.println(sa2.toString());
		
		//equals
		System.out.println("\n*Test equals method:");
		if(a1.equals(ca4)) {
			System.out.println("Accounts " + a1.getAcctNo() + " and " + ca4.getAcctNo() + " are equal");	
			}
		else{
			System.out.println("Accounts " + a1.getAcctNo() + " and " + ca4.getAcctNo() + " are not equal");
		}
		
		if(ca1.equals(ca4)) {
			System.out.println("Accounts " + ca1.getAcctNo() + " and " + ca4.getAcctNo() + " are equal");	
			}
		else{
			System.out.println("Accounts " + ca1.getAcctNo() + " and " + ca4.getAcctNo() + " are not equal");
		}

	}
}
