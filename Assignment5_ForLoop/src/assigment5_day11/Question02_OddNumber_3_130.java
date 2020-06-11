package assigment5_day11;

public class Question02_OddNumber_3_130 {

	public static void main(String[] args) {
		
		for(int i=3;i<=130;i+=2)
			System.out.print(i+" ");
		
		System.out.println();
		
		for(int i=3;i<=130;i++) 
			if(i%2!=0)
				System.out.print(i+" ");
			

	}

}
