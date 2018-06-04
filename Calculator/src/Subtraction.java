import java.util.Scanner;

public class Subtraction {
	
	int number1;
	int number2;
	int answer;

	Scanner input;

	public Subtraction() {
		
		input = new Scanner(System.in);
		
		System.out.println("Type in the first argument");
		number1 = input.nextInt();
		
		System.out.println("Type in the second argument");
		number2 = input.nextInt();
		
		int answer = number1 - number2;
		System.out.println("The answer to " + number1 + " - " + number2 + " = " + answer);
		
	}

}
