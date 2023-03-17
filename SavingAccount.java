package interfacedemo;

public class SavingAccount implements Account{

    private double balance;
    private float interestRats;
    SavingAccount(){
        balance = 10;
        interestRats = 50;
    }
    @Override
    public void withdraw(double amount) {
        if (amount<=balance){
            balance -=amount;
        }else {
            System.out.println("Insufficient balance!!");
        }
    }

    @Override
    public void deposit(double amount) {

balance+=amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return (balance*(interestRats/100));
    }
}
