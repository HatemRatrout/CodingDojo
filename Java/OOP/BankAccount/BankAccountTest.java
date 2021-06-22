public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        account1.depositToSavingAccount(1000);
        account2.depositToSavingAccount(750);

        System.out.println("== Number of accounts ==");
        System.out.println("Number of Bank Accounts: " + BankAccount.getNumberOfAccounts());
        System.out.println("");

        System.out.println("== Accounts numbers ==");
        System.out.println("First account number is: " + account1.getAccountNumber());
        System.out.println("Second account number is: " + account2.getAccountNumber());
        System.out.println("Third account number is: " + account3.getAccountNumber());
        System.out.println("");

        System.out.println("== Deposit/Withdraw on saving accounts ==");
        account1.depositToSavingAccount(500);
        account1.withdrawFromSavingAccount(350);
        account2.depositToSavingAccount(800);
        account2.withdrawFromSavingAccount(280);
        System.out.println(account1.getSavingBalance());
        System.out.println(account2.getSavingBalance());
        System.out.println("");

        System.out.println("== Deposit/Withdraw on checking accounts ==");
        account1.depositToCheckingAccount(3000);
        account1.withdrawFromCheckingAccount(300);
        account2.depositToCheckingAccount(1000);
        account2.withdrawFromCheckingAccount(400);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account2.getCheckingBalance());
        System.out.println("");
        
        System.out.println("== Bank Account Balances ==");
        BankAccount.displayTotalBalances();
        System.out.println("");
    }
}