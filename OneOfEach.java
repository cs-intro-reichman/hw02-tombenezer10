
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
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
		}

		System.out.println(genders);
		System.out.println("You made it... and you now have " + children + " children.");
	}
}
