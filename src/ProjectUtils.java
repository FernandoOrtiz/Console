import java.util.ArrayList;
import java.util.Scanner;


public class ProjectUtils {
	static int reverse=0;
	static int format=0;
	static int quadratic=0;
	static int aveg=0;
	static int stat=0;

	private static final Scanner input = new Scanner(System.in);

	public static int readInteger() { 
		// for the moment, just assume that the input is a
		// valid integer.... but eventually we want to be 
		// more robust and explicitly read and test first if
		// the input was really an integer or not....
		return input.nextInt(); 
	}

	public static void print(String s) { 
		System.out.print(s); 
	} 
	public static void println(String s) { 
		System.out.println(s); 
	}

	public static void operationsOnNumbers() {
		NumbersMenuManager numbersMenuManager = NumbersMenuManager.getInstance(); 
		numbersMenuManager.run(); 
	}

	public static void operationsOnStrings() {
		StringMenuManager stringMenuManager = StringMenuManager.getInstance(); 
		stringMenuManager.run(); 
	}

	public static void showStatistics() {
		stat++;
		System.out.println("Operation in Program          "+"Number of Times Executed");
		System.out.println("=========================   "+"   ==========================");
		System.out.println("Process Cuadratic Equation             "+quadratic+
				"\nCompute Average of Numbers             "+
				aveg+"\nReverse String                         "+reverse+
				"\nFormat String                          "+
				format+"\nShow Statistics                        "+stat);


	}

	public static void reverseAString(String value) {
		reverse++;
		System.out.println("The Reversed String is:");
		String newValue = null;
		int length = value.length();
		for(int i = length -1; i>=0 ; i--){
			newValue = ""+value.charAt(i);

			System.out.print( newValue);
		}


	}

	public static void formatAString(String pattern, String input) {
		format++;
		int i=0;
		int j=1;
		boolean active=true;
		while(active== true){
			if (pattern.substring(j-1, j).equals("x")){
				System.out.print(input.charAt(i));
				i++;
				j++;
			}
			else if(pattern.substring(j-1, j).equals("-")){
				System.out.print("-");
				j++;
			}
			if(i==input.length() || j-1==pattern.length()){
				active = false;
			}
		}
		
	}

	public static void processQuadraticEquation(double a, double b , double c) {
		quadratic++;
		double result1 = 0;
		double result2 = 0;
		if((b*b)-4*a*c >= 0){
			result1 =  (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
			result2 =  (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
			System.out.println("Your Results are:");
			System.out.println(result1);
			System.out.println(result2);
		}
		else{
			System.out.println("The Value is not a Real Number");
		}

		
	}

	public static void computeAverageOfNumbers(ArrayList list) {
		aveg++;
		double sum = 0;
		for(int i = 0; i < list.size();i++){
			double value = (double) list.get(i);
			sum = sum + value;
		}
		double result = sum/list.size();
		System.out.println("The average is: "+ result);
	}


}