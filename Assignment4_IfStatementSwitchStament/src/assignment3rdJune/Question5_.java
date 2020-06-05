package assignment3rdJune;

import java.util.Scanner;

public class Question5_ {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter date in \"06 10 60 \" format");
		int mounth= input.nextInt();
		int day=input.nextInt();
		int year=input.nextInt();
		
		if (mounth>=0 && mounth<=12 && day>=0 && day<=31 && year>=00 && year<=99 ) {
			if(mounth*day==year)
				System.out.println(year+" is a Magicdate.");
			else
				System.out.println(year+" is a not Magicdate.");				
		}
		else
			System.out.println("invalid");
	}

}
