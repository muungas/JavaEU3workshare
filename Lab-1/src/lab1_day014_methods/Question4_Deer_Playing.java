package lab1_day014_methods;

public class Question4_Deer_Playing {

	public static void main(String[] args) {
		
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true);

	}
	public static void deerPlay(int temp,boolean summer) {
		if (summer==true) {
			if(temp<=100 && temp>=70)
				System.out.println("deerPlay("+temp+","+summer+");->"+true);
		}else if(temp<=90 && temp>=70)
			System.out.println("deerPlay("+temp+","+summer+");->"+true);
		else
			System.out.println("deerPlay("+temp+","+summer+");->"+false);
		
	}
}
