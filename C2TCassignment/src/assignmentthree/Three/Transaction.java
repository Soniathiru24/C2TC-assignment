package assignmentthree.Three;

public interface Transaction {
	// Transaction class with final method and variable
	
	    // Fixed fee per transaction (cannot be changed)
	    private static final double transactionFee = 15.00;

	    // Final method - cannot be overridden
	    public final void performTransaction(Account account, String type, double amount) {
	        System.out.println("\n--- Transaction Start ---");

	        if (type.equalsIgnoreCase("deposit")) {
	            if (amount <= transactionFee) {
	                System.out.println("Amount too low to cover transaction fee.");
	            } else {
	                account.deposit(amount - transactionFee);
	                System.out.println("Transaction fee of ₹" + transactionFee + " deducted from deposit.");
	            }
	        } else if (type.equalsIgnoreCase("withdraw")) {
	            account.withdraw(amount + transactionFee);
	            System.out.println("Transaction fee of ₹" + transactionFee + " added to withdrawal.");
	        } else {
	            System.out.println("Invalid transaction type.");
	        }

	        System.out.println("Updated Balance: ₹" + account.getBalance());
	        System.out.println("--- Transaction End ---");
	    }
	}


