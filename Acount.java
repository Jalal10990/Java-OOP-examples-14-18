// Account class in Java
class Account {
    // Data member (attribute)
    private double balance;

    // No-argument constructor (default balance = 0)
     Account() {
        this.balance = 0;
    }

    // Constructor with initial balance
     Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Initial balance cannot be negative.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }

    // Method to display account details
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Creating an account with no-argument constructor
        Account acc1 = new Account();
        System.out.println("Account 1 (Default Constructor):");
        acc1.displayBalance();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        System.out.println();

        // Creating an account with an initial balance of 1000
        Account acc2 = new Account(1000);
        System.out.println("Account 2 (Parameterized Constructor):");
        acc2.displayBalance();
        acc2.withdraw(300);
        acc2.deposit(700);
        acc2.displayBalance();
    }
}
