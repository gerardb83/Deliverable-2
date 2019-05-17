import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String userString1 = "";
		String userString2 = "";
		String unicodeTmp = "";
		char charString1;
		int unicodeStr1Total = 0;
		int unicodeStr2Total = 0;
		int absoluteDifference = 0;

		System.out.println("This program will return the absolute difference of unicode values for any two strings.");
		System.out.println("\nPlease enter a string: ");
		userString1 = input.nextLine();
		System.out.println("Please enter a second string: ");
		userString2 = input.nextLine();

		// Loop gathers String1 chars and converts to Unicode
		for (int i = 0; i < userString1.length(); i++) {
			charString1 = (userString1.charAt(i));
			unicodeTmp = Integer.toHexString(charString1);
			Integer result = Integer.parseInt(unicodeTmp, 16); // Converts hexadecimal to base 10
			System.out.println("" + userString1.charAt(i) + ": " + result);
			unicodeStr1Total += result;
		}

		// Loop gathers String2 chars and converts to Unicode
		for (int i = 0; i < userString2.length(); i++) {
			charString1 = (userString2.charAt(i));
			unicodeTmp = Integer.toHexString(charString1);
			Integer result = Integer.parseInt(unicodeTmp, 16);
			System.out.println("" + userString2.charAt(i) + ": " + result);
			unicodeStr2Total += result;
		}

		// Absolute difference of unicodeStrTotals is computed and output
		absoluteDifference = Math.abs(unicodeStr1Total - unicodeStr2Total);
		System.out.println("\nDifference (as absolute value): " + absoluteDifference);

		input.close();
	}
}
