package problem1;
import java.util.*;
import java.io.*;
public class Ch4Ex13 {

	String[] bundle1 = new String[3];
	String[] bundle2 = new String[3];
	String[] bundle3 = new String[3];
	int choice,choice_original,choice_list;
	String item1,item2,item3,item4,item5;
	String[] bundle = {item1, item2, item3, item4, item5};
	String filename;
	
	public Ch4Ex13()
	{
		
	}
	public void BoxOfProduce(String[] bundle1, String[] bundle2, String[] bundle3)
	{
		set_bundle1(bundle1);
		set_bundle2(bundle2);
		set_bundle3(bundle3);
	}
	public void set_bundle1(String[] bundle1)
	{
		readFile();
		for(int i = 0; i < 3; i++)
		{		
		
		int contents =(int)(Math.random()*5)+1;
		
		if(contents == 1)
			bundle1[i] = get_item1();
		else if(contents == 2)
			bundle1[i] = get_item2();
		else if(contents == 3)
			bundle1[i] = get_item3();
		else if(contents == 4)
			bundle1[i] = get_item4();
		else
			bundle1[i] = get_item5();
		}
		this.bundle1 = bundle1;
		
	}
	public void set_bundle2(String[] bundle2)
	{
		readFile();
		for(int i = 0; i < 3; i++)
		{					
		int contents2 =(int)(Math.random()*5)+1;
		
		if(contents2 == 1)
			bundle2[i] = get_item1();
		else if(contents2 == 2)
			bundle2[i] = get_item2();
		else if(contents2 == 3)
			bundle2[i] = get_item3();
		else if(contents2 == 4)
			bundle2[i] = get_item4();
		else
			bundle2[i] = get_item5();
		}
		this.bundle2 = bundle2;
		
	}
	public void set_bundle3(String[] bundle3)
	{
		readFile();
		for(int i = 0; i < 3; i++)
		{					
		int contents =(int)(Math.random()*5)+1;
		
		if(contents == 1)
			bundle3[i] = get_item1();
		else if(contents == 2)
			bundle3[i] = get_item2();
		else if(contents == 3)
			bundle3[i] = get_item3();
		else if(contents == 4)
			bundle3[i] = get_item4();
		else
			bundle3[i] = get_item5();
		}
		this.bundle3 = bundle3;
	}
	public String[] get_bundle1()
	{
		return bundle1;
	}
	public String[] get_bundle2()
	{
		return bundle2;
	}
	public String[] get_bundle3()
	{
		return bundle3;
	}
	public void set_choice_original(int choice_original)
	{
		this.choice_original = choice_original;
	}
	public void set_choice_list(int choice_list)
	{
		this.choice_list = choice_list;
	}
	public int get_choice_original()
	{
		return choice_original;
	}
	public int get_choice_list()
	{
		return choice_list;
	}
	public void set_item1(String item1)
	{
		this.item1 = item1;
	}
	public void set_item2(String item2)
	{
		this.item2 = item2;
	}
	public void set_item3(String item3)
	{
		this.item3 = item3;
	}
	public void set_item4(String item4)
	{
		this.item4 = item4;
	}
	public void set_item5(String item5)
	{
		this.item5 = item5;
	}
	public String get_item1()
	{
		return item1;
	}
	public String get_item2()
	{
		return item2;
	}
	public String get_item3()
	{
		return item3;
	}
	public String get_item4()
	{
		return item4;
	}
	public String get_item5()
	{
		return item5;
	}
	public void set_choice(int choice)
	{
		this.choice = choice;
	}
	public int get_choice()
	{
		return choice;
	}
	public String toString()
	{
		return bundle1 + "\n"+ bundle2+ "\n"+bundle3;
	}
	public void set_filename(String filename)
	{
		this.filename= filename;
	}
	public void readFile()
	{
		try 
		{
				String filename = "bundle.txt";
				String desktop = System.getProperty("user.home")+"/Desktop/"+ filename;
				Scanner in = new Scanner(new FileInputStream(desktop));
				
					item1 = in.next();
					set_item1(item1);
					in.nextLine();
					item2 = in.next();
					set_item2(item2);
					in.nextLine();
					item3 = in.next();
					set_item3(item3);
					in.nextLine();
					item4 = in.next();
					set_item4(item4);
					in.nextLine();
					item5 = in.next();
					set_item5(item5);
											
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}
	public void select_bundle()
	{
		boolean check = true;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please select which bundle you would like:(1-3) ");
		int choice = keyboard.nextInt();
		while(check)
		{					
		if(choice <0 || choice >3 )
		{
			System.out.println("Invalid choice");
		}
		else if(choice == 1)
		{
			check = false;
			set_choice(choice);
			 System.out.println(get_bundle1());
		}
		else if (choice == 2)
		{
			check = false;
			set_choice(choice);
			System.out.println(get_bundle2());
		}
		else		
		{
			check = false;
			set_choice(choice);
			System.out.println(get_bundle3());
		}
		}
	}
	public void set_contents(String[] bundle)
	{
		bundle[0]=get_item1();
		bundle[1]=get_item2();
		bundle[2]=get_item3();
		bundle[3]=get_item4();
		bundle[4]=get_item5();
		
	}
	public void get_contents()
	{
		System.out.println("What item would you like to switch?[0-4]");
		System.out.println("The contents of the bundle are: ");
		for(int i =0; i<bundle.length;i++)
		{
			System.out.println(i+": "+bundle[i]);
		}
	}
	public void swap_options1(int choice_original, int choice_list)
	{
		if(choice_original == 0 && choice_list == 0)
			bundle1[0] = bundle[0];
		else if(choice_original == 0 && choice_list == 1)
			bundle1[0] = bundle[1];
		else if(choice_original == 0 && choice_list == 2)
			bundle1[0] = bundle[2];
		else if(choice_original == 0 && choice_list == 3)
			bundle1[0] = bundle[3];
		else if(choice_original == 0 && choice_list == 4)
			bundle1[0] = bundle[4];
		else if(choice_original == 1 && choice_list == 0)
			bundle1[1] = bundle[0];
		else if (choice_original == 1 && choice_list == 1)
			bundle1[1] = bundle[1];
		else if(choice_original == 1 && choice_list == 2)
			bundle1[1] = bundle[2];
		else if(choice_original == 1 && choice_list == 3)
			bundle1[1] = bundle[3];
		else if(choice_original == 1 && choice_list == 4)
			bundle1[1] = bundle[4];
		else if(choice_original == 2 && choice_list == 0)
			bundle1[2] = bundle[0];
		else if(choice_original == 2 && choice_list == 1)
			bundle1[2] = bundle[1];
		else if(choice_original == 2 && choice_list == 2)
			bundle1[2] = bundle[2];
		else if(choice_original == 2 && choice_list == 3)
			bundle1[2] = bundle[3];
		else if(choice_original == 2 && choice_list == 4)
			bundle1[2] = bundle[4];
		else
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	public void swap_options2(int choice_original, int choice_list)
	{
		if(choice_original == 0 && choice_list == 0)
			bundle2[0] = bundle[0];
		else if(choice_original == 0 && choice_list == 1)
			bundle2[0] = bundle[1];
		else if(choice_original == 0 && choice_list == 2)
			bundle2[0] = bundle[2];
		else if(choice_original == 0 && choice_list == 3)
			bundle2[0] = bundle[3];
		else if(choice_original == 0 && choice_list == 4)
			bundle2[0] = bundle[4];
		else if(choice_original == 1 && choice_list == 0)
			bundle2[1] = bundle[0];
		else if (choice_original == 1 && choice_list == 1)
			bundle2[1] = bundle[1];
		else if(choice_original == 1 && choice_list == 2)
			bundle2[1] = bundle[2];
		else if(choice_original == 1 && choice_list == 3)
			bundle2[1] = bundle[3];
		else if(choice_original == 1 && choice_list == 4)
			bundle2[1] = bundle[4];
		else if(choice_original == 2 && choice_list == 0)
			bundle2[2] = bundle[0];
		else if(choice_original == 2 && choice_list == 1)
			bundle2[2] = bundle[1];
		else if(choice_original == 2 && choice_list == 2)
			bundle2[2] = bundle[2];
		else if(choice_original == 2 && choice_list == 3)
			bundle2[2] = bundle[3];
		else if(choice_original == 2 && choice_list == 4)
			bundle2[2] = bundle[4];
		else
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	public void swap_options3(int choice_original, int choice_list)
	{
		if(choice_original == 0 && choice_list == 0)
			bundle3[0] = bundle[0];
		else if(choice_original == 0 && choice_list == 1)
			bundle3[0] = bundle[1];
		else if(choice_original == 0 && choice_list == 2)
			bundle3[0] = bundle[2];
		else if(choice_original == 0 && choice_list == 3)
			bundle3[0] = bundle[3];
		else if(choice_original == 0 && choice_list == 4)
			bundle3[0] = bundle[4];
		else if(choice_original == 1 && choice_list == 0)
			bundle3[1] = bundle[0];
		else if (choice_original == 1 && choice_list == 1)
			bundle3[1] = bundle[1];
		else if(choice_original == 1 && choice_list == 2)
			bundle3[1] = bundle[2];
		else if(choice_original == 1 && choice_list == 3)
			bundle3[1] = bundle[3];
		else if(choice_original == 1 && choice_list == 4)
			bundle3[1] = bundle[4];
		else if(choice_original == 2 && choice_list == 0)
			bundle3[2] = bundle[0];
		else if(choice_original == 2 && choice_list == 1)
			bundle3[2] = bundle[1];
		else if(choice_original == 2 && choice_list == 2)
			bundle3[2] = bundle[2];
		else if(choice_original == 2 && choice_list == 3)
			bundle3[2] = bundle[3];
		else if(choice_original == 2 && choice_list == 4)
			bundle3[2] = bundle[4];
		else
		{
			System.out.println("Fatal error");
			System.exit(0);
		}
	}
	
		public void get_swap_options()
		{
			if(get_choice() == 1)
			{
				swap_options1(get_choice_original(), get_choice_list());
				System.out.println("The final contents of the bundle are: ");
				for(int i = 0; i<3; i++)
				{
					System.out.println(i+": "+ bundle1[i]);
				}
			}
			else if(get_choice() == 2)
			{
				swap_options2(get_choice_original(), get_choice_list());
				System.out.println("The final contents of the bundle are: ");
				for(int i=0; i<3;i++)
				{
					System.out.println(i+": "+bundle2[i]);
				}
			}
			else
			{
				swap_options3(get_choice_original(),get_choice_list());
				System.out.println("The final contents of the bundle are: ");
				for(int i=0; i<3;i++)
				{
					System.out.println(i+": "+bundle3[i]);
				}
			}
		}
	
	public void swap()
	{
		Scanner keyboard = new Scanner(System.in);
		select_bundle();
		System.out.println("Would you like to swap any of the items from the selected bundle?(yes/no)");
		String answer= keyboard.next();
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("Which item would you like to swap?[0-2]");
			int choice_original = keyboard.nextInt();
			set_choice_original(choice_original);
			set_contents(bundle);
			get_contents();
			int choice_list = keyboard.nextInt();
			set_choice_list(choice_list);
			get_swap_options();
		}
			
		else
		{
			System.out.println("good bye!");
			System.exit(0);
		}

	}
	public void print_bundle()
	{
		System.out.println("1: Bundle1 contents are:");
		for(int i = 0;i<3;i++)
		{
			System.out.println(bundle1[i]);
		}
		System.out.println();
		System.out.println("2: Bundle2 contents are: ");
		for(int j = 0;j<3;j++)
		{
			System.out.println(bundle2[j]);
		}
		System.out.println();
		System.out.println("3: Bundle3 contents are: ");
		for(int g = 0; g<3;g++)
		{
			System.out.println(bundle3[g]);
		}
	
	}
	public void final_print()
	{
		Ch4Ex13 d = new Ch4Ex13();
		d.BoxOfProduce(bundle1,bundle2,bundle3);
		d.print_bundle();
		d.swap();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ch4Ex13 c = new Ch4Ex13();
c.final_print();
	}

}
