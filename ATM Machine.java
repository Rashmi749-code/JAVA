import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        while (true) {
            System.out.println("\nCurrent Balance: " + balance);
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance!");
            }

            if (balance == 0) {
                System.out.println("Balance is zero. Exiting...");
                break;
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using ATM!");
                break;
            }
        }

        sc.close();
    }
}
