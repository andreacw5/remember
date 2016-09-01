import java.util.Scanner;

public class Scans{

	static Scanner inputer = new Scanner(System.in);
	
	public static String readLine(){

	    String input = "";
		while(input.equals(""))
		{
			input = inputer.nextLine();
		}
		return input;

	}
}
