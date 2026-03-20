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
        if (isCompleted()) {
        	return -1; //Do we need to return -1 or check for completion at all? It just says completeFor must update the completion state, so returning -1 wouldn't do that.
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