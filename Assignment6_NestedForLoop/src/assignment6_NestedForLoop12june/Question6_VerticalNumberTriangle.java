package assignment6_NestedForLoop12june;

public class Question6_VerticalNumberTriangle {

	public static void main(String[] args) {
		
	
		for (int i = 1; i <= 5; i++) {
			int k=4;
			int sum=i;
			for (int j = 0; j < i; j++) {
				
			System.out.print(sum+" ");
				 sum= sum+k;
				k--;
			}
			
			System.out.println();
		}

	}

}
