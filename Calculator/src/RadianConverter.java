import java.util.Scanner;

public class RadianConverter {
	
	double radian;
	double degreeAnswer;
	
	Scanner input;
	
	public RadianConverter() {
		
		input = new Scanner(System.in);

		System.out.println("Type in the angle you want to convert to degrees");
		radian = input.nextDouble();
			
		degreeAnswer = Math.toDegrees(radian);
			
		System.out.println(radian + " converted to degree form is " + degreeAnswer);
		
	}

}
