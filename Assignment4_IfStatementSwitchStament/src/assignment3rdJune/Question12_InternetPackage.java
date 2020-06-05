package assignment3rdJune;
import java.util.Scanner;
public class Question12_InternetPackage {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of hours used.");
		double hours=input.nextDouble();
		System.out.println("Enter letter of the package(A, B, C).");
		char letter=input.next().charAt(0);
		
		switch(letter) {
		
		case 'A':
			if(hours>10)
			System.out.println("Your bill of purchased A : "+(9.95+(hours-10)*2)+"$");
			else
				System.out.println("Your bill of purchased A : "+9.95+"$");
			break;
		case 'B':
			if(hours>20)
			System.out.println("Your bill of purchased B : "+(13.95+(hours-20)+"$"));
			else
				System.out.println("Your bill of purchased B : "+13.95+"$");
			break;
		case 'C':
			System.out.println("Your bill of purchased C : "+19.95+"$");
			break;
		default:
			System.out.println("Invalid input");
		
		
		}

	}

}
