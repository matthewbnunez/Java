public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.depositCheckingBalance(250.75);
        account1.depositSavingsBalance(150.65);
        account1.display();
        BankAccount account2 = new BankAccount();
        account2.depositSavingsBalance(750.25);
        account2.withdrawCheckingBalance(65.92);
        account2.display();
    }
}