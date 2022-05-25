package savingsAccount;

public class Driver {
	 public static void main(String[] args) {

	        /* This is the testing function!

	         * Creates 3 Accounts and prints in the required form!

	         */
	        SavingsAccount account1 = new SavingsAccount(500.0, 0.0); 
	        //to store the intial balance of account1
	        int amount1=(int)account1.getBalance();
	        account1.deposit(100);
	        account1.withdraw(50);

	        SavingsAccount account2 = new SavingsAccount(500.0, 0.12);
	        //to store the intial balance of account2
	        int amount2=(int)account2.getBalance();
	        account2.deposit(100); account2.withdraw(50);

	        SavingsAccount account3 = new SavingsAccount(500.0, 0.24);
	        //to store the intial balance of account3
	        int amount3=(int)account3.getBalance();
	        account3.deposit(100); account3.withdraw(50);

	        double int1 =account1.addInterest();
	        double int2 =account2.addInterest();
	        double int3 = account3.addInterest();

	        System.out.println("Starting Annual Interest Ending ");
	        System.out.println(" -----------------------------------------------------------------------------------------------");
	        System.out.println("|\t"+"Balance\t\tint. \trate\tMonths\tDeposits\tWithdrawals\tEarned Balance\t|");

	        System.out.println("|\t"+amount1 + "\t\t" +(int)account1.getInterest() + "\t1" + "\t100\t" + "50\t\t" + (int)int1 +"\t\t" + (int)account1.balance+"\t\t|");
	        
	        System.out.println("|\t"+amount2 + "\t\t" +account2.getInterest() + "\t1" + "\t100\t" + "50\t\t" + int2 +"\t\t" + account2.balance+" \t\t|");

	        System.out.println("|\t"+amount3 + "\t\t" + account3.getInterest() + "\t1" + "\t100\t" + "50\t\t" + (int)int3 +"\t\t" + (int)account3.balance+" \t\t|");

	        System.out.println(" -----------------------------------------------------------------------------------------------");
	    }

}
