import java.util.Scanner;

public class Setup {

	private Addition add;
	private Subtraction subtract;
	private Multiplication multiply;
	private Division divide;
	private Indice indice;

	Scanner input;
	
	public Setup() {
		
		getOperation();
		
	}
	
	private void getOperation() {

		input = new Scanner(System.in);
		
		System.out.println("Which operation do you want to perform? (add[+],subtract[-], multiply[*], divide[/], indice[^])");
		String op = input.nextLine();
		
		switch (op) {
		case "+":
			add = new Addition();
			break;
		case "-":
			subtract = new Subtraction();
			break;
		case "*":
			multiply = new Multiplication();
			break;
		case "/":
			divide = new Division();
			break;
		case "^":
			indice = new Indice();
			break;
		default:
			getOperation();
			break;
		}

		input.close();

	}
	
	public void anotherOperation() {
		
		
		
	}
	
}
