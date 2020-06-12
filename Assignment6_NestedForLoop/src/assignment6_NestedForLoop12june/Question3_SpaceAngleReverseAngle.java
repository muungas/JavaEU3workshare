package assignment6_NestedForLoop12june;

public class Question3_SpaceAngleReverseAngle {

	public static void main(String[] args) {
		
		for (int i = 7; i >=1; i--) {
			
			for (int j = 1; j <=(7-i); j++) {
				System.out.print(" ");
				
			}
			
			for (int j = (8-i); j <=7; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
//System.out.println("---------------------");

for (int i = 6; i >=1; i--) {
	
	for (int j = 1; j <(i); j++) {
		System.out.print(" ");
		
	}
	
	for (int j = 7; j >=i; j--) {
		System.out.print((i-j+7)+" ");
		
	}
	System.out.println();
}

	}

}
