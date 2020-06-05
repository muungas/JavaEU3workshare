package assignment3rdJune;

import java.util.Scanner;

public class Question3_LeapYears {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Pease, Enter a year for checking leap year or not!");
		int leap=input.nextInt();
		
		if (leap%100==0) {
			if (leap%400==0)
				System.out.println(leap+" is a leap year.");
			else 
				System.out.println(leap+" is NOT a leap year.");
			
		}
		else if (leap%4==0) 
			System.out.println(leap+" is a leap year.");
		else
			System.out.println(leap+" is NOT a leap year.");		
		

	}

}
