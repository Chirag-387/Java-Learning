package OOPs;

public class BankAccount {
    public static void main(String[] args) {
        
        Bank b1 = new Bank("Chirag", 73, 10000.50);
        b1.deposit(5000.25);
        b1.withdraw(3000);
        b1.checkBalance();
        b1.displaydDetails();

    }
}

class Bank {
    String accountHolder;
    int accountNumber;
    double balance;

    Bank(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void displaydDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
    }
}