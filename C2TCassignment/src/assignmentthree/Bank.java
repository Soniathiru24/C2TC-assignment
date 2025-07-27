package assignmentthree;


	public class Bank {
	    // Static variable shared among all instances
	    private static int totalAccounts = 0;

	    // Instance variables
	    private String accountHolderName;
	    private int accountNumber;

	    // Constructor to create a new bank account
	    public Bank(String accountHolderName, int accountNumber) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        totalAccounts++; // Increase total accounts when a new account is created
	    }

	    // Static method to get total number of accounts
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    // Display account details
	    public void displayAccount() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	    }

	    // Main method to test the program
	    public static void main(String[] args) {
	        Bank acc1 = new Bank("Sonia", 1001);
	        Bank acc2 = new Bank("Raj", 1002);
	        Bank acc3 = new Bank("Meena", 1003);

	        acc1.displayAccount();
	        acc2.displayAccount();
	        acc3.displayAccount();

	        // Call static method using class name
	        System.out.println("\nTotal Bank Accounts Created: " + Bank.getTotalAccounts());
}
	}
	    
