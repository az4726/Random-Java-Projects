import java.util.Scanner;

/**
 * This class reads the user's input and converts their sentence into an Acronym
 * to make it easier to remember.
 * 
 * @author Azhar Zaman
 * @version 1.0
 *
 */
public class AcronymCreator {

	private static String userSentence; // Used to store the user's input
	private static String acronym; // Used to store the acronym
	private static Scanner scan; // Used to read user's input

	/**
	 * As the main method is the first method executed in the program, it is used to
	 * call the <code>createAcronym</code> method, which takes in the String
	 * function <code>getUserInput</code> as a parameter.
	 */
	public static void main(String[] args) {

		createAcronym(getUserInput());
	}

	/**
	 * This method uses the <code>Scanner</code> class to read user input and store
	 * it in the <code>userSentence</code> variable.
	 * 
	 * @return userSentence This returns the user input as a String
	 */
	public static String getUserInput() {

		System.out.println("Please type in a sentence that you want an Acronym for...");
		scan = new Scanner(System.in);
		userSentence = scan.nextLine();
		return userSentence;

	}

	/**
	 * This method is used to find the acronym of the user input. First all the
	 * initials are extracted for each word in the sentence. The acronym variable
	 * may contain the characters "null" which is checked and removed. Then the
	 * acronym is printed to the user.
	 * 
	 * @param sentence	This is the String that is input by the user
	 */
	public static void createAcronym(String sentence) {

		String[] tokens = sentence.split("[\\s']");
		/*
		 * A for loop is used to go through the String variable that stores the user
		 * input and extract the initials.
		 */
		for (String s : tokens) {
			acronym += s.charAt(0);
		}
		if (acronym.contains("null")) {
			// Only the acronym is stored in the variable
			acronym = acronym.substring(4, acronym.length());
		}
		System.out.println("Your acronym is: " + acronym);

	}

}
