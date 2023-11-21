import java.util.Scanner;

class BankAccount {
    int balance = 5000;

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void showBalance() {
        System.out.println("Your balance is: " + balance);
    }
}

public class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        BankAccount account = new BankAccount();

        while (choice != 4) {
            System.out.println("CHOOSE FROM THE BELOW OPTIONS-");
            System.out.println("1. Withdraw amount");
            System.out.println("2. Deposit amount");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you want to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.println("Enter the amount you want to deposit:");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Please enter a valid option");
            }
        }
    }
}