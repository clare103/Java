package chapter9;

class Account
{
  private double balance;
        public Account()
        {
        	balance = 0;
        }
        public Account(double initialDeposit)
        {
              balance = initialDeposit;
        }
        public double getBalance()
        {
              return balance;
}
        // returns new balance or -1 if error
        public double deposit(double amount)
        {
        try{
if (amount < 0)
     throw new Exception("Deposit amount must be a positive number");
else
	balance+=amount;
        }
        catch(Exception e){
        	String message = e.getMessage();
        	System.out.println(message);
        }
return balance;
}
// returns new balance or -1 if invalid amount
public double withdraw(double amount)
{
	try{
if ((amount > balance) || (amount < 0))
     throw new Exception("Withdraw amount must be greater than 0 and the balance must be greater than withdraw amount.");
else
     balance -= amount;
	}catch(Exception g)
	{
		String message1 = g.getMessage();
		System.out.println(message1);
	}
return balance;
} 

public static void main(String[] args)
{
Account a = new Account(100);
a.getBalance();
a.deposit(-10);
a.deposit(100);
a.withdraw(-10);
a.withdraw(50);
System.out.println("Total balance: "+a.getBalance());
}
}