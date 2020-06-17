package lab1_day014_methods;

public class Question3_special11 {

	public static void main(String[] args) {
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
	}
	public static void specialEleven(int num) {
		if(num%11==0 || (num+1)%11==0 || (num-1)%11==0)
			System.out.println(num+" is special > "+true);
		else
			System.out.println(num+" is special > "+false);
	}
}

