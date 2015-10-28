package problem2;

public class Email extends Document {
	
	public String sender, recipient, title;
	
	public Email()
	{
		
	}
	public void set_sender(String sender)
	{
		this.sender = sender;
	}
	public String get_sender()
	{
		return sender;
	}
	public void set_recipient(String recipient)
	{
		this.recipient = recipient;
	}
	public String get_recipient()
	{
		return recipient;
	}
	public void set_title(String title)
	{
		this.title = title;
	}
	public String get_title()
	{
		return title;
	}
	public String toString()
	{
		return sender + "\n"+ recipient+"\n"+title+"\n"+text;
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
