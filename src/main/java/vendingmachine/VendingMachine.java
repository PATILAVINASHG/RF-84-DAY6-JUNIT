package vendingmachine;

import java.util.Scanner;

public class VendingMachine 
{
  	static int i=0;
  	static int total=0;
  	static int[] notes = {1000, 500, 100, 50, 7, 5, 2, 1};
  	static int money;

  	// Function for Calculating the notes
  	public static  int calculate(int money,int[]notes )
  	{
  		//calling calculate Function
        int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				// logic for Calculating The notes
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}//end of method

	public static void main(String[] args)
	{
       
		Scanner u1 =new Scanner(System.in);
		
		System.out.print("Enter the Amount:");
		money =u1.nextInt();

		VendingMachine.calculate(money,notes);
		System.out.println("Total Number of Notes are :"+total);
	}
}