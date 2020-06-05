package assignment3rdJune;
import java.util.Scanner;
public class Question14_BookSsellersAwards {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter purchased book.");
		int book=input.nextInt();
		int earn=0;
		
		switch(book)
		{
		case 0:
			earn=0;
			break;
		case 1:
			earn=5;
			break;
		case 2:
			earn=15;
			break;
		case 3:
			earn=30;
			break;
		default :
			earn=60;
			break;
		}
		System.out.println("Your points: "+earn);
	}

}
