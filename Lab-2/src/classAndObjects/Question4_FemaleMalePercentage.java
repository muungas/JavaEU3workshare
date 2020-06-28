package classAndObjects;
import java.util.Scanner;
public class Question4_FemaleMalePercentage {
	
	public static void main(String[] args) {
		/* Write a program that asks user for the number of males and 
		 * the number of females registered in a class. The program should 
		 * display the percentage of males and females in the class.
		 */

			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter the number females: ");
			int f=input.nextInt();
			
			System.out.print("Enter the number males: ");
			int m=input.nextInt();
			
			float fperc=(float)100*f/(m+f);
			float mperc=(float)100*m/(m+f);
			
			System.out.println("Your class consists of "+fperc+"% females and "+mperc+"% males.");
			input.close();		
		}

}
