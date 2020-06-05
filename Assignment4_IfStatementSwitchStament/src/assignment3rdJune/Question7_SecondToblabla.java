package assignment3rdJune;

import java.util.Scanner;

public class Question7_SecondToblabla {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any seconds");
		int second=input.nextInt();
		if (second>=86400)
			System.out.println("It's "+second/86400+" days.");
		else if (second>=3600)
			System.out.println("It's "+second/3600+" hours.");
		else if (second>=60)
			System.out.println("It's "+second/60+" minutes.");
		else
			System.out.println("It's "+second+" seconds.");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
