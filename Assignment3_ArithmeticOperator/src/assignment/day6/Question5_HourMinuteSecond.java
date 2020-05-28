package assignment.day6;

public class Question5_HourMinuteSecond {

	public static void main(String[] args) {
		int inputSecond,hour,minute,second;
		
		inputSecond=3695;
		
		hour=inputSecond/3600;
		minute=(inputSecond%3600)/60;
		second=inputSecond%60;
		
		System.out.println(hour+" hours,"+minute+" minute, "+second+" seconds.");
	}
}
