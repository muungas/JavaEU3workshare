package classAndObjects;
import java.util.Scanner;
public class Question1_LargestSmalestNumber {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=input.nextInt();
		int smallest=num, largest=num;
		
		do {
			System.out.print("Enter another number: ");
			num=input.nextInt();
			if(num>largest) {
				largest=num;
			}else if(num<smallest){
				smallest=num;
			}
			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			int yesNo=input.nextByte();
			if(yesNo==0) {
				System.out.println("The smallest number you entered : " + smallest);
				System.out.println("The largest number you entered  : " + largest);
				break;
			}
		}while(true);
		input.close();
	}
}
