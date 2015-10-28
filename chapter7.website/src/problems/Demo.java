package problems;

public class Demo {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

CashPayments a = new CashPayments();
CashPayments b = new CashPayments();
a.set_payment_amount(101);
a.paymentDetails();
b.set_payment_amount(99);
b.paymentDetails();
CreditCardPayment c = new CreditCardPayment();
c.set_card_name("David Clare");
c.set_card_number(123413413);
c.set_expiration_date("11/05/1989");
c.paymentDetails();
CreditCardPayment d = new CreditCardPayment();
d.set_card_name("Ross Clare");
d.set_card_number(12324245);
d.set_expiration_date("11/05/1989");
d.paymentDetails();




		
		
	}

}
