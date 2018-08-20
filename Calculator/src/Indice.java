import java.util.Scanner;

/**
 * This class is used to find the answer to a number multiplied to a power
 * provided by the user
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class Indice {

	int base;
	int power;
	double answer;

	Scanner input;

	/**
	 * The constructor initialises the Scanner and uses it to read the input from
	 * the user. The calculation is performed and the answer is then returned to 
	 * the user.
	 */
	public Indice() {

		input = new Scanner(System.in);

		System.out.println("Type in the base number");
		base = input.nextInt();

		System.out.println("Type in the power");
		power = input.nextInt();

		answer = Math.pow(base, power);

		System.out.println("The answer to " + base + "^" + power + " = " + answer);

	}

}
