package assignment3rdJune;

import java.util.Scanner;
public class Question8_QuantityDisCount {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter quantity of package");
		int quantity=input.nextInt();
		
		double purchase=quantity*99;
		
		if(quantity>=100)
			System.out.println("Amount without discount "+purchase+"$ \n"+ "Amount of Discount "+purchase*0.5+"$ \n"+"Amount of Purchase "+ purchase*0.5+"$" );
		else if(quantity>=50)
			System.out.println("Amount without discount "+purchase+"$ \n"+ "Amount of Discount "+purchase*0.4+"$ \n"+"Amount of Purchase "+ purchase*0.6+"$" );
		else if(quantity>=20)
			System.out.println("Amount without discount "+purchase+"$ \n"+ "Amount of Discount "+purchase*0.3+"$ \n"+"Amount of Purchase "+ purchase*0.7+"$" );
		else if(quantity>=10)
			System.out.println("Amount without discount "+purchase+"$ \n"+ "Amount of Discount "+purchase*0.2+"$ \n"+"Amount of Purchase "+ purchase*0.8+"$" );
		else
			System.out.println("Amount of Discount "+purchase*0+"$ \n"+"Amount of Purchase "+ purchase+" $" );

	}

}
