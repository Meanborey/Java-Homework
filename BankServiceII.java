package interfacedemo;

public class BankServiceII {

    private Account account;
    public BankServiceII(Account account){
        this.account=account;
    }
    public double showBalance(){
        return account.checkBalance();
    }
    public void withdrawMoney(double amount){
        account.withdraw(amount);
    }
    public void deposit(double amount){
        account.deposit(amount);
    }
}
