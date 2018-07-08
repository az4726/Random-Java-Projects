import java.util.Scanner;

public class Indice {

	int base;
	int power;
	double answer;

	Scanner input;

	public Indice() {

		input = new Scanner(System.in);

		System.out.println("Type in the base number");
		base = input.nextInt();

		System.out.println("Type in the power");
		power = input.nextInt();

		answer = Math.pow(base, power);
		
		System.out.println("The answer to " + base + "^" + power + " = " + answer);

	}

}
