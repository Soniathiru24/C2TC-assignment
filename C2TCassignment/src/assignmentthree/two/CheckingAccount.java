package assignmentthree.two;


	// CheckingAccount inherits from Account
	class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 1000; // Allow overdraft up to ₹1000

	    public CheckingAccount(String accountHolder, int accountNumber, double initialBalance) {
	        super(accountHolder, accountNumber, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " into Checking Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance + OVERDRAFT_LIMIT) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from Checking Account.");
	        } else {
	            System.out.println("Overdraft limit exceeded in Checking Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}


