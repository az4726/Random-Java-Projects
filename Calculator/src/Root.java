import java.util.Scanner;

/**
 * This class is used to work out the square root of a number provided by the
 * user
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class Root {

	double base;
	double answer;

	Scanner input;

	/**
	 * The constructor initialises the Scanner and uses it to read the input from
	 * the user. The calculation is performed and the answer is then returned to 
	 * the user.
	 */
	public Root() {

		input = new Scanner(System.in);

		System.out.println("Type in the base number");
		base = input.nextInt();

		answer = Math.sqrt(base);

		System.out.println("The answer to the square root of" + base + " = " + answer);

	}

}
