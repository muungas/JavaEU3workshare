package assignment.day6;

public class Question7_VendingMachine {

	public static void main(String[] args) {
		
		int price, quarter, dimes, nickels;
		
		price=60;
		
		quarter=(100-price)/25;
		dimes=((100-price)%25)/10;
		nickels=(((100-price)%25)%10)/5;
		
		System.out.println("Your charge is " + quarter +" quarter, "+ dimes+" dimes, "+ nickels+" nickels." );

	}

}
