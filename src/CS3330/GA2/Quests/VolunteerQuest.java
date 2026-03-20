package CS3330.GA2.Quests;

import CS3330.GA2.Student;

public class VolunteerQuest extends AbstractQuest {
    private int hours;

    public VolunteerQuest(int id, String title, int basePoints, int hours) {
        super(id, title, basePoints);
        
        if (hours <= 0) {
            throw new IllegalArgumentException("Please enter a valid amount of hours");
        }
        
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public int completeFor(Student s) {
        if (isCompleted()) { //A quest cannot be completed twice
        	throw new IllegalStateException("Quest is already completed");
        }
        int points = getBasePoints() * hours;
        s.addPoints(points);
        isCompleted = true;
        return points;
    }

    public String getUniqueProperty(){
		return String.valueOf(hours);
	}
}
