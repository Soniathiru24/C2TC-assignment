package assignmentthree.two;

public class BankSystem {
	
	    public static void main(String[] args) {
	        // Creating accounts
	        SavingsAccount sa = new SavingsAccount("Sonia", 2001, 5000);
	        CheckingAccount ca = new CheckingAccount("kaviya", 3001, 3000);

	        // Performing operations on Savings Account
	        sa.deposit(1000);
	        sa.withdraw(2000);
	        sa.displayAccountInfo();
	        System.out.println("Total with Interest: ₹" + sa.getBalance());
	        System.out.println();

	        // Performing operations on Checking Account
	        ca.deposit(1500);
	        ca.withdraw(5000);  // within overdraft
	        ca.displayAccountInfo();
	        System.out.println("Available Balance: ₹" + ca.getBalance());
	    }
	}


