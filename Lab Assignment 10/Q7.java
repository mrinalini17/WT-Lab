/*Write a java program to create Account with 500 rupee minimum balance, deposit amount,
withdraw amount and also throws LessBalanceException which returns the statement that says
withdraw amount is not valid. */
// Custom exception
class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

// Account class
class Account {
    private int balance;

    public Account() {
        balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " rupees deposited. Current balance: " + balance + " rupees");
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (balance < amount) {
            throw new LessBalanceException("Withdrawal amount is not valid. Current balance: " + balance + " rupees");
        }
        balance -= amount;
        System.out.println(amount + " rupees withdrawn. Current balance: " + balance + " rupees");
    }
}

public class Q7 {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000); 
        try {
            account.withdraw(700);
            account.withdraw(500);
        } catch (LessBalanceException e) {
            System.out.println("Caught LessBalanceException: " + e.getMessage());
        }
    }
}
