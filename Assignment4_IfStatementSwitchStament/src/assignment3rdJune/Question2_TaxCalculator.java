package assignment3rdJune;

import java.util.Scanner;


public class Question2_TaxCalculator {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println(" Please, Enter your yearly income");
		
		double income=input.nextDouble();
		System.out.println("Your yearly income "+income+"$");
		
		double tax=0;
		double tax25=0;
		double tax30=0;
		double tax35=0;
		double tax40=0;
		double tax50=0;
		
		
		if (income<=150_000_000) {
			
			tax=income*0.25;
			System.out.println("The tax amount you have to pay :"+tax+"$");
		}
		
		else if (income>150_000_000 && income<=300_000_000) {
			tax25= (150_000_000*0.25);
			tax30=((income-150_000_000)*0.35);
			tax=tax25+tax30;
			System.out.println("The tax amount you have to pay :"+tax+"$");
			
			
			
		}
		
		else if (income>300_000_000 && income<=600_000_000) {
			tax25=(float) (150_000_000*0.25);
			tax30=(float) (150_000_000*0.3);			
			tax35=(float) ((income-300_000_000)*0.35);
			tax=tax25+tax30+tax35;
			System.out.println("The tax amount you have to pay :"+tax+"$");
			
		}
		
		
		else if (income>600_000_000 && income<=1_200_000_000) {
			tax25=(float) (150_000_000*0.25);
			tax30=(float) (150_000_000*0.3);
			tax35=(float) (300_000_000*0.35);			
			tax40=(float) ((income-600_000_000)*0.4);
			tax=tax25+tax30+tax35+tax40;
			System.out.println("The tax amount you have to pay :"+tax+"$");
			
		}
		
		
		else if (income>1_200_000_000) {
			tax25= (150_000_000*0.25);
			tax30= (150_000_000*0.3);
			tax35= (300_000_000*0.35);
			tax40=(300_000_000*0.4);			
			tax50= ((income-1_200_000_000)*0.5);
			tax=tax25+tax30+tax35+tax40+tax50;
			System.out.println("The tax amount you have to pay :"+tax+"$");
				
		}
		
		else {
			System.out.println("invalid");
		}
		
		
		
		
		

	}

}
