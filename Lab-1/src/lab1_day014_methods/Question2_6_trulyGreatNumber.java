package lab1_day014_methods;

public class Question2_6_trulyGreatNumber {

	public static void main(String[] args) {
		
	greatNumber(6,4);
	greatNumber(4,5);
	greatNumber(1,5);
	greatNumber(12,6);

	}
	public static void greatNumber(int num1,int num2) {
		
		if(num1==6 || num2==6)
			System.out.println("love6("+num1+","+num2+")> "+true);
		else if(num1+num2==6||num1-num2==6||num2-num1==6)
			System.out.println("love6("+num1+","+num2+")> "+true);
		else
			System.out.println("love6("+num1+","+num2+")> "+false);
		
	}
}
