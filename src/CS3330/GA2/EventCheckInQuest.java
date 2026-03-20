package CS3330.GA2;

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

    @Override
    public int completeFor(Student s) {
        if (isCompleted()) { //A quest cannot be completed twice
        	throw new IllegalStateException("Quest is already completed");
        }
        int points = getBasePoints();
        s.addPoints(points);
        return points;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getBasePoints() + ", " + eventName + ", " + isCompleted();
    }
}