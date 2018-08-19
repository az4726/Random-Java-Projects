import java.util.Scanner;

/**
 * This is used to take in an ISBN-13 number provided by the user and then
 * verify that it is an actual ISBN-13 number.
 * 
 * @author Azhar Zaman
 * @version 1.0
 *
 */
public class IsbnVerifier {

	private static String isbn;
	private static boolean authentic;
	private static Scanner scan;

	/**
	 * This method is executed first when the class is run. It gets the user input
	 * by calling the getIsbnNumber() method and validating the resulting string by
	 * calling the verifyIsbn() method. The user is then notified of the result.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		if (verifyIsbn(getIsbnNumber()) == true) {

			System.out.println("That is a valid ISBN number :)");

		} else {

			System.out.println("Not a valid ISBN number :(");

		}

	}

	/**
	 * This method is used to get an ISBN number provided by the user. It does this
	 * by reading the user input using the <code>Scanner</code> class. The input is
	 * stored as a String which is then returned.
	 * 
	 * @return isbn A String variable containing the user's input
	 */
	public static String getIsbnNumber() {

		System.out.println("Please enter a 13 digit ISBN number:");
		scan = new Scanner(System.in);
		isbn = scan.nextLine();
		return isbn;

	}

	/**
	 * This method checks whether the String that is input by the user, is a valid
	 * ISBN number. If it is valid, then the boolean <code>authentic</code> is set to
	 * true.
	 * 
	 * @param isbn
	 *            A string that is input by the user
	 * @return authentic A boolean that is set to true or false depending on the
	 *         validity of the ISBN number
	 */
	public static boolean verifyIsbn(String isbn) {

		// First the string must have a value
		if (isbn == null) {

			authentic = false;

		} else {

			// Then the hyphens are removed from the string if the user has included them
			isbn = isbn.replaceAll("-", "");

			// Then the string is checked to see whether it is 13 digits long
			if (isbn.length() != 13) {

				authentic = false;

			} else {

				/*
				 * A try catch statement is used for handling errors that may result from
				 * processing the ISBN
				 */
				try {

					/*
					 * Lines 89 to 101 calculate the checksum by multiplying each digit by 1 or 3
					 * depending on its position
					 */
					int total = 0;
					for (int m = 0; m < 12; m++) {

						int number = Integer.parseInt(isbn.substring(m, m + 1));
						total += (m % 2 == 0) ? number * 1 : number * 3;

					}
					int checkSum = 10 - (total % 10);
					if (checkSum == 10) {

						checkSum = 0;

					}
					/*
					 * The checksum is compared with the checksum shown in the ISBN to determine
					 * whether the ISBN is valid
					 */
					if (checkSum == Integer.parseInt(isbn.substring(12))) {

						authentic = true;

					} else {

						authentic = false;

					}

				} catch (NumberFormatException nfe) {

					/*
					 * If the catch block is executed then it is impossible for the ISBN number to
					 * be valid so the boolean is set to false
					 */
					authentic = false;

				}

			}
		}
		return authentic;
	}

}
