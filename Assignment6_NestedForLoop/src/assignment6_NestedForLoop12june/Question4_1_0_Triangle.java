package assignment6_NestedForLoop12june;

public class Question4_1_0_Triangle {

	public static void main(String[] args) {
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				if(j%2==0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}

	}

}
