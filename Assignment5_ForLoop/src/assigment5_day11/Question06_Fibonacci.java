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
		int d=0;
		System.out.print(a+", "+b+", ");
		
		for (int i = 0; i < n; i++) {
			c=a+b;
			d=c+b;
			a=c;
			b=d;
			System.out.print(c+", "+d+", ");
			
		}

	}

}
