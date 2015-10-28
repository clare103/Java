package problems;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;



public class Decrypt {
	
	String user, decrypted_string, encrypted_string, stripped_sent;
	String filename,file1,ext1;
	int offset, count1, count2, max;
	char[] user_converted;
	int user_value[];
	int int_value[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
	char[] user_deconverted;
	char[] alphabet = 
		{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'
			,'z'};
	char[] jumbled_alphabet = new char[26];
	char[] sample = {'a','b','c','d','e','e','e','f','f','g','h','i'};
	String sentence = "This is a reallly long sentance.";
	
	char[] stripped_sent1;// = stripped_sent.toCharArray();
	int size = stripped_sent1.length;
	char most_freq;
	
	
	public Decrypt()
	{
//		select_offset();
//		select();
//		convert_to_char_array();
//		set_user_converted(user_converted);
//		System.out.println(user_converted.length);
//		jumble_alphabet();
//		set_user_value_length();
//		set_int_of_user(user_converted, user_value, alphabet,int_value);
//		for(int i=0; i < user_value.length;i++)
//		{
//			System.out.print(user_value[i]+" ");
//		}
//		System.out.println();
//		decrypt_string(user_value,alphabet);
//		System.out.println(get_decrypted());
//		interchange_toEncrypt(user_value, user_converted, jumbled_alphabet);
//		get_encrypted_string();
//		System.out.println(encrypted_string);		
//		for(int i =0; i< 26; i++)
//		{
//			System.out.print(jumbled_alphabet[i]);
//		}
		//trim_char(sentence);
		stripped_sent = sentence.replaceAll("\\W", "");
		System.out.println(stripped_sent);
		//count_string(stripped_sent1, size);
		
	}
	public void set_count_to1()
	{
		count2= 1;
	}
	public void reset_count1()
	{
		count1= 0;
	}
	public void reset_count2()
	{
		count2=0;
	}
	public void add_count1()
	{
		count1++;
	}
	public void add_count2()
	{
		count2++;
	}
	public void set_count1(int offset)
	{
		count1 = offset;
	}
	public int get_count1()
	{
		return count1;
	}
	public int get_count2()
	{
		return count2;
	}
	public void set_encrypted_string(String encrypted_string)
	{
		this.encrypted_string = encrypted_string;		
	}
	public void get_encrypted_string()
	{
		String encrypted_string  = new String(user_converted);
		set_encrypted_string(encrypted_string);		
	}
	public void set_new_sent(String stripped_sent)
	{
		this.stripped_sent = stripped_sent;
	}
	public void convert_to_char_array()
	{
		user_converted = get_user().toCharArray();
	}
	public void set_user_converted(char[] user_converted)
	{
		this.user_converted = user_converted;
	}
	public void set_user_value_length()
	{
		user_value = new int[get_char_user().length];
	}
	public void set_user_value(int[] user_value)
	{
		this.user_value = user_value;
	}
	public char[] get_char_user()
	{
		return user_converted;
	}
	public void set_user(String user)
	{
		this.user = user;
	}
	public String get_user()
	{
		return user;
	}
	public void jumble_alphabet()
	{
		set_count1(get_offset());
		reset_count2();
		while(get_count1() != 26)
		{
			jumbled_alphabet[count2] = alphabet[count1];
			add_count2();
			add_count1();
		}
		reset_count1();
		while(get_count1() < get_offset())
		{
			jumbled_alphabet[count2] = alphabet[count1];
			add_count2();
			add_count1();
		}
	}
	public void trim_char(String sentence)
	{
		stripped_sent = sentence.replaceAll("\\W", "");
		set_new_sent(stripped_sent);
	}
	public void jumble_input(String user)
	{
		
	}
	
	public void set_decrypted(String decrypted_string)
	{
		String s = decrypted_string.substring(4, decrypted_string.length());
		this.decrypted_string = s;
	}
	public String get_decrypted()
	{
		return decrypted_string;
	}
	public void set_offset(int offset)
	{
		this.offset = offset;
	}
	public int get_offset()
	{
		return offset;
	}
	public void search_file(String filename)
	{
		
	}
	
	public static String searchForFile(File dir, String target)
	{
		String result = "";
		if(!dir.isDirectory())
			return "Path is not a directory.";
		for(File folderItem : dir.listFiles())
		{
			if(folderItem.isDirectory())
			{
				result = searchForFile(folderItem, target);
				if(!result.equals(""))
					return result;
						
			}
			else
			{
				if(folderItem.getName().equals(target))
					return folderItem.getAbsolutePath();
			}
		}
		return "";
	}
	
	public void get_File(String file1)
	{
		File rootFolder = new File(System.getProperty("user.home"));//this is the path for macs, for pc it is C:\\
		String result = searchForFile(rootFolder, file1);// the output on my program is "/Users/rossClare/Desktop/Eclipse:Java Stuff/numbers.txt
		if(!result.equals(""))
			System.out.println(result);
		else
			System.out.println("File not found");
	}
	
	public void select_file()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter which file you would like encrypted or decryped:(names.txt)");
		String file1 = keyboard.nextLine();
		set_file(file1);	
	}
	public void listFiles(String dir)//lists the files in a directory
	{
		File directory = new File(dir);
		
		if(!directory.isDirectory())
		{
			System.out.println("no directory provided");
			return;
		}
		
		FilenameFilter filefilter = new FilenameFilter()
		{
			
			public boolean accept(File dir, String name)
			{						
				return name.toLowerCase().endsWith(get_fileExt());
			}		
		};
		
		String[] filenames = directory.list(filefilter);
		
		for(String name : filenames)
		{
			if(!(name==""))
			{
				System.out.println(name);
				
			}
			else
			System.out.println("No such file with given extension exsists.");
		}
	}
	public void set_fileExt(String ext1)//setting the file extension for file filter
	{
		this.ext1 = ext1;
	}
	public String get_fileExt()
	{
		return ext1;
	}
	
