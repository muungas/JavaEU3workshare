package assigment5_day11;

public class Question13_wb_chestboard {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				
				if(j%2==0 ^ i%2==0)
					System.out.print("B ");
				else
					System.out.print("W ");
				
			}
			System.out.println();
			
		}

	}

}
