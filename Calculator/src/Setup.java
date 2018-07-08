import java.util.Scanner;

public class Setup {

	private Addition add;
	private Subtraction subtract;
	private Multiplication multiply;
	private Division divide;
	private Indice indice;
	private RadianConverter radian;
	private DegreeConverter degree;

	Scanner input;
	
	public Setup() {
		
		getOperation();
		
	}
	
	private void getOperation() {

		input = new Scanner(System.in);
		
		System.out.println("Which operation do you want to perform? [Type in the letter for the function you want to perform]");
		System.out.println("add[a]");
		System.out.println("subtract[s]");
		System.out.println("divide[d]");
		System.out.println("multiply[m]");
		System.out.println("indice[i]");
		System.out.println("radian converter[r]");
		System.out.println("degree converter[c]");
		System.out.println("EXIT[e]");
		String op = input.nextLine();
		
		switch (op) {
		case "a":
			add = new Addition();
			System.out.println("\n");
			getOperation();
			break;
		case "s":
			subtract = new Subtraction();
			System.out.println("\n");
			getOperation();
			break;
		case "m":
			multiply = new Multiplication();
			System.out.println("\n");
			getOperation();
			break;
		case "d":
			divide = new Division();
			System.out.println("\n");
			getOperation();
			break;
		case "i":
			indice = new Indice();
			System.out.println("\n");
			getOperation();
			break;
		case "r":
			radian = new RadianConverter();
			System.out.println("\n");
			getOperation();
			break;
		case "c":
			degree = new DegreeConverter();
			System.out.println("\n");
			getOperation();
			break;
		case "e":
			break;
		default:
			getOperation();
			break;
		}

		input.close();

	}
	
}
