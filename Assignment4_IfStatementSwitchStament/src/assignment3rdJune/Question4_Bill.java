package assignment3rdJune;

import java.util.Scanner;
	
public class Question4_Bill {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your calls in minute");
		int calls=input.nextInt();
		
		System.out.println("You have "+calls+" calls.");
		
		float bill=200f;
		float bill100=200f;
		float bill150=(float) (bill100 + 50*0.60);
		float bill200=(float) (bill150 + 50*0.50);
		
		if (calls<=100)
			bill=200f;
		else if (calls>100 && calls<=150)
			bill=(float) (bill100+(calls-100)*0.6);
		else if(calls>150 && calls<=200)
			bill=(float) (bill150+(calls-150)*0.5);
		else if(calls>200)
			bill=(float) (bill200+(calls-200)*0.4);
		else System.out.println("invalid");
		System.out.println("Your bill is "+ bill+"$");
		
		
			
		

	}

}
