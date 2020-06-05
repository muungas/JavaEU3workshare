package assignment3rdJune;

import java.util.Scanner;

public class Question10_CaloriFatGram {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter total calori and fat in gram.");
		double calori=input.nextDouble();
		double fatgram=input.nextDouble();
		
		double fatcalories=fatgram*9;
		
		if ((fatcalories/calori)<=0.3)
			System.out.println("The percentage of calories came from fat " +(fatcalories/calori)*100 + "%. The food is low fat");
		else if ((fatcalories/calori)<=1)
			System.out.println("The percentage of calories came from fat " +(fatcalories/calori)*100 + "%.");
		else
			System.out.println("Invalid (The total calories can not be smaller than calories from fat.)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
