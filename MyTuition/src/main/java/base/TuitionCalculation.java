package base;
import java.util.Scanner;
import java.lang.Math;
public class TuitionCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Initial Tuition Cost: ");
		double init = input.nextFloat();
		
		System.out.print("Annual Percentage Rate(APR): ");
		float apr = input.nextFloat();
		
		System.out.print("Payment Term (Years): ");
		float term = input.nextFloat();
		
		//System.out.println(init);
		
		System.out.print("Percentage Increase: ");
		float percIncrease = input.nextFloat();
		
		TuitionCalculation.tuitCalc( apr, term, init, percIncrease);
	}
	public static double tuitCalc(double apr,double term,double init, double percIncrease) {
		double total = 0;
		for(float i=0; i < 4;i++){
			init += init*(percIncrease);
			total += init;
		}
		double monthlyRate = apr / 12;
		double payments = term * 12;
		double amortization = (monthlyRate*total*(Math.pow((1+monthlyRate),payments)))/((Math.pow((1+monthlyRate),payments))-1);
		//System.out.println(total);
		System.out.printf("You will pay $" +"%.2f",amortization);
		System.out.print(" per month");
		return amortization;

	}

}
