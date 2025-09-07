import java.util.Scanner;

// Creating Account Class
class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String email;
    private String phoneNumber;

    // Make Constructor
    public Account(int accountNumber, String accountHolderName, double balance, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Adding Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Must be positive.");
        }
    }

    // Adding Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Must be positive.");
        }
    }

    // For  Displaying  Account Details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }

    // To Update Contact Details
    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated successfully.");
    }

    // To use Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }
}

// Creating User Interface Class
class UserInterface {
    private Account[] accounts;
    private int accountCount;
    private Scanner sc;

    public UserInterface(int size) {
        accounts = new Account[size];
        accountCount = 0;
        sc = new Scanner(System.in);
    }

    // For  New Account Creation
    public void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double balance = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        int accNo = 1000 + accountCount + 1;
        accounts[accountCount] = new Account(accNo, name, balance, email, phone);
        System.out.println("Account created successfully with Account Number: " + accNo);
        accountCount++;
    }

    // To Find Account by Number
    private Account findAccount(int accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    // For Deposit Operation
    public void performDeposit() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // For Withdrawal Operation
    public void performWithdrawal() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // To Show Account Details
    public void showAccountDetails() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.displayAccountDetails();
        } else {
            System.out.println("Account not found.");
        }
    }

    // To Update Contact
    public void updateContact() {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new email: ");
        String email = sc.nextLine();

        System.out.print("Enter new phone number: ");
        String phone = sc.nextLine();

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.updateContactDetails(email, phone);
        } else {
            System.out.println("Account not found.");
        }
    }

    // For  Main Menu
    public void mainMenu() {
        int choice;
        do {
            System.out.println("\nWelcome to the Banking Application!");
            System.out.println("1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: performDeposit(); break;
                case 3: performWithdrawal(); break;
                case 4: showAccountDetails(); break;
                case 5: updateContact(); break;
                case 6: System.out.println("Exiting application. Goodbye!"); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }
}

// For Main Class
public class BankingApp {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(50); 
        ui.mainMenu();
    }
}

