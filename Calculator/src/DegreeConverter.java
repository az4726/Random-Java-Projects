import java.util.Scanner;

public class DegreeConverter {
	
	double degree;
	double radianAnswer;
	
	Scanner input;
	
	public DegreeConverter() {
		
		input = new Scanner(System.in);

		System.out.println("Type in the angle you want to convert to radians");
		degree = input.nextDouble();
			
		radianAnswer = Math.toRadians(degree);
			
		System.out.println(degree + " converted to radian form is " + radianAnswer);
		
	}

}
