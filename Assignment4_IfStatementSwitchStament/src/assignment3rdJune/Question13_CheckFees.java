package assignment3rdJune;
import java.util.Scanner;
public class Question13_CheckFees {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of checks pre month");
		double checks=input.nextDouble();
		
		if(checks>=60)
			System.out.println("The bank's service fees for month: "+(10+checks*0.04)+"$");
		else if(checks>=40)
			System.out.println("The bank's service fees for month: "+(10+checks*0.06)+"$");
		else if(checks>=20)
			System.out.println("The bank's service fees for month: "+(10+checks*0.08)+"$");
		else if(checks<20)
			System.out.println("The bank's service fees for month: "+(10+checks*0.1)+"$");
		else
			System.out.println("Invalid");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
