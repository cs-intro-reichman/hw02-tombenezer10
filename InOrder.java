/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int randomNumber = (int)(Math.random() * (10));
		int output = 0;

		do {
			output = randomNumber;
			System.out.println(output);
			randomNumber = (int)(Math.random() * (10));
		} while (output < randomNumber);
	}
}
