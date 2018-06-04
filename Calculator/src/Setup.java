import java.util.Scanner;

public class Setup {

	private Addition add;
	private Subtraction subtract;
	private Multiplication multiply;
	private Division divide;

	private int number1;
	private int number2;

	Scanner input;
	
	public Setup() {
		
		/*
		 * 1)Title output DONE
		 * 2)Which operation
		 * 3)Numbers
		 * 4)Pass them to the correct class which calculates and outputs result
		 * 5)Do you want to calculate something else?
		 */
		
		getOperation();
		
	}
	
	private void getOperation() {

		input = new Scanner(System.in);
		System.out.println("Which operation do you want to perform?");
		String op = input.nextLine();
		
		switch (op) {
		case "add":
			add = new Addition();
			System.out.println("add");
			break;
		case "subtract":
			subtract = new Subtraction();
			break;
		case "multiply":
			multiply = new Multiplication();
			break;
		case "divide":
			divide = new Division();
			break;
		default:

			break;
		}

		input.close();

	}
	
}