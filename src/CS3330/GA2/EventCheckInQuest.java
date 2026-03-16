package CS3330.GA2;

public class EventCheckInQuest extends AbstractQuest {
    private String eventName;

    public EventCheckInQuest(int id, String title, int basePoints, String eventName) {
        super(id, title, basePoints);
        if (eventName == null || eventName.isBlank()) {
            throw new IllegalArgumentException("eventName must not be null or blank");
        }
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public int completeFor(Student s) {
        isCompleted();
        int points = getBasePoints();
        s.addPoints(points);
        return points;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getBasePoints() + ", " + eventName + ", " + isCompleted();
    }
}