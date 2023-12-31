/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);

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
				double gender = Math.random();
				if(gender < 0.5) {
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
