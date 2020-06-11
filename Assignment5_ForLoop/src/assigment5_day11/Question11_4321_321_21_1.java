package assigment5_day11;

public class Question11_4321_321_21_1 {

	public static void main(String[] args) {
		
		int k=1;
		for (int i = 4; i >= 1; i--) {
			
			for (int j = i; j >= 1; j--) {
				System.out.print(j+" ");
				 
			}
		
			System.out.println();
			
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
				
			}
			k++;
			
		}

	}

}
