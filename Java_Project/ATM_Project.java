import java.util.*;

public class ATM_Project {

    public static void main(String[] args) {
        // Initialize variables
        int pin = 1234; // Default PIN
        int balance = 50000; // Default balance
        int AddAmount = 0; // Amount to add
        int TakeAmount = 0; // Amount to withdraw
        String name; // Account holder's name

        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter PIN
        System.out.println("Enter your PIN:");
        int password = sc.nextInt();

        // Check if PIN is correct
        if (pin == password) {
            // If PIN is correct, prompt the user to enter name
            System.out.println("Enter Your Name:");
            name = sc.next();
            System.out.println("Welcome " + name + "!");
            
            // Main menu loop
            while (true) {
                // Display menu options
                System.out.println("Enter 1 to check your Account balance");
                System.out.println("Enter 2 to add Amount to your account");
                System.out.println("Enter 3 to Take Amount");
                System.out.println("Enter 4 to take receipt");
                System.out.println("Enter 5 to EXIT");
                
                // Read user's choice
                int opt = sc.nextInt();

                // Process user's choice
                switch (opt) {
                    case 1:
                        // Check balance
                        System.out.println("Your Balance is " + balance);
                        break;
                    case 2:
                        // Add amount to balance
                        System.out.println("Enter Amount to add to your Account");
                        AddAmount = sc.nextInt();
                        balance += AddAmount;
                        System.out.println("Amount Added Successfully!");
                        break;
                    case 3:
                        // Withdraw amount from balance
                        System.out.println("Enter the Amount to Withdraw");
                        TakeAmount = sc.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Sorry! Insufficient Balance.");
                            continue; // Continue to the next iteration of the loop
                        } else {
                            System.out.println("Transaction Successful!");
                            balance -= TakeAmount;
                        }
                        break;
                    case 4:
                        // Print receipt
                        System.out.println("Welcome to mini ATM");
                        System.out.println("Available Balance: " + balance);
                        System.out.println("Amount Deposited: " + AddAmount);
                        System.out.println("Amount Withdrawn: " + TakeAmount);
                        System.out.println("Thanks for Coming! Have a Nice Day!");
                        break;
                    case 5:
                        // Exit the program
                        System.out.println("Thank You!");
                        sc.close(); // Close the Scanner
                        System.exit(0); // Exit the program
                    default:
                        // Handle invalid input
                        System.out.println("Please enter a number between 1 and 5");
                        break;
                }
            }

        } else {
            // If PIN is incorrect
            System.out.println("PIN is incorrect!");
        }
    }
}
