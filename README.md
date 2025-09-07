💳
_****Banking Application for Account Management****_

A  simple  Banking Application in Java that allows users to create and manage bank accounts.
This project highlights Object-Oriented Programming (OOP) principles, arrays, string handling, and control structures in Java.

🚀 Features

1. Create new bank accounts

2. Deposit money into an account

3. Withdraw money from an account

4. View account details

5. Update email and phone number

6. Menu-driven user interface for easy navigation

🏗️ Project Structure

1. Account Class → Defines account properties and operations: deposit, withdraw, update contact, and display details.

2. UserInterface Class → Provides a menu-driven interface and manages multiple accounts.

3. Main Class → Entry point of the application.

⚙️ Technologies Used

Java (Core Java)

1) OOP Principles → Encapsulation, Classes & Objects

2) Arrays / ArrayList for storing accounts

3) Strings for handling names, emails, and phone numbers

4) Control Structures → if-else, switch-case, loops

5) Scanner Class for user input

📊 UML Class Diagram
classDiagram
    class Account {
        - int accountNumber
        - String accountHolderName
        - double balance
        - String email
        - String phoneNumber
        + Account(String, double, String, String)
        + deposit(double)
        + withdraw(double)
        + displayAccountDetails()
        + updateContactDetails(String, String)
        + getAccountNumber() int
    }

    class UserInterface {
        - ArrayList<Account> accounts
        - Scanner scanner
        + UserInterface()
        + createAccount()
        + performDeposit()
        + performWithdrawal()
        + showAccountDetails()
        + updateContact()
        + mainMenu()
    }

    class Main {
        + main(String[]) static
    }

    UserInterface "1" --> "*" Account
    Main "1" --> "1" UserInterface

📌 Sample Run
-Banking App -
1. Create account
2. Deposit
3. Withdraw
4. View account
5. Update contact
6. Exit
Enter choice: 1

--- Create Account ---
Name: John Doe
Initial deposit: 1000
Email: john@example.com
Phone: 9876543210
Account created. Number: 1001

- Banking App -
1. Create account
2. Deposit
3. Withdraw
4. View account
5. Update contact
6. Exit
Enter choice: 2

--- Deposit ---
Account number: 1001
Amount: 500
Deposited 500.0. Balance: 1500.0

- Banking App -
1. Create account
2. Deposit
3. Withdraw
4. View account
5. Update contact
6. Exit
Enter choice: 3

--- Withdraw ---
Account number: 1001
Amount: 200
Withdrawn 200.0. Balance: 1300.0

- Banking App -
1. Create account
2. Deposit
3. Withdraw
4. View account
5. Update contact
6. Exit
Enter choice: 4

--- Account Details ---
Account Number: 1001
Name: John Doe
Balance: 1300.0
Email: john@example.com
Phone: 9876543210

- Banking App -
1. Create account
2. Deposit
3. Withdraw
4. View account
5. Update contact
6. Exit
Enter choice: 6
Goodbye!


