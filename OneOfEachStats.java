import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed); 
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		double totalNumOfChildren = 0;
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		double average = 0;
		String common = "";

		for(int i = 0; i < T; i++){
			boolean boyBorned = false; 
			boolean girlBorned = false;
			int children = 0;
			String genders = "";
			while(!boyBorned || !girlBorned) {
				// double gender = Math.random();
				double rnd = generator.nextDouble();
				if(rnd < 0.5) {
					genders += "b ";
					boyBorned = true;
				} else {
					genders += "g ";
					girlBorned = true;
				}
				children++;
				totalNumOfChildren++;
			}

			System.out.println(genders);
			System.out.println("You made it... and you now have " + children + " children.");

			if(children == 2) {
				twoChildren++;
			} else if(children == 3) {
				threeChildren++;
			} else {
				fourOrMoreChildren++;
			}
		}
		average = totalNumOfChildren / T;

		if(twoChildren > threeChildren && twoChildren > fourOrMoreChildren) {
			common = "2";
		} else if(threeChildren > twoChildren && threeChildren > fourOrMoreChildren) {
			common = "3";
		} else {
			common = "4";
		}

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		System.out.println("The most common number of children is " + common + "."); 
	}
}
