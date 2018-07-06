import java.util.Scanner;

public class Division {

	double number1;
	double number2;
	double answer;

	Scanner input;

	public Division() {

		input = new Scanner(System.in);

		System.out.println("Type in the first argument");
		number1 = input.nextDouble();

		System.out.println("Type in the second argument");
		number2 = input.nextDouble();

	    answer = number1 / number2;
		System.out.println("The answer to " + number1 + " / " + number2 + " = " + answer);

	}

}
