import java.util.Random;
public class BankAccount {
    //private String accountNumber; 
    private double checkingBalance; 
    private double savingBalance;
    private static int numberOfAccounts = 0;
    private static double totalSavingAccountsBalance = 0;
    private static double totalCheckingAccountsBalance = 0;
    private long accountNumber;

    public BankAccount ()
    {
        this.accountNumber = getRandomAccountNumber();
        numberOfAccounts++;
    }
    private void setAccountNumber(long accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    public long getAccountNumber() 
    {
        return accountNumber;
    }
    public long getRandomAccountNumber()
    {
        long lowerLimit = 1000000000L;
        long upperLimit = 9999999999L;
        Random r = new Random();
        long number = lowerLimit + ((long)(r.nextDouble()*(upperLimit-lowerLimit)));
        return number;
    }
    private void setCheckingBalance(double checkingBalance) 
    {
        this.checkingBalance = checkingBalance;
    }
    public double getCheckingBalance() 
    {
        return checkingBalance;
    }
    private void setSavingBalance(double savingBalance) 
    {
        this.savingBalance = savingBalance;
    }
    public double getSavingBalance() 
    {
        return savingBalance;
    }
    public static void setNumberOfAccounts(int numberOfAccounts) 
    {
        BankAccount.numberOfAccounts = numberOfAccounts;
    }
    public static int getNumberOfAccounts() 
    {
        return numberOfAccounts;
    }

    public void depositToSavingAccount(double amount) 
    {
        setSavingBalance(getSavingBalance() + amount);
        totalSavingAccountsBalance += amount;
    }

    public void depositToCheckingAccount(double amount) 
    {
        setCheckingBalance(getCheckingBalance() + amount);
        totalCheckingAccountsBalance += amount;
    }

    public void withdrawFromSavingAccount(double amount) 
    {
        if (amount < getSavingBalance()) {
            setSavingBalance(getSavingBalance() - amount);
            totalSavingAccountsBalance -= amount;
        } 
        else 
        {
            System.out.println("Not enough credit in saving account..");
        }
    }
    public void withdrawFromCheckingAccount(double amount) 
    {
        if (amount < getCheckingBalance()) {
            setCheckingBalance(getCheckingBalance() - amount);
            totalCheckingAccountsBalance -= amount;
        } 
        else 
        {
            System.out.println("Not enough credit in checking account..");
        }
    }
    public static double getTotalSavingAccountsBalance() 
    {
        return totalSavingAccountsBalance;
    }

    public static double getTotalCheckingAccountsBalance() 
    {
        return totalCheckingAccountsBalance;
    }

    public static void displayTotalBalances() 
    {
        System.out.println("Saving accounts total balance is: " + getTotalSavingAccountsBalance());
        System.out.println("Checking accounts total balance is: " + getTotalCheckingAccountsBalance());
    }
    
}