import java.util.*;

// Account class to store customer details
class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;

        if (balance <= 0) {
            System.out.println("Initial balance must be greater than 0. Setting balance = 100.");
            this.balance = 100;
        } else {
            this.balance = balance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (amount > balance - 100) { 
            System.out.println("Not enough balance! Minimum balance must be 100.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void showInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Bank class to manage multiple accounts
class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    // Add new account
    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println(" Account added successfully!");
    }

    // Find account by account number
    public Account findAccount(String accNum) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accNum))
                return a;
        }
        return null;
    }

    // Remove account
    public void removeAccount(String accNum) {
        Account acc = findAccount(accNum);
        if (acc != null) {
            accounts.remove(acc);
            System.out.println(" Account removed successfully!");
        } else {
            System.out.println(" Account not found!");
        }
    }
}

// ATM Menu class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Account Info");
            System.out.println("5. Remove Account");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double bal = sc.nextDouble();
                    sc.nextLine();
                    bank.addAccount(new Account(name, accNum, bal));
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextLine();
                    Account acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter deposit amount: ");
                        double amt = sc.nextDouble();
                        sc.nextLine();
                        acc.deposit(amt);
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextLine();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter withdraw amount: ");
                        double amt = sc.nextDouble();
                        sc.nextLine();
                        acc.withdraw(amt);
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextLine();
                    acc = bank.findAccount(accNum);
                    if (acc != null) {
                        acc.showInfo();
                    } else {
                        System.out.println(" Account not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter account number to remove: ");
                    accNum = sc.nextLine();
                    bank.removeAccount(accNum);
                    break;

                case 6:
                    System.out.println("💳 Thank you for using ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
