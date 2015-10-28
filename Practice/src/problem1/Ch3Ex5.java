package problem1;
import java.text.DecimalFormat;
public class Ch3Ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat newFormat = new DecimalFormat("#.##");
		double loan = 1000;
		int count=0;
		double t_interest= 0;
		int monthly =50;
		double interestrate = 0.015;

		while(loan>0)
		{


double interestpaid=0;
double deductible=0;

		interestpaid = loan * interestrate;
		deductible = monthly - interestpaid;
		loan = loan - deductible;
		t_interest = t_interest + interestpaid;
		count = count + 1;
	
}
		double twoDecimal = Double.valueOf(newFormat.format(t_interest));
		System.out.println("$"+twoDecimal+" dollars paid in interest." );
		System.out.println("It took "+count+" months to pay of the debt.");;
		
}
}