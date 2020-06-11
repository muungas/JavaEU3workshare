package assigment5_day11;
import java.util.Scanner;
public class Question08_SumNumber {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter upper bound");
		int upperBound=input.nextInt();
		
		int i=1;
		int sum=0;
		while(i<=upperBound) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);

	}

}
