import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		
		final double FACTOR = 9.0/5.0; 
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		int celsius = in.nextInt();
		double fahrenheit = celsius*FACTOR+32.0;
		System.out.print(celsius + " C = " + fahrenheit + " F");
	}

}
