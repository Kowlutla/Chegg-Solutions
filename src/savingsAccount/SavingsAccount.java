package savingsAccount;

public class SavingsAccount {
	double balance;

    double interest;

    public SavingsAccount(double balance, double interest)     {

        this.balance = balance;

        this.interest = interest;

    }

    public void withdraw(double amount){

        balance -= amount;

    }

    public void deposit(double amount){

        balance += amount;

    }

    public double addInterest(){

        double monthlyInterest = interest/12*balance;

        balance += monthlyInterest;

        return monthlyInterest;

    }

    public double getBalance() {

        return balance;

    }

    public double getInterest() {

        return interest;

    }

}
