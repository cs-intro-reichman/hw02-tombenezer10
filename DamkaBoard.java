/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		// String output = "";
		for(int i = 0; i < n; i++) {
			System.out.println();
			for(int j = 0; j < n; j++) {
				if((i % 2 == 1) && j == 0)
					System.out.print(" * ");
				else
					System.out.print("* ");
			}
		}
	}
}
