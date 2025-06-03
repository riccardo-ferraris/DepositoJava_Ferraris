public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void setAccountHolderName(String newName) {
        this.accountHolderName = newName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(this.getBalance() + amount);
        } else
            System.out.println("\nInserisci un valore maggiore di 0.");
    }

    public void withdraw(double amount) {
        if (this.getBalance() >= amount) {
            setBalance(this.getBalance() - amount);
        } else
            System.out.println("\nNon hai abbastanza fondi.");
    }

    public void displayBalance() {
        System.out.println("\nIl saldo attuale è di: " + this.getBalance());
    }
}
