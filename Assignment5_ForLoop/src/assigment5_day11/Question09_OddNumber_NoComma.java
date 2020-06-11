package assigment5_day11;

public class Question09_OddNumber_NoComma {

	public static void main(String[] args) {
		
		int end=11;
		int i=0;
		
		while(i<=end) {
			if(i<end && i+1<end && i%2!=0) {
				System.out.print(i+", ");
			}
			else if((i==end ||i+1==end) && i%2!=0) {
				System.out.println(i);
			}
		i++;
		}
	}

}
