package problem1;
import java.util.*;
public class Ch2Ex9 {
private int q;
private double total;
private double price;
private String name;

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
Scanner keyboard1 = new Scanner(System.in);
Scanner keyboard2 = new Scanner(System.in);
String empty = "";
System.out.println("Input name of item 1:");
String name1 = keyboard.nextLine();
System.out.println("Input quantity of item 1");
int quantity1 = keyboard.nextInt();
System.out.println("Input price of item 1");
double price1 = keyboard.nextDouble();
System.out.println("Input name of item 2:");
String name2 = keyboard1.nextLine();
System.out.println("Input quantity of item 2:");
int quantity2=keyboard1.nextInt();
System.out.println("Input price of item 2: ");
double price2 = keyboard1.nextDouble();
System.out.println("Input name of item 3:");
String name3 = keyboard2.nextLine();
System.out.println("Input quantity of item 3:");
int quantity3 = keyboard2.nextInt();
System.out.println("Input price of item 3:");
double price3 = keyboard2.nextDouble();

double total1 = price1 * quantity1;
double total2 = price2 * quantity2;
double total3 = price3 * quantity3;
double subtotal = total1+ total2 + total3;
double salestax = subtotal * .0625;
String salestax1 = "6.25% sales tax";
double finaltotal = subtotal + salestax;

System.out.println("Your bill:");
System.out.println();
System.out.printf("Item%30sQuantity%10sPrice%10sTotal%n", empty,empty,empty);
System.out.printf(name1+"%25s"+quantity1+"%16s"+"%.2f"+"%11s"+"%.2f %n",empty,empty,price1,empty,total1);
System.out.printf(name2+"%25s"+quantity2+"%17s"+"%.2f"+"%11s"+"%.2f %n",empty,empty,price2,empty,total2);
System.out.printf(name3+"%21s"+quantity3+"%16s"+"%.2f"+"%11s"+"%.2f %n",empty,empty,price3,empty,total3);
System.out.println();
System.out.printf("Subtotal"+"%59s"+"%.2f %n",empty,subtotal);
System.out.printf("%s"+"%53s"+"%.2f %n",salestax1,empty, salestax);
System.out.printf("Total"+"%62s"+"%.2f",empty,finaltotal);
	}

}
