package assignment3rdJune;

import java.util.Scanner;

public class Question6_massWeight {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your mass in kg");
		int mass=input.nextInt();
		double weight=mass*9.8;
		
		if (weight>1000)
			System.out.println(weight+" N (too heavy weight)");
		else if(weight<10)
			System.out.println(weight+" N (too lightweight)");
		else
			System.out.println(weight+" N ");
			}

}
