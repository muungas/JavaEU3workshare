package lab1_day014_methods;

public class Question5_caughtSpeeding {

	public static void main(String[] args) {
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);

	}
	public static void caughtSpeeding(int speed,boolean birthday) {
		
		if(birthday==true) {
			if(speed<=65)
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+0);
			else if(speed<=85)
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+1);
			else
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+2);
		}
		else {
			if(speed<=60)
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+0);
			else if(speed<=80)
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+1);
			else
				System.out.println("caughtSpeeding("+speed+","+birthday+")->"+2);
			
		}
	}
}
