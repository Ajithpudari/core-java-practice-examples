package bankaccount;

public class BankDemo {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount();
        System.out.println("account balance is");
        b1.showAccntBalance();
        System.out.println("deposit is");
        b1.deposit(1200);
        b1.showAccntBalance();
        System.out.println("withdrawing");
        b1.withdrawAmount(800);
        b1.showAccntBalance();
    }
}
