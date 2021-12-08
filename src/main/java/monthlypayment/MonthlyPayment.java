package monthlypayment;

import java.util.Scanner;

import com.util.UtilClass;


public class MonthlyPayment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle value : ");
		double p = sc.nextDouble();
		System.out.println("Enter the Year : ");
		double y = sc.nextDouble();
		System.out.println("Enter the  interest rate :");
		double  r = sc.nextDouble();
		//UtilClass obj2 = new UtilClass();
		sc.close();
		
		System.out.println( "payment "+ UtilClass.monthlyPayment(p, y, r));

	}

}