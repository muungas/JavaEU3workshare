package assignment3rdJune;

import java.util.Scanner;

public class Question9_FasrFreightShipping {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter weight of packagein pounds and miles");
		
		double pounds=input.nextDouble();
		double miles=input.nextDouble();
		double charge=0;
		
		if(pounds>10 && miles%500!=0)
			System.out.println("The shipping charge is "+((miles/500)+1)*3.8);
		else if(pounds>10)
			System.out.println("The shipping charge is "+(miles/500)*3.8);
		else if(pounds<=10 && pounds>6 && miles%500!=0)
			System.out.println("The shipping charge is "+((miles/500)+1)*3.7);
		else if(pounds<=10 && pounds>6)
			System.out.println("The shipping charge is "+(miles/500)*3.7);
		else if(pounds<=6 && pounds>2 && miles%500!=0)
			System.out.println("The shipping charge is "+((miles/500)+1)*2.2);
		else if(pounds<=6 && pounds>2)
			System.out.println("The shipping charge is "+(miles/500)*2.2);
		else if(pounds<=2 && miles%500!=0)
			System.out.println("The shipping charge is "+((miles/500)+1)*1.1);
		else if(pounds<=2)
			System.out.println("The shipping charge is "+(miles/500)*1.1);
		else
			System.out.println("Invalid");
		
		
		
		
		
		
	}

}
