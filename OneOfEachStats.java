import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed); 

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
			
			while(!boyBorned || !girlBorned) {
				double rnd = generator.nextDouble();
				if(rnd < 0.5) {
					boyBorned = true;
				} else {
					girlBorned = true;
				}
				children++;
				totalNumOfChildren++;
			}

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
