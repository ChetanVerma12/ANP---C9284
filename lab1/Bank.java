package lab1;

class Bank {
    
    private double amount;

    // we use  constructor to declare amount with 10000
    public Bank(double amount) {
        this.amount = amount;
    }

    // function to withdraw money from the account
    
    public void withdraw(double withdrawalAmount) {
    
        // We are using ternary operator to check
        amount = (amount >= withdrawalAmount) ? (amount - withdrawalAmount) : amount;
        
        System.out.println((amount >= withdrawalAmount) ? "Withdraw successful": "Insufficient balance");
    }

    // function to deposit money into the account
    
    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    // function to display the current balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    public static void main(String[] args) {
    
        // Create a Bank object with  amount of 10000
        
        Bank bank = new Bank(10000);

        // Attempt to withdraw money
        
        bank.withdraw(3000);

        // Deposit money into the account
        
        bank.deposit(5000);

        // Display the final balance
        
        bank.displayBalance();
        }
    }