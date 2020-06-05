package assignment3rdJune;
import java.util.Scanner;

public class Question11_SoundSpeed {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter one of \"air\", \"water\", \"stell\".");
		String type=input.nextLine();
		
		System.out.println("Enter distance in feet.");
		int distance=input.nextInt();
		
		
		switch (type) {
		
		case "air":
			System.out.println("The amount of time in second:"+distance/1100);
			break;
			
		case "water":
			System.out.println("The amount of time in second:"+distance/4900);
			break;
			
		case "steel":
			System.out.println("The amount of time in second:"+distance/16400);
			break;
			
		default:
			System.out.println("Invalid (Enter one of \"air\", \"water\", \"stell\".)");
		}
		
		
		

	}

}
