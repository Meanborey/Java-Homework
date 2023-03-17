package interfacedemo;



public class Main {
    public static void main(String[] args) {
        BankServiceII creditAccount= new BankServiceII(new CreditCardAccount());
        creditAccount.deposit(1000);
        System.out.println("Credit Balance:"+creditAccount.showBalance()+"$");

        BankServiceII savingAccount = new BankServiceII(new SavingAccount());
        savingAccount.deposit(50);
        System.out.println("Saving Balance:"+savingAccount.showBalance()+"$");



    }
}
