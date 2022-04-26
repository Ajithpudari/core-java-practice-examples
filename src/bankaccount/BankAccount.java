package bankaccount;

public class BankAccount {
    int actNumber = 1234;
    double actBalance = 10000;
    public void withdrawAmount(double amount){
        if(amount > actBalance){
            System.out.println("low balance");
            return;
        }
        actBalance = actBalance - amount;
        System.out.println("withdraw successful amount is "+amount);

    }
    public void deposit(double amount){

        actBalance = actBalance + amount;
        System.out.println("deposit successful amount is "+amount);
    }
    public  void showAccntBalance(){
        System.out.println("AccountNumber: "+actNumber);
        System.out.println("AccountBalance:"+actBalance);

    }
}
