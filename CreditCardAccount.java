package interfacedemo;

public class CreditCardAccount implements Account{

    private double balance;
    private  float interestRats;
    private double limitCard;

    CreditCardAccount(){
        balance=20;
        interestRats=30;
        limitCard= 1000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount<=limitCard){
            if (amount<=balance){
                balance-=amount;
            }else {
                System.out.println("Insufficient balance!!!");
            }
        }else {
            System.out.println("Amount exceed the limit!!!!");
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
        return balance*(interestRats/100);
    }
}
