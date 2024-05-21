
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500.00;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overriding the withdraw() method to impose a withdrawal limit
    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal amount exceeds the limit of $" + WITHDRAWAL_LIMIT);
        } else if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 1.50;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    // Overriding the withdraw() method to impose a withdrawal fee
    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + WITHDRAWAL_FEE;
        if (amount > 0 && totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrew: $" + amount + " (including fee of $" + WITHDRAWAL_FEE + ")");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance for fee.");
        }
    }
}

// Main class to test the functionality
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create instances of each subclass
        BankAccount savings = new SavingsAccount(1000.00);
        BankAccount checking = new CheckingAccount(1000.00);

        // Test deposit and withdraw methods
        savings.deposit(200.00);
        savings.withdraw(600.00); // Should be limited
        savings.withdraw(300.00);

        checking.deposit(100.00);
        checking.withdraw(50.00); // Should include fee
        checking.withdraw(1100.00); // Should fail due to insufficient funds

        // Print final balances
        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Checking Account Balance: $" + checking.getBalance());
    }
}
