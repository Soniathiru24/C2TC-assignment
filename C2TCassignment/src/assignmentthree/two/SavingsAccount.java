package assignmentthree.two;


	class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.03; // 3% interest

	    public SavingsAccount(String accountHolder, int accountNumber, double initialBalance) {
	        super(accountHolder, accountNumber, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " into Savings Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from Savings Account.");
	        } else {
	            System.out.println("Insufficient funds in Savings Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance + (balance * INTEREST_RATE); // Including interest
	    }
	}


