package lab1_day014_methods;

public class Question1_Hi {

	public static void main(String[] args) {
		
	hi("Hi", 3);	

	}
	public static void hi(String str,int num) {
		
		String stc="";
		
		for (int i = 0; i < num ; i++) {
		//	System.out.print(str);
			
			stc=stc+str;
			
		}
		System.out.println(stc);
	}
}
