package problem1;

public class Contact {
	
	String first_name, last_name, email_address, phone_number;
	
	public Contact(String first_name, String last_name, String email_address, String phone_number)
	{
		set_first_name(first_name);
		set_last_name(last_name);
		set_email_address(email_address);
		set_phone_number(phone_number);		
	}
	public void set_first_name(String first_name)
	{
		this.first_name = first_name;
	}
	public void set_last_name(String last_name)
	{
		this.last_name = last_name;
	}
	public void set_email_address(String email_address)
	{
		this.email_address = email_address;
	}
	public void set_phone_number(String phone_number)
	{
		this.phone_number = phone_number;
	}
	public String get_first_name()
	{
		return first_name;
	}
	public String get_last_name()
	{
		return last_name;
	}
	public String get_email_address()
	{
		return email_address;
	}
	public String get_phone_number()
	{
		return phone_number;
	}
	public String toString()
	{
		return ("first name: " + first_name+  "\n"+"last name: "+ last_name 
				+ "\n"+"email address: "+ email_address+"\n"+ "phone_number: "+ phone_number);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
