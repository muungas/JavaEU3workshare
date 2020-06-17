package lab1_day014_methods;

public class Question6_Cigar {

	public static void main(String[] args) {
		 cigarParty(30,false);
		 cigarParty(50,false);
		 cigarParty(70,true);

	}
	public static void cigarParty(int cigar,boolean weekend) {
		if(weekend) {
			if(cigar>=40)
				System.out.println(true);
			else
				System.out.println(false);
		}else if(cigar>=40 && cigar<=60 )
			System.out.println(true);
		else
			System.out.println(false);
	}
}
