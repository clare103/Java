package problems;

public class CreditCardPayment extends Payment {

	public String card_name;
	public String expiration_date;
	public int card_number;
	
	public CreditCardPayment()
	{
		
	}
	public void set_card_name(String card_name)
	{
		this.card_name = card_name;
	}
	public void set_expiration_date(String expiration_date)
	{
		this.expiration_date = expiration_date;
	}
	public void set_card_number(int card_number)
	{
		this.card_number = card_number;
	}
	public void paymentDetails()
	{
		System.out.println("The card name ="+card_name+"." +
				"\nThe expiration date ="+ expiration_date+
				".\nThe card number ="+card_number);
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
