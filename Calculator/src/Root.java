import java.util.Scanner;

public class Root {
	
	double base;
	double answer;

	Scanner input;
	
	public Root() {

		input = new Scanner(System.in);

		System.out.println("Type in the base number");
		base = input.nextInt();
			
		answer = Math.sqrt(base);
			
		System.out.println("The answer to the square root of" + base + " = " + answer);
		
	}

}
