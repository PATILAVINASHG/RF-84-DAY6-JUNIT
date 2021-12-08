package com.util;

public class UtilClass {
	
	public  static String dayOfWeek(int d0){
		
	String day = null ;
	switch (d0 ) {
	case 0 :
	  day = "sunday";
	  break ;
	case 1:
		day =" monday";
	 break;
	case 3:
		day = "tuesday";
		break;
		
	case 4:
		day ="Wednesday";
		break;
	case 5:
		day = "Thursday";
		break;
	case 6:
		day = "friday";
	case 7:
		day = "satarday";
		break;	
		
		}
		return day;
		
	}
	/////for temperature conversion
	
	
	
 	public static int temperaturConversion(int tem, char t) {
		int conver;
		if (t == 'c' || t == 'C') {
			conver = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			conver = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		return conver;
	}
	
 	// for Monthly salary
 	
	public static double monthlyPayment(double p, double y, double r) {
	double n = 12 * y;
	double r0 = r / (12 * 100);
	double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
	
	return payment;
	 
 	}
 	
 	
 	
	public static double sqrt(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			
			t = (c / t + t) / 2;
		}

		return t;
	}
 	
  }