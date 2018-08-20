import java.util.Scanner;

/**
 * This class is used to convert an angle in degree form into an angle in
 * radians form
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class DegreeConverter {

	double degree;
	double radianAnswer;

	Scanner input;

	/**
	 * The constructor initialises the Scanner and uses it to read the input from
	 * the user. The calculation is performed and the answer is then returned to 
	 * the user.
	 */
	public DegreeConverter() {

		input = new Scanner(System.in);

		System.out.println("Type in the angle you want to convert to radians");
		degree = input.nextDouble();

		radianAnswer = Math.toRadians(degree);

		System.out.println(degree + " converted to radian form is " + radianAnswer);

	}

}
