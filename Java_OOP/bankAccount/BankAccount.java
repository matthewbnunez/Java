public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numOfAccounts = 0;
    public static double totalAccountBalance;

    public BankAccount(){
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        numOfAccounts++;
        totalAccountBalance = 0;
    }


    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }


    public void depositCheckingBalance(double deposit) {
        checkingBalance += deposit;
    }
    public void depositSavingsBalance(double deposit) {
        savingsBalance += deposit;
    }


    public void withdrawCheckingBalance(double withdraw) {
        if(withdraw > checkingBalance){
            System.out.println("Insufficient funds");
        } else {
            checkingBalance -= withdraw;
            System.out.println("$" + withdraw +" has been withdrawn");
        }
    }
    public void withdrawSavingsBalance(double withdraw) {
        if(withdraw < savingsBalance){
            System.out.println("Insufficient funds");
        } else {
            savingsBalance -= withdraw;
            System.out.println("$" + withdraw +" has been withdrawn");
        }
    }


    public void display() {
        System.out.println("There is " + numOfAccounts + " total account");
        totalAccountBalance = checkingBalance + savingsBalance;
        System.out.println("There is $" + totalAccountBalance + " in the account");
    }
}