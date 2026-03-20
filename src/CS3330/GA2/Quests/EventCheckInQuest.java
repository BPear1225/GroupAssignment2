package CS3330.GA2.Quests;

import CS3330.GA2.Student;

public class EventCheckInQuest extends AbstractQuest {
    private String eventName;

    public EventCheckInQuest(int id, String title, int basePoints, String eventName) {
        super(id, title, basePoints);
        
        if (eventName == null || eventName.isBlank()) {
            throw new IllegalArgumentException("Please enter a valid event.");
        }
        
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public int completeFor(Student s) {
        if (isCompleted()) { //A quest cannot be completed twice
        	throw new IllegalStateException("Quest is already completed");
        }
        int points = getBasePoints();
        s.addPoints(points);
        isCompleted = true;
        return points;
    }
    
    public String getUniqueProperty(){
    	return eventName;
    }
    
}