package assignmentthree.two;

abstract class Account {
	// Abstract class Account
	
	    protected String accountHolder;
	    protected int accountNumber;
	    protected double balance;

	    // Constructor
	    public Account(String accountHolder, int accountNumber, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Abstract methods to be implemented by subclasses
	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double getBalance();

	    // Concrete method common to all accounts
	    public void displayAccountInfo() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: " + balance);
	    }
	}


