import java.util.Scanner;

public class Convert_II {
	
	public static void main(String[] args) {
		
		final int SEC_PER_MIN = 60;
		final int SEC_PER_HOUR = 3600;
		
		Scanner in = new Scanner(System.in);
		System.out.print("enter in seconds: ");
		int sec = in.nextInt();
		
		int SECONDS_LEFTOVER = sec;
		int HOURS = sec/SEC_PER_HOUR;
		SECONDS_LEFTOVER = sec%SEC_PER_HOUR;
		int MINUTES = SECONDS_LEFTOVER/SEC_PER_MIN;
		int SECONDS = sec%SEC_PER_MIN;
		
		
		System.out.print(sec + " seconds = " + HOURS + " hours, " + MINUTES + " minutes, " + SECONDS + " seconds");
	
	}
}
