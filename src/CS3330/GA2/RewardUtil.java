package CS3330.GA2;

import java.util.List;

public class RewardUtil<T> {
<<<<<<< HEAD
	
	public static <T> void printAll(List<T> items) {
		if (items == null) {
			throw new IllegalArgumentException("Please enter a valid list.");
		}
		
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).toString());
		}
	}
	
	public static int sumPoints(List<? extends Student> students) { //read only
		int totalPoints = 0;
		for (int i = 0; i < students.size(); i++) {
			totalPoints += students.get(i).getPoints();
		}
		
		return totalPoints;
=======
	public static <T> void printAll(List <T> items) {
>>>>>>> branch 'main' of git@github.com:BPear1225/GroupAssignment2.git
	}
}
