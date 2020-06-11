package assigment5_day11;
import java.util.Scanner;
public class Question04_MultipliedBy10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=input.nextInt();
		
		while(number*10<=100)
		{			
			number*=10	;
		}
		System.out.println(number);
	}

}
