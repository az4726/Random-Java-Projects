import java.util.Scanner;

/**
 * This class is used to convert an angle in radian form into an angle in
 * degree form
 * 
 * @author Azhar Zaman
 * @version 1.0
 */
public class RadianConverter {
	
	double radian;
	double degreeAnswer;
	
	Scanner input;
	
	/**
	 * The constructor initialises the Scanner and uses it to read the input from
	 * the user. The calculation is performed and the answer is then returned to 
	 * the user.
	 */
	public RadianConverter() {
		
		input = new Scanner(System.in);

		System.out.println("Type in the angle you want to convert to degrees");
		radian = input.nextDouble();
			
		degreeAnswer = Math.toDegrees(radian);
			
		System.out.println(radian + " converted to degree form is " + degreeAnswer);
		
	}

}
