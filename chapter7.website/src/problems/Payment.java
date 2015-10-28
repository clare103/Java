package problems;

public class Payment {
	
	public double payment_amount;
	
	public Payment()
	{
		
	}
	public void set_payment_amount(double payment_amount)
	{
		this.payment_amount = payment_amount;
	}
	public double get_payment_amount()
	{
		return payment_amount;
	}
	public void paymentDetails()
	{
		if(get_payment_amount() < 100)
			System.out.println("The payment is less than 100$.");
		else			
			System.out.println("The amount of payment is more than 100$");
	}
	public void display()
	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
