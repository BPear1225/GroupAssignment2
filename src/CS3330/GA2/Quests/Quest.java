package CS3330.GA2.Quests;

import CS3330.GA2.Student;

public interface Quest {
	int getId();
	String getTitle();
	int getBasePoints();
	boolean isCompleted();
	int completeFor(Student s);
	
}
