import java.util.Scanner;

/**
 * This class is used to subtract two numbers provided by the user
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class Subtraction {
	
	double number1;
	double number2;
	double answer;

	Scanner input;

	/**
	 * The constructor initialises the Scanner and uses it to read the input from
	 * the user. The calculation is performed and the answer is then returned to 
	 * the user.
	 */
	public Subtraction() {
		
		input = new Scanner(System.in);
		
		System.out.println("Type in the first argument");
		number1 = input.nextDouble();
		
		System.out.println("Type in the second argument");
		number2 = input.nextDouble();
		
		answer = number1 - number2;
		System.out.println("The answer to " + number1 + " - " + number2 + " = " + answer);
		
	}

}
