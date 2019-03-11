public class Banking {

    private String accountNumber;   // I preferred String. Long or Int could be used as well.
    private String accountHolder;
    private String holderType;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getHolderType() {
        return holderType;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        this.balance += amount;
        System.out.println("Amount of Rs. " + amount + " was successfully deposited in your account.");
    }

    public void withdrawAmount(double amount) {
        if(this.balance > amount) {
            this.balance -= amount;
            System.out.println("Withdrawn Rs. " + amount);
        } else {
            System.out.println("Insufficient Fund !");
        }
    }
}
