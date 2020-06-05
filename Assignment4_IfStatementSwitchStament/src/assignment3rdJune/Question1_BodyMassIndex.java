package assignment3rdJune;

import java.util.Scanner;
public class Question1_BodyMassIndex {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("Please, Enter your weight in pounds!");
		float pound=input.nextFloat();
		
		
		System.out.println("Please, Enter your height in feet by a space then additional inches");
		float feet=input.nextFloat();
		float inches =input.nextFloat();
		System.out.println("Your height in pounds "+pound+"pounds.");
		System.out.println("Your weight "+feet+" feet "+inches+" inches.");
		
		float kg=(float) (pound/2.2);
		inches=inches+feet*12;
		float meter=(float) (inches*0.0254);
		
		System.out.println("Your height "+kg+" kg.");
		System.out.println("Your weight "+meter+" meter.");
		
		float bmi=kg/(meter*meter);
		System.out.println("Your BMI is "+bmi);
		
		if (bmi<18/5) {
			System.out.println("Under Weight");
			
		} 
		else if (bmi>=18.5&&bmi<25) {
			System.out.println("Normal");
			
		} 
		else if (bmi>=25 && bmi<30) {
			System.out.println("Over Weight");
			
		}
		
		else if (bmi>=30) {
			System.out.println("Obese");
			
		} else {
			System.out.println("Invalid Value");
		}
		
		
		
			
		
		
		
		
		
		
		
		
		

	}

}
