import java.util.Scanner;

// Abstract class — defines the contract
abstract class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Abstract methods — subclasses must implement
    abstract double getInterestRate();
    abstract String getAccountType();

    // Concrete methods — shared logic
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✔ Deposited ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("✘ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✔ Withdrawn ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("✘ Insufficient funds or invalid amount.");
        }
    }

    public void applyInterest() {
        double interest = balance * getInterestRate() / 100;
        balance += interest;
        System.out.printf("✔ Interest Applied @ %.1f%% → +₹%.2f | New Balance: ₹%.2f%n",
                getInterestRate(), interest, balance);
    }

    public void displayInfo() {
        System.out.println("------------------------------");
        System.out.println("Account Type   : " + getAccountType());
        System.out.println("Account Holder : " + accountHolder);
        System.out.printf("Balance        : ₹%.2f%n", balance);
        System.out.printf("Interest Rate  : %.1f%%%n", getInterestRate());
        System.out.println("------------------------------");
    }

    public double getBalance() { return balance; }
    public String getAccountHolder() { return accountHolder; }
}

// Concrete class 1
class SavingsAccount extends BankAccount {
    public SavingsAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    public double getInterestRate() { return 4.0; }

    @Override
    public String getAccountType() { return "Savings Account"; }
}

// Concrete class 2
class CurrentAccount extends BankAccount {
    public CurrentAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    public double getInterestRate() { return 1.5; }

    @Override
    public String getAccountType() { return "Current Account"; }
}

// Concrete class 3
class FixedDepositAccount extends BankAccount {
    public FixedDepositAccount(String holder, double balance) {
        super(holder, balance);
    }

    @Override
    public double getInterestRate() { return 7.5; }

    @Override
    public String getAccountType() { return "Fixed Deposit Account"; }

    @Override
    public void withdraw(double amount) {
        System.out.println("✘ Withdrawals not allowed in Fixed Deposit Account.");
    }
}

// Main Application
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== BANK ACCOUNT SYSTEM ==========");
        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.print("Choice: ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ₹");
        double initialBalance = sc.nextDouble();

        // Abstraction in action — using BankAccount reference
        BankAccount account;
        switch (type) {
            case 1 -> account = new SavingsAccount(name, initialBalance);
            case 2 -> account = new CurrentAccount(name, initialBalance);
            case 3 -> account = new FixedDepositAccount(name, initialBalance);
            default -> {
                System.out.println("Invalid choice. Defaulting to Savings.");
                account = new SavingsAccount(name, initialBalance);
            }
        }

        System.out.println("\n✔ Account Created Successfully!");
        account.displayInfo();

        boolean running = true;
        while (running) {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Apply Interest");
            System.out.println("4. View Account Info");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ₹");
                    account.deposit(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ₹");
                    account.withdraw(sc.nextDouble());
                }
                case 3 -> account.applyInterest();
                case 4 -> account.displayInfo();
                case 5 -> {
                    System.out.println("Thank you for banking with us. Goodbye!");
                    running = false;
                }
                default -> System.out.println("✘ Invalid option.");
            }
        }

        sc.close();
    }
}