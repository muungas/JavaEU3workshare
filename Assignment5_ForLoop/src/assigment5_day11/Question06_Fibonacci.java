package assigment5_day11;
import java.util.Scanner;

public class Question06_Fibonacci {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to print Fibonacci series of it");
		int n=input.nextInt();
		
		int a=0;
		int b=1;
		int c=0;
		
		System.out.print(a+", "+b+", ");
		
		for (int i = 0; i <(n-2); i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+", ");
			}

	}

}