	public void set_file(String file1)
	{
		this.file1 = file1;
	}
	public String get_file()
	{
		return file1;
	}
	
	public void select_offset()
	{
		Random generator = new Random();
		set_offset(generator.nextInt(26));
		System.out.println(get_offset());		
	}
	public void set_int_of_user(char[] user_converted,int[] user_value, char[] alphabet, int[] int_value)
	{
		for(int i=0; i < user_converted.length;i++)
		{
			for(int g =0; g< 26; g++)
			{					
				if(user_converted[i] == alphabet[g])
				{
					user_value[i] = int_value[g];
				}				
			}
		}
	}
	public void interchange_toEncrypt(int[] user_value, char[] a, char[] b)
	{	
		for(int i =0; i < user_converted.length; i++)
		{
			a[i] = b[user_value[i]];
		}
	}
	public void interchange_toDecrypt(int offset, int i, char[] a, char[] b)
	{
		a[i] = b[b.length - offset];
	}
	public void decrypt_string(int[] a, char[] b)
	{
		for(int i =0; i< a.length; i++)
		{
			for(int g=0; g<b.length; g++)
			{
				if(a[i] == g)
				{
					decrypted_string += b[g];
				}
			}
		}
		set_decrypted(decrypted_string);
	}
	
		public void count_string(char []a, int size)
		{
			System.out.println("Letter   Count");
			
			for(int i =0; i< size; i++)
			{
				set_count_to1();
				for(int g = i+1; g< size; g++)
				{
					if(a[i] == a[g])
					{
						count2++;
						if(count2 > max)
						{
							max = count2;
							most_freq = a[i];
						}
						for(int k = g; k< size-1; k++)
						{
							a[k] = a[k+1];
												
						}
						g--;
						size--;
						
					}
					
				}
				System.out.println(a[i] +"   "+ count2);
				reset_count2();
			}
			System.out.println("The most freq is: "+ most_freq);
			System.out.println("and occurs this many times:"+ max);
		}	
	
	public void select()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a string you would like encrypted: ");
		user = keyboard.nextLine();
		set_user(user);	
	}
	
	public void display()
	{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Decrypt a = new Decrypt();
a.display();

	}

}
