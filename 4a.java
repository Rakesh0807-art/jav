4) a) Design, Develop and Implement a Java program to calculate the interest amount based on the rate of interest defined for different banks using the concept of interface. Also calculate and display the maturity amount.

public interface FixedDeposit {
	
	double getMAmount();
	void calculateInterest();
	void getDetails();

}

public class CanaraBank implements FixedDeposit{
	
	Scanner s = new Scanner(System.in);
	String name;
	double principal;
	double period;
	double roi = 8.5;
	double interestAmt;
	
	public void getDetails()
	{
		System.out.println("Enter your name");
		name = s.nextLine();
		System.out.println("Enter the Principal amount");
		principal = s.nextDouble();
		System.out.println("Enter the period of deposit");
		period = s.nextDouble();
	}
	
	public void calculateInterest() {
		
		interestAmt = (principal*period*roi)/100;
		
	}
	
	public double getMAmount() {
		
		double totalBalance;
		totalBalance = principal+interestAmt;
		return totalBalance;
	}
	
}

public class SBI implements FixedDeposit{
	
	Scanner s = new Scanner(System.in);
	String name;
	double principal;
	double period;
	double roi = 8.75;
	double interestAmt;
	
	public void getDetails()
	{
		System.out.println("Enter your name");
		name = s.nextLine();
		System.out.println("Enter the Principal amount");
		principal = s.nextDouble();
		System.out.println("Enter the period of deposit");
		period = s.nextDouble();
	}
	
	public void calculateInterest() {
		
		interestAmt = (principal*period*roi)/100;
		
	}
	
	public double getMAmount() {
		
		double totalBalance;
		totalBalance = principal+interestAmt;
		return totalBalance;
	}

}
public class TestBank {

	public static void main(String[] args) {
		
		double mAmount;
		SBI s = new SBI();
		CanaraBank cb = new CanaraBank();
		
		s.getDetails();
		s.calculateInterest();
		mAmount = s.getMAmount();
		System.out.println("Dear "+s.name+" your Maturity Amount in SBI Bank is "+mAmount);
		
		cb.getDetails();
		cb.calculateInterest();
		mAmount = cb.getMAmount();
		System.out.println("Dear "+s.name+" your Maturity Amount in Canara Bank is "+mAmount);
		
	}

}
