//Student Name: Gabryle Antonie Pitogo
//BSCS II
import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        BankAccount bank = new BankAccount(0,"",100.00);
        int x, num = 0;
        double y;
        String name;
        boolean loop = true;

        System.out.println("Bank Account System");
        System.out.println("--------------------------");
        System.out.println("Enter Account Name: ");
        name = scan.nextLine();
        System.out.println("Enter Account Number: ");
        num = scan.nextInt();
        bank.setName(name);
        bank.setAccountNumber(num);
        
        do {
            System.out.println("\nSelect Option");
            System.out.println("--------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("0. Exit");
            System.out.println("--------------------------");
            x = scan.nextInt();

            switch (x) {
                case (1):
                    System.out.println("Deposit -> Enter Ammount: ");
                    y = scan.nextDouble();
                    bank.deposit(y);
                    break;
                case (2):
                    System.out.println("Withdraw -> Enter Ammount: ");
                    y = scan.nextDouble();
                    bank.withdraw(y);
                    break;
                case (3):
                    System.out.println("Account Number: " + bank.getAccountNumber() + " Account Name: " + bank.getName());
                    bank.displayBalance();
                    break;
                case (0):
                    loop = false;
                    break;
            }
        }
        while (loop == true);
        scan.close();
    }
}

class BankAccount {
    int accountNumber;
    String name;
    double balance;
    BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    //Setters
    public int setAccountNumber(int accountNumber) {
        return this.accountNumber = accountNumber;
    }
    public String setName(String name) {
        return this.name = name;
    }
    //Getters
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    // End of Getters
    public void deposit(double x) {
        balance += x;
    }
    public void withdraw(double x) {
        balance = balance - x;
    }
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}